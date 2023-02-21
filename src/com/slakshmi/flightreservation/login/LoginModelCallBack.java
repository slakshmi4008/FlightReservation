package com.slakshmi.flightreservation.login;

public interface LoginModelCallBack {
	void checkCredentials(String userName, String password, int option);

	void addUser(String userMail, String password);
}
