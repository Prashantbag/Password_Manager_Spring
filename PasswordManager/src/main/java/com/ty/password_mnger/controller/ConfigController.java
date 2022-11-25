package com.ty.password_mnger.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ty.dto.Student;
import com.ty.password_mnger.dto.User;

@Repository
public class ConfigController {

	@Autowired
	Service service;
	
	

	@RequestMapping("delete")
	public void deletesuser(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		service.servicedelete(Integer.parseInt(request.getParameter("id")));
		RequestDispatcher dispatcher = request.getRequestDispatcher("RUKMESH");//add
		dispatcher.forward(request, response);
	}

	@RequestMapping("updateuser")
	public void updateuser(@ModelAttribute User user, HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		ModelAndView modelAndView = new ModelAndView();
		service.serviceupdate(user);
		RequestDispatcher dispatcher = req.getRequestDispatcher("RUKMESH");//add
		dispatcher.forward(req, res);
	}
	
	@RequestMapping("social")
	public ModelAndView editstudent(@RequestParam int id) {
		User user = service.servicefindstubyid(id);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("user", user);
		return modelAndView;
	}
	
}
