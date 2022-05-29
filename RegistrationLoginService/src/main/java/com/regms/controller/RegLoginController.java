package com.regms.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.regms.VO.Employee;
import com.regms.VO.Users;
import com.regms.service.LoginService;

@Controller
public class RegLoginController {
@Autowired
LoginService loginService;
	@RequestMapping("/")
	public String getMessage() {
		return "home";
	}
	
	@RequestMapping("/login")
	public String loginUser(@RequestParam("userName") String emailId,@RequestParam("password") String password,Model model,HttpSession session)
	{
		Users user=loginService.checkValidUser(emailId);
		if(null!=user) {
		model.addAttribute("userName",user.getUserName());
		session.setAttribute("user", user);
		return "welcome";
		}else {
			model.addAttribute("error","Invalid credentials!!");
			return "home";
		}
	}
	
	@RequestMapping("/register")
	public String register() {
		return "register";
	}
	@RequestMapping("/registerUser")
	public String registerUser(@RequestParam("userName") String userName,@RequestParam("password") String password,@RequestParam("password1") String retypepassword,@RequestParam("emailId") String email,Model model) {
		
		  if(!password.equals(retypepassword)) {
		  model.addAttribute("error","Pasword Not same !!"); return "register"; }
		  else {
		  Users user=new Users();
		  user.setPassword(password);user.setUserName(userName);user.setEmailid(email);
		  boolean saveStatus=loginService.saveUser(user); if(saveStatus) {
		  model.addAttribute("regSucc","User registered successfully"); }else {
		  model.addAttribute("regError","Error in registration"); return "register"; }
		  }
		 
		return "home";
	}
	/*
	 * @RequestMapping("/test") public String test(HttpSession session,Model model)
	 * { Users user=(Users) session.getAttribute("user");
	 * System.out.println(""+user.getEmailid());
	 * model.addAttribute("email",user.getEmailid()); return "test"; }
	 */
	
	@RequestMapping("/addEmployee")
	public String addEmployee() {
		return "addEmployee";		
	}
	@RequestMapping("/saveEmployee")
	public String saveEmployee(@RequestParam("empName") String empName,@RequestParam("experience") int experience,@RequestParam("skills") String skills,HttpSession session,Model model) {
		Employee emp=new Employee();
		emp.setEmpName(empName);emp.setExperience(experience);emp.setSkills(skills);
		 Users user=(Users) session.getAttribute("user");
		 emp.setUserid(user.getUserid());
		 if(null!=loginService.saveEmployee(emp))
		 {
			 model.addAttribute("successMsg","Employee Added Successfully!!!");
		 }else {
			 model.addAttribute("errorMsg","Error in adding employee!!!");
		 }
		return "addEmployee";		
	}
	@RequestMapping("/viewEmployee")
	public String viewEmployee(HttpSession session,Model model) {
		Users user=(Users) session.getAttribute("user");
		List<Employee> empList=loginService.getListOfEmployee(user.getUserid());
		model.addAttribute("empLst",empList);
		return "viewEmployee";		
	}
	@RequestMapping("/updateEmployee")
	public String updateEmployee(HttpSession session,Model model) {
		Users user=(Users) session.getAttribute("user");
		List<Employee> empList=loginService.getListOfEmployee(user.getUserid());
		model.addAttribute("empLst",empList);
		return "updateEmployee";		
	}
	@RequestMapping("/deleteEmployee")
	public String deleteEmployee(HttpSession session,Model model) {
		Users user=(Users) session.getAttribute("user");
		List<Employee> empList=loginService.getListOfEmployee(user.getUserid());
		model.addAttribute("empLst",empList);
		return "deleteEmployee";		
	}
	@RequestMapping("/deleteEmp/{id}")
	public String deleteEmployeeEmpId(@PathVariable int id,HttpSession session,Model model) {
		
		  boolean status=loginService.deleteEmployee(id); if(status) {
		  model.addAttribute("successMsg","Employee deleted successfully"); }else {
		  model.addAttribute("errorMsg","Error in deleting employee"); }
		 
		return "redirect:/viewEmployee";	
	}
	@RequestMapping(value="/updateEmp/{id}",method=RequestMethod.GET)
	public String updateEmp(@PathVariable int id,HttpSession session,Model model) {
		
		model.addAttribute("id",id);
		Users user=(Users) session.getAttribute("user");
		//List<Employee> empList=loginService.getListOfEmployee(user.getUserid());
		//Employee emp=empList.stream().filter(employee->id==employee.getEmpId()).findAny().orElse(null);
		/*
		 * for(Employee emp:empList) { if(emp.getEmpId()==id) {
		 * model.addAttribute("employee",emp); break; } }
		 */
		model.addAttribute("employee",loginService.getEmployee(id));
		 
		return "updateEmp";	
	}
	
	
	@RequestMapping(value="/updateEmp/{id}",method=RequestMethod.POST)
	public String updateEmpPost(@PathVariable int id,HttpSession session,Model model,@ModelAttribute("employee") Employee employee) {
		
		model.addAttribute("id",id);
		employee.setEmpId(id);
		Users user=(Users) session.getAttribute("user");
		employee.setUserid(user.getUserid());
		loginService.updateEmployee(employee);
		 
		return "redirect:/viewEmployee";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("user");
		session.invalidate();
		return "home";
	}
	@RequestMapping("/employeeMgmt")
	public String employeeMgmt() {
		return "empMgmt";
	}
	@RequestMapping("/manageProfile")
	public String manageProfile(HttpSession session,Model model) {
		Users user=(Users) session.getAttribute("user");
		model.addAttribute("userDtls",user);
		model.addAttribute("userName",user.getUserName());
		return "manageProfile";
	}
	@RequestMapping("/resetPwd")
	public String resetPwd() {
		return "resetPwd";
	}
	
	@RequestMapping("/updateUser")
	public String updateUser(@RequestParam("userName") String userName,HttpSession session,Model model) {
		Users user=(Users) session.getAttribute("user");
		user.setUserName(userName);
		model.addAttribute("userDtls",user);
		model.addAttribute("userName",user.getUserName());
		
		if(loginService.saveUser(user)) {
			  model.addAttribute("regSucc","User updated successfully"); }else {
			  model.addAttribute("regError","Error in updating user");  }
		return "manageProfile";
	}
	
	@RequestMapping("/resetPassword")
	public String resetPassword(@RequestParam("oldPwd") String oldPwd,@RequestParam("newPwd") String newPwd,@RequestParam("retypeNewPwd") String retypeNewPwd,
			HttpSession session,Model model) {
		Users user=(Users) session.getAttribute("user");
		if(oldPwd.equalsIgnoreCase(newPwd)) {
			model.addAttribute("error","Old password and new Password are same");
		}else if(!user.getPassword().equalsIgnoreCase(oldPwd)) {
			model.addAttribute("error", "Old password incorrect .Please enter correct password");
		}else if(!newPwd.equalsIgnoreCase(retypeNewPwd)) {
			model.addAttribute("error", "Retype the new password,New password and Retype password not matches");
		}else {
			user.setPassword(newPwd);
			boolean status=loginService.saveUser(user);
			if(status) {
				model.addAttribute("succ","Password reseted successfully!!");
			}else {
				model.addAttribute("error", "Error in reset password");
			}
		}
		return "resetPwd";
	}
}
