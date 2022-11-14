package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping("/hi")
	public String home() {
		return "home";
	}
	
	
	@RequestMapping(value = "/showLogin",method=RequestMethod.GET)
	public String showLoginPage() {
		return "login";
	}
	
	@RequestMapping(value = "/login",method=RequestMethod.POST)
	public ModelAndView loginValidation(
			@RequestParam("username") String username,
			@RequestParam("password") String password) {
		ModelAndView modelview=new ModelAndView();
		if(username.equals(password)) {
			modelview.addObject("uname", username);
			modelview.setViewName("success");
			
		}else {
			modelview.addObject("error", "Invalid username/password");
			modelview.setViewName("login");
		
		}
		return modelview;
	}
	
	
}
