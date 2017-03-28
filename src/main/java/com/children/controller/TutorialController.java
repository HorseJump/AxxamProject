package com.children.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
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
	
	public boolean sessionIsValid(HttpSession session) {
		if(session.getAttribute("currentUser") != null) {
			return true;
		} else {
			return false;
		}
	}
	
	@RequestMapping(path="/CreateNewTopic", method=RequestMethod.GET)
	public String createNewTopic(HttpSession session, ModelMap model) {
		if(sessionIsValid(session)) {
			return "createNewTopic";
		} else {
			return "redirect:/AdminLogin";
		}
	}
	
	@RequestMapping(path="/CreateTutorial", method=RequestMethod.GET)
	public String createTutorial(HttpSession session, ModelMap model) {
		if(sessionIsValid(session)) {
			ArrayList<Topic> topics = (ArrayList<Topic>) tutorialDao.getAllTopics();
			model.put("topics", topics);
			return "createTutorial";
		} else {
			return "redirect:/AdminLogin";
		}
	}
	
	@RequestMapping(path="/CreateTutorial", method=RequestMethod.POST)
	public String viewSelectedTutorial(HttpSession session, Tutorial tutorial) {
		return "viewTutorial";
	}
	
	@RequestMapping(path="/getSubtopics", method=RequestMethod.POST)
	public @ResponseBody
	ArrayList<Subtopic> getSubtopics(HttpSession session, 
			@RequestParam Long topicId) {
		ArrayList<Subtopic> subtopics = (ArrayList<Subtopic>) tutorialDao.getRelatedSubtopics(topicId);
		return subtopics;
	}
	
	@RequestMapping(path="/saveTutorial", method=RequestMethod.POST)
	public String saveTutorial(HttpSession session, Tutorial tutorial) {
		tutorialDao.saveTutorialToDatabase(tutorial);
		return "redirect:/AdminDashboard";
	}
	
	@RequestMapping(path="/TutorialDashboard", method=RequestMethod.GET)
	public String tutorialDashboard() {
		
		return "tutorialDashboard";
	}
	
	@RequestMapping(path="/ViewTutorial", method=RequestMethod.GET)
	public String viewTutorial(Tutorial tutorial) {
		
		return "redirect:/AdminDashboard";
	}

}
