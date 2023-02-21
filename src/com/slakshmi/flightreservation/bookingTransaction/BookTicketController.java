package com.slakshmi.flightreservation.bookingTransaction;

import java.util.List;

import com.slakshmi.flightreservation.CancelTransaction.CancelTicketView;
import com.slakshmi.flightreservation.bookingTransaction.BookTicketModel.BookTicketModelControlerCallBack;
import com.slakshmi.flightreservation.dto.BookingParameters;
import com.slakshmi.flightreservation.dto.Flight;
import com.slakshmi.flightreservation.dto.Passenger;
import com.slakshmi.flightreservation.dto.TicketDetails;

public class BookTicketController implements BookTicketControllerCallBack, BookTicketModelControlerCallBack {
	private BookTicketModelCallBack bookTicketModel;
	private BookTicketViewCallBack bookTicketView;
	
	public BookTicketController(BookTicketViewCallBack bookTicketView) {
		this.bookTicketModel = new BookTicketModel(this);
		this.bookTicketView=bookTicketView;
	}

	public void processbookingIndex(int bookingIndexOption) {
	
		if(bookingIndexOption==1) {
			List<Flight> flightdetails =bookTicketModel.getFlightDetails();
			bookTicketView.printFlightDetails(flightdetails);
		}
		else if(bookingIndexOption==2) {
			CancelTicketView cancel = new CancelTicketView();
			cancel.cancelIndex();
		}
		else if(bookingIndexOption==3) {
			showBooking();
		}
        else if(bookingIndexOption==3) {
        	bookTicketView.successfulMessage("Thank you for visiting us");
		}
	}

	private void showBooking() {
		// TODO Auto-generated method stub
		List<TicketDetails> ticketDetails=bookTicketModel.getBookingInfo();
    	bookTicketView.bookingTicketInfo(ticketDetails);
    	bookTicketView.bookingIndex();
		
	}

	public void bookTicket(BookingParameters bookingParameters) {
		int availableTickets=isTicketAvailable(bookingParameters);
        
		if(availableTickets>=bookingParameters.getNoOfTickets()) {
			
		    bookTicketView.getPassengerDetails(bookingParameters);
        	bookTicketModel.updateFlightDetails(bookingParameters);// to reduce no of available seats in selected flight
        	bookTicketView.successfulMessage("Your tickect is booked successfully");   	
        	showBooking();
        	
        }else {
        	bookTicketView.errorMessage("The number of tickets requested is greater than available tickets");
        }
	}


	public int isTicketAvailable(BookingParameters bookingParameters) {
	
		List<Flight> flightdetails = bookTicketModel.getFlightDetails();
		int availableSeats=0;
		
		for(Flight flight :flightdetails) {
			if(flight.getFlightId().equals(bookingParameters.getFlightId())){
				availableSeats=flight.getAvailableSeats();
			}
		}
	  return availableSeats;	
	}

	public void addPassenger(Passenger passenger, BookingParameters bookingParameters) {
		// TODO Auto-generated method stub
	   bookTicketModel.addPassenger(passenger,bookingParameters);
		
	}
}
