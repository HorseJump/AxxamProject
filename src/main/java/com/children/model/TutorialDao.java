package com.children.model;

import java.util.List;

public interface TutorialDao {
	
	public void saveTutorialToDatabase();
	
	public void saveTopicToDatabase(Topic topic);
	
	public List<Topic> getAllTopics();

}
