package com.regms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.regms.VO.Employee;
import com.regms.VO.Users;
@Service
public class LoginService {
	@Autowired
	RestTemplate restTemplate;
	

	public Users checkValidUser(final String emailId) {
		/*
		 * Users user=new Users(); user.setEmailid(emailId);
		 */
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> httpEntity = new HttpEntity<>(emailId, headers);
		Users user=restTemplate.postForObject("http://operations-service/checkLogin",httpEntity,Users.class);
		return user;
	}
	
	public boolean saveUser(Users user) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<Users> httpEntity = new HttpEntity<>(user, headers);
		boolean saveStatus=restTemplate.postForObject("http://operations-service/registerUser",httpEntity,boolean.class);
		return saveStatus;
	}
	
	public Employee saveEmployee(Employee employee) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<Employee> httpEntity = new HttpEntity<>(employee, headers);
		Employee emp=restTemplate.postForObject("http://employee-service/saveEmp",httpEntity,Employee.class);
		return emp;
	}
	
	public List<Employee> getListOfEmployee(int userid){
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<Integer> httpEntity = new HttpEntity<>(userid, headers);
		List<Employee> empLst=restTemplate.postForObject("http://employee-service/getAllEmpByUser",httpEntity,List.class);
		return empLst;
	}
	
	public boolean deleteEmployee(Integer employeeId) {
		try {
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			HttpEntity<Integer> httpEntity = new HttpEntity<>(employeeId, headers);
			boolean status=restTemplate.postForObject("http://employee-service/delete",httpEntity,boolean.class);
		return status;
		}catch(Exception e) {
			return false;
		}
		
	}
	
	public Employee getEmployee(Integer employeeId) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<Integer> httpEntity = new HttpEntity<>(employeeId, headers);
		Employee employee=restTemplate.postForObject("http://employee-service/getEmp",httpEntity,Employee.class);
		return employee;
	}
	
	public Employee updateEmployee(Employee employee) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<Employee> httpEntity = new HttpEntity<>(employee, headers);
		Employee emp=restTemplate.postForObject("http://employee-service/updateEmp",httpEntity,Employee.class);
		return emp;
	}
}
