package com.children.model;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class JdbcTutorialDao implements TutorialDao{
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public JdbcTutorialDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Topic> getAllTopics() {
		String sqlGetAllTopics = "Select topic_id, topic_name, topic_description From topics;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetAllTopics);
		ArrayList<Topic> topics = new ArrayList<>();
		while(results.next()) {
			Topic topic = new Topic(results.getString("topic_name"), results.getString("topic_description"));
			topic.setTopicId(results.getLong("topic_id"));
			topics.add(topic);
		}
		return topics;
	}
	
	@Override
	public void saveTopicToDatabase(Topic topic) {
		String sqlSearchForTopic = "SELECT topic_id From topics Where topic_name = ?;";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSearchForTopic, topic.getTopicName());
		if(!results.next()) {
			String sqlInsertTopic = "Insert Into topic (topic_name, topic_description) Values (?, ?);";
			jdbcTemplate.update(sqlInsertTopic, topic.getTopicName(), topic.getTopicDescription());
		}
	}

	//@Override
	public void saveTutorialToDatabase() {
		
	}

}