package com.library.system.pojo;

public class User {
	private String username;
	private String password;
	private String userid;
	
	public User() {}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", userid=" + userid + "]";
	}

	public User(String username, String password, String userid) {
		super();
		this.username = username;
		this.password = password;
		this.userid = userid;
	}

	
	
	
	
	
}



