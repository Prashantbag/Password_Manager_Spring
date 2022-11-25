package com.ty.password_mnger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ty.password_mnger.dto.User;


@Controller
public class ConfigController 
{
	Service service;
	
	@Autowired
	@RequestMapping("signup")
	public ModelAndView signUp()
	{
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("signup.jsp");
		modelAndView.addObject("user",new User());
		return modelAndView;
	}	
	@RequestMapping("saveuser")
	public ModelAndView saveUser(@ModelAttribute User user)
	{
		ModelAndView modelAndView=new ModelAndView();
		service.saveUser(user);
		modelAndView.setViewName("login.jsp");
		return modelAndView;
	}	


	
	

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
