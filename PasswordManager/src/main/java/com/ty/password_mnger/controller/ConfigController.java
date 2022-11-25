package com.ty.password_mnger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ty.password_mnger.dto.UserSocial;
import com.ty.password_mnger.service.StudentService;

@Controller
public class ConfigController {
	
	@Autowired
	StudentService studentService;

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
		studentService.saveUserSocial(usersocial);
		modelAndView.setViewName("index.jsp");
		modelAndView.addObject("usersocial",new UserSocial());
		
		return modelAndView;
	}
	
	
	
	
}
