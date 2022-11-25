package com.ty.password_mnger.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ty.password_mnger.dao.UserDao;
import com.ty.password_mnger.dto.User;
import com.ty.password_mnger.dto.UserSocial;

@org.springframework.stereotype.Service

public class UserService {
	@Autowired
	UserDao dao;

	public User saveUser(User user) {
		return dao.saveUser(user);
	}
	public void saveUserSocial(UserSocial userSocial) {
		dao.saveUserSocial(userSocial);
		
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
