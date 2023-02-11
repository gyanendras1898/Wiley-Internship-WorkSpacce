package com.gyan.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gyan.beans.User;
import com.gyan.model.service.UserLoginService;

@Controller
public class LoginController {
	@Autowired
	private UserLoginService userLoginService;

	@RequestMapping("/")
	public ModelAndView loginPage() {
		return new ModelAndView("login");
	}
	
	@RequestMapping("/login")
	public ModelAndView authenticate(HttpServletRequest request) {
		String username = request.getParameter("uname");
		String password = request.getParameter("pass");
		System.out.println(username);
		User user = new User(username, password);
		String message ="Error";
		if(userLoginService.login(user))
			message = "Login Successfull !";
		else	message = "Login Failed !";
		
		return new ModelAndView("output","message",message);	
	}
}
