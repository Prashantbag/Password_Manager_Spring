package com.ty.password_mnger.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ty.password_mnger.dto.User;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ty.password_mnger.dto.UserSocial;

import com.ty.password_mnger.service.UserService;

@Controller
public class ConfigController {

	@Autowired
	UserService userService;

	@RequestMapping("delete")
	public void deletesuser(@RequestParam int id, HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		userService.servicedelete(id);
		RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
		dispatcher.forward(req, res);
	}

	@RequestMapping("updateuser")
	public void updateuser(@ModelAttribute User user, HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		ModelAndView modelAndView = new ModelAndView();
		userService.serviceupdate(user);
		RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
		dispatcher.forward(req, res);
	}

	@RequestMapping("edit")
	public ModelAndView editstudent(@RequestParam int id) {
		User user = userService.servicefindstubyid(id);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("user", user);
		modelAndView.setViewName("edit.jsp");
		return modelAndView;
	}

	@RequestMapping("signup")
	public ModelAndView signUp() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("signup.jsp");
		modelAndView.addObject("user", new User());
		return modelAndView;
	}

	@RequestMapping("userlogin")
	public ModelAndView saveUser(@ModelAttribute User user) {
		ModelAndView modelAndView = new ModelAndView();
		System.out.println(user.getEmail());
		userService.saveUser(user);
		System.out.println(user.getName());
		modelAndView.setViewName("login.jsp");
		return modelAndView;
	}

	@RequestMapping("addusercredentials")
	public ModelAndView getuserCredential(UserSocial usersocial, User user) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("usersocial", new UserSocial());
		modelAndView.setViewName("addusercredentials.jsp");

		return modelAndView;
	}

	@RequestMapping("user-profile-view")
	public ModelAndView savesocial(@ModelAttribute UserSocial usersocial, HttpServletRequest req,
			HttpServletResponse res) {
		HttpSession session = req.getSession();
		ModelAndView modelAndView = new ModelAndView();
		userService.saveUserSocial(usersocial);
		User user = (User) session.getAttribute("loggeduser");
		user.setUsersocial(usersocial);
		userService.updateUserSocialDetail(user);
		modelAndView.setViewName("socialview.jsp");
		modelAndView.addObject("usersocial", new UserSocial());
		User receiveduser = (User) user;
		req.setAttribute("user1", receiveduser);
		return modelAndView;
	}

	@RequestMapping("login")
	public ModelAndView login() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("user", new User());
		modelAndView.setViewName("login.jsp");

		return modelAndView;
	}

	@RequestMapping("add-credentials")
	public void loginUser(User user, HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		HttpSession session = req.getSession();
		User loggeduser = userService.getUserByEmail(user);
		if (loggeduser != null) {
			session.setAttribute("loggeduser", loggeduser);
			RequestDispatcher dispatcher = req.getRequestDispatcher("addusercredentials");
			dispatcher.forward(req, res);
		} else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("login");
			dispatcher.forward(req, res);
		}

	}
	
	@RequestMapping("adminlogin")
	public ModelAndView adminLogin()
	{
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("admin", new User());
		modelAndView.setViewName("adminlogin.jsp");
		
		return modelAndView;
	}
	
	@RequestMapping("checkadmin")
	public ModelAndView checkAdmin(@ModelAttribute User admin)
	{
		ModelAndView modelAndView=new ModelAndView();
		String adminEmail="admin@gmail.com";
		String adminPassword="admin@123";
		if(admin.getEmail().equals(adminEmail) && admin.getPassword().equals(adminPassword))
		{
			List<User> users=userService.getAllUser();
			for (User user : users)
			{
				System.out.println(user.getId());
				System.out.println(user.getName());
				System.out.println(user.getUsersocial().getFacebookPassword());
			}
			modelAndView.addObject("users", users);
			modelAndView.setViewName("viewadmin.jsp");
		}
		else
		{
			modelAndView.setViewName("index.jsp");
		}
		return modelAndView;
	}
}