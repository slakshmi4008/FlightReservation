package com.slakshmi.flightreservation.login;

import java.util.Scanner;

import com.slakshmi.flightreservation.bookingTransaction.BookTicketView;
import com.slakshmi.flightreservation.dto.Admin;
import com.slakshmi.flightreservation.dto.User;

	public class LoginView implements LoginViewCallBack {

		private LoginControllerCallBack loginController;
		private Scanner scanner = new Scanner(System.in);

		public LoginView() {
			loginController = new LoginController(this);
		}
		
		static public void main(String[] args) {
			LoginView loginView = new LoginView();
			loginView.create();
		}
		
		public void create() {
			loginIndex();
		}
		
		public void loginIndex() {
			System.out.println("--------------------------------------");
			System.out.println("Welcome to flight reservation system");
			System.out.println("1)Admin Login");
			System.out.println("2)User Login");
			System.out.println("3)New User");
			System.out.println("--------------------------------------");
			System.out.print("Enter an option -->");
			int option = scanner.nextInt();
			scanner.nextLine();
			loginController.choosenOption(option);
		}

		public void checkForLogin(int option) {
			System.out.println("--------------------------------------");
			System.out.println("Enter User Name");
			String userName = scanner.next();
			System.out.println("Enter password");
			String password = scanner.next();
			loginController.checkCredentials(userName, password,option);	
		}

		@Override
		public void loginSuccess(Admin admin) {
			System.out.println("--------------------------------------");
			System.out.println("\n-->Welcome " + admin.getUserName() + "<--\n");
			BookTicketView bookingTicketView = new BookTicketView();
			bookingTicketView.create();
		}

		public void loginSuccess(User user) {
			System.out.println("--------------------------------------");
			System.out.println("\n-->Welcome " + user.getUserName() + "<--\n");
			BookTicketView bookingTicketView = new BookTicketView();
			bookingTicketView.create();
		}
		@Override
		public void loginFailed(String errorMessage) {
			System.out.println("--------------------------------------");
			System.out.println(errorMessage);
			loginIndex();
		}
		public void addUser() {
			System.out.println("--------------------------------------");
			System.out.print("Enter the user name -->");
			String userName = scanner.nextLine();
			System.out.println("Enter the password -->");
			String password = scanner.nextLine();
			System.out.print("Confirm password -->");
			String rePassword = scanner.nextLine();
			loginController.addNewUser(userName, password, rePassword);
			checkForLogin(2);
		}
}
