package com.regdbms.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.regdbms.DAO.UsersRepository;
import com.regdbms.VO.Users;

@Service
public class UsersService {

	@Autowired
	UsersRepository usersRepository;
	
	public Users findUserByUNamePwd(String emailId) {
		return usersRepository.findByEmailid(emailId);
	}
@Transactional
	public boolean saveUser(Users user) {
		//usersRepository.
		/*if(null!=usersRepository.findUserByUNamePwd(user.getUserName(), user.getPassword()))
		{
			return false;
		}else {*/
	usersRepository.save(user);
			//usersRepository.saveAndFlush(new Users("Ashish","password","ashish@xyz.com"));
			return true;
		//}
	}
}
