package com.ty.password_mnger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.password_mnger.dao.UserDao;
import com.ty.password_mnger.dto.UserSocial;

@Service
public class StudentService {

	@Autowired
	UserDao dao;
	
	
	public void saveUserSocial(UserSocial userSocial) {
		dao.saveUserSocial(userSocial);
		
	}
	
}
