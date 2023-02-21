package com.slakshmi.flightreservation.login;

import com.slakshmi.flightreservation.dto.Admin;
import com.slakshmi.flightreservation.dto.User;

public interface LoginViewCallBack {
	void loginSuccess(Admin adminUser);

	void loginFailed(String errorMessage);

	void addUser();

	void checkForLogin(int i);

	void loginSuccess(User user);

}
