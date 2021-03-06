package com.example.onlineordering.model;

public class AppUser {

	private Long userId;
    private String userName;
    private String encrytedPassword;
    private String email;
    
    public AppUser() {
    	
    }
    
    
	public AppUser(Long userId, String userName, String encrytedPassword, String email) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.encrytedPassword = encrytedPassword;
		this.email = email;
	}


	public AppUser(Long userId, String userName, String encrytedPassword) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.encrytedPassword = encrytedPassword;
	}


	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEncrytedPassword() {
		return encrytedPassword;
	}
	public void setEncrytedPassword(String encrytedPassword) {
		this.encrytedPassword = encrytedPassword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
