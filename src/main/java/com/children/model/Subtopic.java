package com.children.model;

public class Subtopic {
	
	private Long subtopicId;
	private String subtopicName;
	private String subtopicDescription;
	
	public Subtopic(Long subtopicId, String subtopicName, String subtopicDescription) {
		this.subtopicId = subtopicId;
		this.subtopicName = subtopicName;
		this.subtopicDescription = subtopicDescription;
	}

	public Long getSubtopicId() {
		return subtopicId;
	}

	public void setSubtopicId(Long subtopicId) {
		this.subtopicId = subtopicId;
	}

	public String getSubtopicName() {
		return subtopicName;
	}

	public void setSubtopicName(String subtopicName) {
		this.subtopicName = subtopicName;
	}

	public String getSubtopicDescription() {
		return subtopicDescription;
	}

	public void setSubtopicDescription(String subtopicDescription) {
		this.subtopicDescription = subtopicDescription;
	}
}
