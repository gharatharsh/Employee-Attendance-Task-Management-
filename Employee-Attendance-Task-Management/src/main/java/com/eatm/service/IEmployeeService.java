package com.eatm.service;

import java.util.List;

import com.eatm.Employee;
import com.eatm.dto.AddressDto;
import com.eatm.dto.EmployeeDto;
import com.eatm.dto.TaskDto;

public interface IEmployeeService {

	public String registerManager(EmployeeDto employeeDto, AddressDto addressDto);

	String loginEmployee(String email, String password);

	public String addDeveloper(EmployeeDto employeeDto, AddressDto addressDto);

	String createTask(TaskDto taskDto);

	public String assignTask(int employeeId, int taskId);

	public String deleteEmployee(int employeeId);

	public String findAllDevelopr();

	// for task

	public String deletetask(int taskId);

	public String logoutEmployee();

	public String forgotPassword(String email, String password);

	public String updateDeveloperName(int employeeId, String employeeName);

	public String updateDeveloperEmail(int employeeId, String email);
	
	// task
	
	public String updateTaskStatus(int taskId,String status);
	
	public String viewAllTask(int employeeID);
	
}
