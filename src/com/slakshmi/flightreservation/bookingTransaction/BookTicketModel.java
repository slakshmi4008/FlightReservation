package com.slakshmi.flightreservation.bookingTransaction;

import java.util.List;

import com.slakshmi.flightreservation.dto.Admin;
import com.slakshmi.flightreservation.dto.BookingParameters;
import com.slakshmi.flightreservation.dto.Flight;
import com.slakshmi.flightreservation.dto.Passenger;
import com.slakshmi.flightreservation.dto.TicketDetails;
import com.slakshmi.flightreservation.dto.User;
import com.slakshmi.flightreservation.repository.FlightRepository;

public class BookTicketModel implements BookTicketModelCallBack {

private BookTicketModelControlerCallBack bookTicketController;
	
	public BookTicketModel(BookTicketController bookTicketController) {
		this.bookTicketController = bookTicketController;
	}

	public List<Flight> getFlightDetails() {
		
		List<Flight> flightdetails  = FlightRepository.getInstance().getFlightDetails();
		
		return flightdetails;
	}

	public void updateFlightDetails(BookingParameters bookingParameters) {
		
		FlightRepository.getInstance().updateFlightDetails(bookingParameters);
	}

	public void addPassenger(Passenger passenger, BookingParameters bookingParameters) {
		// TODO Auto-generated method stub
		FlightRepository.getInstance().addPassenger(passenger,bookingParameters);
	}

	public List<Passenger>  getTicketDetails(BookingParameters bookingParameters) {
		// TODO Auto-generated method stub
		List<Passenger> PassengerDetails = FlightRepository.getInstance().getTicketDetails(bookingParameters);
		return PassengerDetails;
	}

	public List<TicketDetails> getBookingInfo() {
		// TODO Auto-generated method stub
		return FlightRepository.getInstance().getBookingInfo();
	}
	public interface BookTicketModelControlerCallBack {

		
	}
}
