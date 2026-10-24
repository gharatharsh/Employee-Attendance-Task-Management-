package com.eatm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.eatm.Employee;
import com.eatm.dto.AddressDto;
import com.eatm.dto.EmployeeDto;
import com.eatm.dto.TaskDto;
import com.eatm.service.IEmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	IEmployeeService employeeService;

	@RequestMapping("/registerManager")
	public String registerManager(@ModelAttribute EmployeeDto employeeDto, @ModelAttribute AddressDto addressDto) {
		return employeeService.registerManager(employeeDto, addressDto);
	}

	@RequestMapping("/loginEmployee")
	public String loginEmployee(@RequestParam("email") String email, @RequestParam("password") String password) {

		return employeeService.loginEmployee(email, password);
	}

	@RequestMapping("/addDeveloper")
	public String addDeveloper(@ModelAttribute EmployeeDto employeeDto, @ModelAttribute AddressDto addressDto) {
		return employeeService.addDeveloper(employeeDto, addressDto);
	}

	@RequestMapping("/createTask")
	public String createTask(@ModelAttribute TaskDto taskDto) {
		return employeeService.createTask(taskDto);
	}

	@RequestMapping("/assignTask")
	public String assignTask(@RequestParam("employeeId") int employeeId, @RequestParam("taskId") int taskId) {
		return employeeService.assignTask(employeeId, taskId);
	}

	@RequestMapping("/deleteDeveloper")
	public String deleteEmployee(@RequestParam("employeeId") int employeeId) {
		return employeeService.deleteEmployee(employeeId);
	}

	@RequestMapping("/viewAllDeveloper")
	public String findAllDevelopr() {
		return employeeService.findAllDevelopr();
	}

	@RequestMapping("/deleteTask")
	public String deleteTask(@RequestParam("taskId") int taskId) {
		return employeeService.deletetask(taskId);
	}

	@RequestMapping("/logoutEmployee")
	public String logout() {
		return employeeService.logoutEmployee();
	}

	@RequestMapping("/ForgotPassword")
	public String forgotPassword(@RequestParam("email") String email, @RequestParam("password") String password) {
		return employeeService.forgotPassword(email, password);
	}

	@RequestMapping("/UpdateDeveloperName")
	public String updateDeveloperName(@RequestParam("employeeId") int employeeId,
			@RequestParam("employeeName") String employeeName) {
		return employeeService.updateDeveloperName(employeeId, employeeName);
	}

	@RequestMapping("/UpdateDeveloperEmail")
	public String updateDeveloperEmail(@RequestParam("employeeId") int employeeId,
			@RequestParam("email") String email) {
		return employeeService.updateDeveloperEmail(employeeId, email);
	}

	@RequestMapping("/updateTaskStatus")
	public String updateTaskStatus(@RequestParam("taskId") int taskId, @RequestParam("status") String status) {
		return employeeService.updateTaskStatus(taskId, status);
	}

	@RequestMapping("/viewAllTask")
	public String viewAllTask(@RequestParam("employeeID") int employeeID) {
	    return employeeService.viewAllTask(employeeID);
	}
}
