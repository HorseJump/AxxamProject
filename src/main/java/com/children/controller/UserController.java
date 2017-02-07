package com.children.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("currentUser")
public class UserController {
	
	@RequestMapping(path="/", method=RequestMethod.GET)
	String goToHomePage() {
		return "home";
	}
	
	@RequestMapping(path="/AdminLogin", method=RequestMethod.GET)
	String goToAdminLoginPage() {
		return "adminLogin";
	}
	
	@RequestMapping(path="/AdminLogin", method=RequestMethod.POST)
	String goToAdminDashboard(HttpSession session, ModelMap model,
			@RequestParam String adminUsername, @RequestParam String adminPassword) {
		
		return "adminDashboard";
	}

}
