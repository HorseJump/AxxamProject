package com.children.model;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class JdbcAdminDao implements AdminDao {
	
private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public JdbcAdminDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public boolean confirmAdminLogin(String username, String password) {
		String sqlSearchForUser = "SELECT adminUsername, adminPassword FROM admin_users WHERE adminUsername = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSearchForUser, username);
		if (results.next()) {
			String storedPassword = results.getString("adminPassword");
			return storedPassword.equals(password);
		}else {
			return false;
		}
	}

}
