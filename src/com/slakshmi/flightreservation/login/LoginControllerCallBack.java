package com.slakshmi.flightreservation.login;

public interface LoginControllerCallBack {
	void checkCredentials(String userName, String password, int option);

	void choosenOption(int option);

	void addNewUser(String userMail, String password, String rePassword);
}
