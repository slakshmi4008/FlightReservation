package com.slakshmi.flightreservation.bookingTransaction;

import java.util.List;

import com.slakshmi.flightreservation.dto.BookingParameters;
import com.slakshmi.flightreservation.dto.Flight;
import com.slakshmi.flightreservation.dto.Passenger;
import com.slakshmi.flightreservation.dto.TicketDetails;

public interface BookTicketModelCallBack {

	List<Flight> getFlightDetails();

	List<TicketDetails> getBookingInfo();

	void updateFlightDetails(BookingParameters bookingParameters);

	void addPassenger(Passenger passenger, BookingParameters bookingParameters);

}
