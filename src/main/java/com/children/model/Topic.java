package com.children.model;

public class Topic {
	
	private Long topicId;
	private String topicName;
	private String topicDescription;
	
	public Topic(String topicName, String topicDescription) {
		this.topicName = topicName;
		this.topicDescription = topicDescription;
	}

	public String getTopicDescription() {
		return topicDescription;
	}

	public void setTopicDescription(String topicDescription) {
		this.topicDescription = topicDescription;
	}

	public Long getTopicId() {
		return topicId;
	}

	public void setTopicId(Long topicId) {
		this.topicId = topicId;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	

}
