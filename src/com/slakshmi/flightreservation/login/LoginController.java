package com.slakshmi.flightreservation.login;

import com.slakshmi.flightreservation.dto.Admin;
import com.slakshmi.flightreservation.dto.User;
import com.slakshmi.flightreservation.login.LoginModel.LoginModelControlerCallBack;

public class LoginController implements  LoginControllerCallBack,LoginModelControlerCallBack {

	private LoginViewCallBack loginView;
	private LoginModelCallBack loginModel;

	public LoginController(LoginView loginView) {
		this.loginView = loginView;
		this.loginModel = new LoginModel(this);
	}

	@Override
	public void checkCredentials(String userName, String password,int option) {
		loginModel.checkCredentials(userName,password,option);
	}

	@Override
	public void loginSuccess(Admin adminUser) {
		loginView.loginSuccess(adminUser);
	}
	public void loginSuccess(User user) {
		loginView.loginSuccess(user);
	}

	@Override
	public void loginFailiure(String errorMessage) {
		loginView.loginFailed(errorMessage);	
	}

	@Override
	public void choosenOption(int option) {
		if (option == 1) {
			loginView.checkForLogin(1);
		} else if (option == 2) {
			loginView.checkForLogin(2);
		} else if (option == 3) {
			loginView.addUser();
		}
	}

	@Override
	public void addNewUser(String userMail, String password, String rePassword) {
		if (password.equals(rePassword)) {
			loginModel.addUser(userMail, password);
		} else {
			loginView.loginFailed("Failed to add User");
		}
		
	}

	
}
