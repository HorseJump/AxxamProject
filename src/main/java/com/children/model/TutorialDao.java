package com.children.model;

import java.util.List;

public interface TutorialDao {
	
	public void saveTutorialToDatabase(Tutorial tutorial);
	
	public void saveTopicToDatabase(Topic topic);
	
	public List<Topic> getAllTopics();
	
	public List<Subtopic> getRelatedSubtopics(Long topicId);
	
	public Tutorial getAllTutorials();

}
