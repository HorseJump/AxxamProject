package com.children.model;

public class Tutorial {
	
	private Long tutorialId;
	private String tutorialName;
	private String tutorialDescription;
	
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

	public String getTutorialDescription() {
		return tutorialDescription;
	}

	public void setTutorialDescription(String tutorialDescription) {
		this.tutorialDescription = tutorialDescription;
	}

	public Tutorial(Long tutorialId, String tutorialName, String tutorialDescription) {
		this.tutorialId = tutorialId;
		this.tutorialName = tutorialName;
		this.tutorialDescription = tutorialDescription;
	}

}
