package com.eatm.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eatm.Address;
import com.eatm.Attendance;
import com.eatm.Employee;
import com.eatm.Task;
import com.eatm.Dao.AttendanceDao;
import com.eatm.Dao.EmployeeDao;
import com.eatm.Dao.TaskDao;
import com.eatm.dto.AddressDto;
import com.eatm.dto.EmployeeDto;
import com.eatm.dto.TaskDto;
import com.eatm.util.EmployeeMapper;
import com.eatm.util.TaskMapper;

import jakarta.servlet.http.HttpSession;

@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	EmployeeMapper employeeMapper;

	@Autowired
	TaskMapper taskMapper;

	@Autowired
	TaskDao taskDao;

	@Autowired
	EmployeeDao employeeDao;

	@Autowired
	AttendanceDao attendanceDao;

	@Autowired
	HttpSession session;

	@Override
	public String registerManager(EmployeeDto employeeDto, AddressDto addressDto) {
		// TODO Auto-generated method stub

		// set add to emp
		// save both obj

		// convert dto to entity

		Employee employee = employeeMapper.convertEmployeeDtoToEntity(employeeDto);
		Address address = employeeMapper.convertAddressDtoToEntity(addressDto);

		employee.setAddress(address);
		employee.setRole("Manager");
		employeeDao.saveEmployee(employee);
		return "success.jsp";
	}

	@Autowired
	Attendance attendance;

	private Object entityMapper;

	@Override
	public String loginEmployee(String email, String password) {
		Employee employee = employeeDao.findByEmailAndPassword(email, password);

		if (employee != null) {

			Attendance attendance = new Attendance();
			// create attendance object map , save it and map it to employee
			attendanceDao.saveAttendance(attendance);

			// get old list of attendance
			List<Attendance> lists = employee.getAttendences();

			// if old list list not there ,create new list

			if (lists == null) {
				lists = new ArrayList<Attendance>();
			}
			// add current attendance obj to the list
			lists.add(attendance);

			// set back list to employee
			employee.setAttendences(lists);

			// update employee
			employeeDao.updateEmployee(employee);

			session.setAttribute("employeeId", employee.getEmployeeId());
			session.setAttribute("attendanceId", attendance.getAttendenceId());
			session.setAttribute("role", employee.getRole());

			if ("Manager".equals(employee.getRole())) {
				return "manager.jsp";
			} else if ("Developer".equals(employee.getRole())) {
				return "developer.jsp";
			} else {
				return "success.jsp"; // fallback for other roles
			}
		} else {
			return "login.jsp"; // invalid login
		}
	}

	@Override
	public String addDeveloper(EmployeeDto employeeDto, AddressDto addressDto) {

		Employee employee = employeeMapper.convertEmployeeDtoToEntity(employeeDto);
		Address address = employeeMapper.convertAddressDtoToEntity(addressDto);

		employee.setAddress(address);
		employee.setRole("Developer");
		employeeDao.saveEmployee(employee);
		return "success.jsp";
	}

	@Override
	public String createTask(TaskDto taskDto) {

		Task task = taskMapper.convertTaskDtoToEntity(taskDto);
		task.setStatus("Created"); //
		taskDao.saveTask(task);

		return "success.jsp";

	}

	@Override
	public String assignTask(int employeeId, int taskId) {

		Employee employee = employeeDao.findEmployeeById(employeeId);
		Task task = taskDao.findTaskById(taskId);

		if (employee == null || task == null) {
			return "failure.jsp";
		}

		List<Task> tasks = employee.getTasks();
		if (tasks == null) {
			tasks = new ArrayList<Task>();
		}

		task.setStatus("Assigned");
		tasks.add(task);

		employee.setTasks(tasks);
		employeeDao.updateEmployee(employee);

		return "success.jsp";
	}

	@Override
	public String deleteEmployee(int employeeId) {

		Employee employee = employeeDao.findEmployeeById(employeeId);

		if (employee == null) {
			return "failure.jsp";
		}

		List<Task> tasks = employee.getTasks();

		for (Task task : tasks) {
			if (!task.getStatus().equals("Complete")) {
				return "failure.jsp";
			}
		}

		employee.setTasks(null);
		employeeDao.deleteEmployee(employeeId);
		// employeeDao.deleteEmployee(employeeId);

		return "success.jsp";
	}

	@Override
	public String findAllDevelopr() {

		List<Employee> employees = employeeDao.findAllDevelopr();
		session.setAttribute("Developers", employees);
		session.setAttribute("entityMapper", entityMapper);
		return "viewAllDeveloper.jsp";
	}

	// Task Operations

	@Override
	public String deletetask(int taskId) {

		Task task = taskDao.findTaskById(taskId);
		if (task == null) {
			return "failure.jsp";
		}
		taskDao.deletetask(taskId);
		return "success.jsp";
	}

	// Logout
	@Override
	public String logoutEmployee() {

		Integer attendanceId = (Integer) session.getAttribute("attendanceId");

		if (attendanceId == null) {
			return "failure.jsp";
		}

		Attendance attendance = attendanceDao.findAttendance(attendanceId);

		// Check attendance and login time
		if (attendance == null || attendance.getLoginTime() == null) {
			return "failure.jsp";
		}
		if (attendance.getLogoutTime() != null) {
			return "login.jsp";
		}

		attendance.setLogoutTime(LocalDateTime.now());

		attendanceDao.updateAttendance(attendance);

		session.invalidate();

		return "login.jsp";
	}

	// forgot password
	@Override
	public String forgotPassword(String email, String password) {
		Employee employee = employeeDao.findByEmail(email);

		if (employee != null) {
			employee.setPassword(password);
			employeeDao.updateEmployee(employee);

			return "success.jsp";
		}

		return "failure.jsp";
	}

	// developer part

	// update details

	@Override
	public String updateDeveloperName(int employeeId, String employeeName) {

		Employee employee = employeeDao.findEmployeeById(employeeId);

		if (employee == null) {
			return "failure.jsp";
		}

		employee.setEmployeeName(employeeName);

		employeeDao.updateEmployee(employee);

		return "success.jsp";
	}

	@Override
	public String updateDeveloperEmail(int employeeId, String email) {

		Employee employee = employeeDao.findEmployeeById(employeeId);

		if (employee == null) {
			return "failure.jsp";
		}

		employee.setEmail(email);

		employeeDao.updateEmployee(employee);

		return "success.jsp";
	}
	// update Status

	@Override
	public String updateTaskStatus(int taskId, String status) {

		Task task = taskDao.findTaskById(taskId);

		if (task == null) {
			return "failure.jsp";
		}

		task.setStatus(status);
		taskDao.updateTask(task);

		return "success.jsp";

	}

	@Override
	public String viewAllTask(int employeeID) {

		Employee emp = employeeDao.findEmployeeById(employeeID);

		if (emp == null) {
			session.setAttribute("error", "Employee not found with ID: " + employeeID);
			return "viewAllTask.jsp";
		}

		session.setAttribute("Employee", emp);

		return "viewAllTask.jsp";
	}
}
