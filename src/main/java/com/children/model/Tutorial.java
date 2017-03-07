package com.children.model;

public class Tutorial {
	
	private Long tutorialId;
	private String tutorialName;
	private String tutorialContent;
	private Long topicId;
	private Long subtopicId;
	
	public Long getTutorialId() {
		return tutorialId;
	}

	public void setTutorialId(Long tutorialId) {
		this.tutorialId = tutorialId;
	}

	public String getTutorialName() {
		return tutorialName;
	}

	public void setTutorialName(String tutorialName) {
		this.tutorialName = tutorialName;
	}

	public String getTutorialContent() {
		return tutorialContent;
	}

	public void setTutorialContent(String tutorialContent) {
		this.tutorialContent = tutorialContent;
	}

	public Long getTopicId() {
		return topicId;
	}

	public void setTopicId(Long topicId) {
		this.topicId = topicId;
	}

	public Long getSubtopicId() {
		return subtopicId;
	}

	public void setSubtopicId(Long subtopicId) {
		this.subtopicId = subtopicId;
	}

}
