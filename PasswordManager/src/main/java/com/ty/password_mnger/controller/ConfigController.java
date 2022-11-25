package com.ty.password_mnger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.ty.password_mnger.dto.UserSocial;
import com.ty.password_mnger.service.UserService;

import com.ty.password_mnger.dto.User;


@Controller
public class ConfigController 
{
	@Autowired
	UserService userService;
	
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
		userService.saveUser(user);
		modelAndView.setViewName("login.jsp");
		return modelAndView;
	}	


	@RequestMapping("addusercredentials")
	public ModelAndView getuserCredential(UserSocial usersocial) {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.addObject("usersocial",new UserSocial());
			modelAndView.setViewName("addusercredentials.jsp");
			
			return modelAndView;
	}
	
	
	@RequestMapping("saveusersocial")
	public ModelAndView savesocial(@ModelAttribute UserSocial usersocial) {
		ModelAndView modelAndView = new ModelAndView();
		userService.saveUserSocial(usersocial);
		modelAndView.setViewName("index.jsp");
		modelAndView.addObject("usersocial",new UserSocial());
		
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
		
		User user1 = userService.getUserByEmail(user);
		System.out.println(user1.getEmail());
		System.out.println(user1.getPassword());
		if (user1 != null) {
			modelAndView.setViewName("view.jsp");
		} else {
			modelAndView.setViewName("login.jsp");
		}
		return modelAndView;
	}

}
