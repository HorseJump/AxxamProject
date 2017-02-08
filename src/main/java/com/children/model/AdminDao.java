package com.children.model;

public interface AdminDao {
	
	public boolean confirmAdminLogin(String username, String password);
	
	public Long getAdminUserId(String username);

}
