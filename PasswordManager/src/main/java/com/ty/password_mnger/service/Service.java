package com.ty.password_mnger.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.ty.password_mnger.dao.UserDao;
import com.ty.password_mnger.dto.User;

@org.springframework.stereotype.Service
public class Service
{
	@Autowired
	UserDao dao;
	
	public User saveUser(User user)
	{
		dao.saveUser(user);
		return user;
	}
}
