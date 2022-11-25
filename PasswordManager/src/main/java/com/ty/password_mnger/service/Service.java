package com.ty.password_mnger.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

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
	
}
