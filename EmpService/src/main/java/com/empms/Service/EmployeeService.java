package com.empms.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empms.DAO.EmployeeRepository;
import com.empms.VO.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository empRepo;
	
	
	public Employee saveEmp(Employee emp)
	{
		return empRepo.save(emp);
	}
	
	
	public List<Employee> getListOfEmployee(int userId)
	{
		return empRepo.findAllByUserid(userId);
	}
	
	public boolean deleteEmployee(Integer employeeId) {
		try {
			empRepo.deleteById(employeeId);
			return true;
		}catch(Exception e) {
			return false;
		}
	}


	public Employee getEmp(Integer employeeId) {
		// TODO Auto-generated method stub
		Optional<Employee>  emp= empRepo.findById(employeeId);
		if(emp.isPresent()) {
			return emp.get();
		}
		return null;
	}
}
