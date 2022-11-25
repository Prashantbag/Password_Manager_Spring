package com.ty.password_mnger.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ty.password_mnger.dao.UserDao;
import com.ty.password_mnger.dto.User;

@org.springframework.stereotype.Service

public class Service {
	@Autowired
	UserDao dao;

	public User saveUser(User user) {
		return dao.saveUser(user);
	}

	public User getUserByEmail(User user) {
		User recuser = dao.getUserbyEmail(user.getEmail());
		if (user.getPassword().equals(recuser.getPassword())) {
			return recuser;
		} else {
			return null;
		}
	}

	public List<User> getAllUser() {
		return dao.getAllUsers();
	}
}
