package com.children.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	
	@RequestMapping(path="/", method=RequestMethod.GET)
	String goToHomePage() {
		return "home";
	}
	
	@RequestMapping(path="/AdminLogin", method=RequestMethod.GET)
	String index() {
		return "adminLogin";
	}

}
