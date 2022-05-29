package com.empms.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empms.VO.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
public List<Employee> findAllByUserid(int userid);
}
