package com.slakshmi.flightreservation.login;

import com.slakshmi.flightreservation.dto.Admin;
import com.slakshmi.flightreservation.dto.User;
import com.slakshmi.flightreservation.repository.FlightRepository;

public class LoginModel implements LoginModelCallBack {
private LoginModelControlerCallBack loginController;
	
	public LoginModel(LoginModelControlerCallBack loginController) {
		this.loginController = loginController;
	}

	public void checkCredentials(String userName, String password,int option) {
		if(option==1) {
		Admin adminUser = FlightRepository.getInstance().checkValidAdmin(userName,password);
		if (adminUser !=null) {
			loginController.loginSuccess(adminUser);
		} else {
			loginController.loginFailiure("\nInvalid Credentials. Please try again!\n");
		}
		}
		else if(option==2) {
			User user = FlightRepository.getInstance().checkValidUser(userName,password);
			if (user !=null) {
				loginController.loginSuccess(user);
			} else {
				loginController.loginFailiure("\nInvalid Credentials. Please try again!\n");
			}
		}

	}

	public interface LoginModelControlerCallBack {

		void loginSuccess(Admin adminUser);

		void loginSuccess(User user);

		void loginFailiure(String string);

	}

	@Override
	public void addUser(String userMail, String password) {
		FlightRepository.getInstance().addUser(userMail, password);
		
	}

}
