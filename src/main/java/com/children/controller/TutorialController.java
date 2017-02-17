package com.children.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.children.model.AdminDao;
import com.children.model.Subtopic;
import com.children.model.Topic;
import com.children.model.Tutorial;
import com.children.model.TutorialDao;

@Controller
@SessionAttributes("currentUser")
public class TutorialController {
	
	private AdminDao adminDao;
	private TutorialDao tutorialDao;

	@Autowired
	public TutorialController(AdminDao adminDao, TutorialDao tutorialDao) {
		this.adminDao = adminDao;
		this.tutorialDao = tutorialDao;
	}
	
	@RequestMapping(path="/CreateNewTopic", method=RequestMethod.GET)
	public String createNewTopic(HttpSession session, ModelMap model) {
		if(session.getAttribute("currentUser") != null) {
			ArrayList<Topic> topics = (ArrayList<Topic>) tutorialDao.getAllTopics();
			model.put("topics", topics);
			return "createNewTopic";
		} else {
			return "redirect:/AdminLogin";
		}
	}
	
	@RequestMapping(path="/CreateTutorial", method=RequestMethod.GET)
	public String createTutorial(HttpSession session) {
		if(session.getAttribute("currentUser") != null) {
			return "createTutorial";
		} else {
			return "redirect:/AdminLogin";
		}
	}
	
	@RequestMapping(path="/CreateTutorial", method=RequestMethod.POST)
	public String viewSelectedTutorial(HttpSession session, 
			Topic topic,
			Subtopic subtopic, 
			Tutorial tutorial) {
		
		
		return "viewTutorial";
	}

}
