package com.slakshmi.flightreservation.dto;

public class User {
	private int userId;
	private String userName;
	private long phoneNo;
	private String emailId;
	private String password;


	public User(String userName, String password) {
		this.userName=userName;
		this.password=password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Object getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

}
