package com.slakshmi.flightreservation.bookingTransaction;

import com.slakshmi.flightreservation.dto.BookingParameters;
import com.slakshmi.flightreservation.dto.Passenger;

public interface BookTicketControllerCallBack {

	void processbookingIndex(int bookingIndexOption);

	void bookTicket(BookingParameters bookingParameters);

	void addPassenger(Passenger passenger, BookingParameters bookingParameters);

}
