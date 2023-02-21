package com.slakshmi.flightreservation.CancelTransaction;

import java.util.List;
import java.util.Scanner;

import com.slakshmi.flightreservation.bookingTransaction.BookTicketView;
import com.slakshmi.flightreservation.dto.BookingParameters;
import com.slakshmi.flightreservation.dto.Passenger;
import com.slakshmi.flightreservation.dto.TicketDetails;

public class CancelTicketView implements CancelTicketViewCallBack {
	private Scanner input = new Scanner(System.in);
	private CancelTicketControlerCallBack cancelTicketControler;

	public CancelTicketView() {
		cancelTicketControler = new CancelTicketControler(this);
	}

	public void cancelIndex() {
		System.out.println("---------------------------------");
		System.out.println("1 Show Booked tickets");
		cancelTicketControler.showBookedTicket();
	}

	public void noBookings(String errorMessage) {
		System.out.println("---------------------------------");
		System.out.println( errorMessage);
	}

	public void bookingTicketInfo(List<TicketDetails> ticketDetails) {
		System.out.println("---------------------------------");
		System.out.println("Booking details-->");
		System.out.println("TicketId | Name   | Age  | Gender | FlightId");
		for (TicketDetails bookInfo : ticketDetails) {
			Passenger passenger = bookInfo.getPassenger();
			BookingParameters bookingParamters = bookInfo.getBookingParameters();
			
			System.out.println(passenger.getTicketID()+ " \t | " + passenger.getPassengerName() + " |" + passenger.getAge()
					+ " \t|" +passenger.getGender()+ "\t | " + bookingParamters.getFlightId());
		}
		getTicketId();
	}

	private void getTicketId() {
		System.out.println("---------------------------------");
		System.out.println("Enter TicketId to cancel Ticket");
		int cancelId = input.nextInt();
		cancelTicketControler.cancelTicket(cancelId);
	}

	public void cancellSuccesfully(String succesMessage) {
		System.out.println("---------------------------------");
		System.out.println(succesMessage);
		BookTicketView bookTicketView = new BookTicketView();
		bookTicketView.bookingIndex();
	}

	public void cancelFailure(String failureMessage) {
		System.out.println("---------------------------------");
		System.out.println(failureMessage);

	}
}
