package com.ty.password_mnger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ty.password_mnger.dto.User;
import com.ty.password_mnger.service.Service;

@Controller
public class ConfigController 
{
	@Autowired
	Service service;

	@RequestMapping("login")
	public ModelAndView login() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("user", new User());
		modelAndView.setViewName("login.jsp");

		return modelAndView;
	}

	@RequestMapping("loginuser")
	public ModelAndView loginUser(@ModelAttribute User user) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("user", new User());
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
		User user1 = service.getUserByEmail(user);
		if (user1 != null) {
			modelAndView.setViewName("view.jsp");
		} else {
			modelAndView.setViewName("login.jsp");
		}
		return modelAndView;
	}

}
