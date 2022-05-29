package com.regdbms.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.regdbms.VO.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {

	Users findByEmailid(String emailid);
}

