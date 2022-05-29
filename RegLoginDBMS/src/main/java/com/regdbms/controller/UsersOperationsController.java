package com.regdbms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.regdbms.VO.Users;
import com.regdbms.service.UsersService;

@RestController
public class UsersOperationsController {
	@Autowired
	UsersService usersService;

		@PostMapping("/checkLogin")
		public Users checkLogin(@RequestBody String emailId) {
			Users user1=usersService.findUserByUNamePwd(emailId);
			if(null!= user1)
					{
				return user1;
					}
			else
				return null;
		}
		
		@PostMapping("/registerUser")
		public boolean registerUser(@RequestBody Users user) {
			System.out.println("registerUser"+user.getUserName());
			  try { 
				  boolean saveStatus=usersService.saveUser(user); 
				  return saveStatus;
			  }catch(Exception e) { 
				  System.out.println("Error in saving user"+e); 
				  return false;
				  }
			 
		
		}
		
		@GetMapping("/test")
		public String test() {
			return "Hello";
		}
}
