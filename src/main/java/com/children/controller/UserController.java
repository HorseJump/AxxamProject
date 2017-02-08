package com.children.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.children.model.AdminDao;
import com.children.model.AdminUser;

@Controller
@SessionAttributes("currentUser")
public class UserController {
	
	private AdminDao adminDao;

	@Autowired
	public UserController(AdminDao adminDao) {
		this.adminDao = adminDao;
	}
	
	@RequestMapping(path="/", method=RequestMethod.GET)
	public String goToHomePage() {
		return "home";
	}
	
	@RequestMapping(path="/AdminLogin", method=RequestMethod.GET)
	public String goToAdminLoginPage() {
		return "adminLogin";
	}
	
	@RequestMapping(path="/AdminLogin", method=RequestMethod.POST)
	public String loginAdmin(HttpSession session, ModelMap model,
			@RequestParam String adminUsername, @RequestParam String adminPassword) {
		
		boolean isValidAdminLogin = adminDao.confirmAdminLogin(adminUsername, adminPassword);
		if(isValidAdminLogin) {
			//session.invalidate();
			session.setAttribute("currentUser", adminUsername);
			return "redirect:/AdminDashboard";
		} else {
			return "redirect:/AdminLogin";
		}
	}
	
	@RequestMapping(path="/AdminDashboard", method=RequestMethod.GET)
	public String goToAdminDashboard(HttpSession session) {
		if(session.getAttribute("currentUser") == null) {
			return "redirect:/AdminLogin";
		} else {
			return "adminDashboard";
		}
	}

}
