package com.ty.password_mnger.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.ty.password_mnger.dao.UserDao;
import com.ty.password_mnger.dto.User;

@org.springframework.stereotype.Service
public class Service {

	@Autowired
	UserDao dao;
	
	public void servicedelete(int id) {
		dao.delete(id);
	}
	
	public void  serviceupdate(User user) {
		dao.update(user);
	}
	
	public User servicefindstubyid(int id) {
		User user =dao.findbyid(id);
		return user;
	}
}
