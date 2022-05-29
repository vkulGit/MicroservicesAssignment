package com.empms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.empms.Service.EmployeeService;
import com.empms.VO.Employee;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService empService;
	
	@PostMapping("/saveEmp")
	public Employee saveEmp(@RequestBody Employee emp)
	{
		return empService.saveEmp(emp);
	}
	
	@PostMapping("/getAllEmpByUser")
	public List<Employee> getListOfEmployee(@RequestBody int userId)
	{
		return empService.getListOfEmployee(userId);
	}
	
	@PostMapping("/delete")
	public boolean deleteEmployee(@RequestBody Integer employeeId) {
		return empService.deleteEmployee(employeeId);
	}
	
	@PostMapping("/getEmp")
	public Employee getEmp(@RequestBody Integer employeeId)
	{
		return empService.getEmp(employeeId);
	}
	
	@PostMapping("/updateEmp")
	public Employee updateEmp(@RequestBody Employee emp)
	{
		return empService.saveEmp(emp);
	}
}
