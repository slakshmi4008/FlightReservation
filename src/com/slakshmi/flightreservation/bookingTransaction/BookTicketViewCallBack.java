package com.slakshmi.flightreservation.bookingTransaction;

import java.util.List;

import com.slakshmi.flightreservation.dto.BookingParameters;
import com.slakshmi.flightreservation.dto.Flight;
import com.slakshmi.flightreservation.dto.TicketDetails;

public interface BookTicketViewCallBack {

	void printFlightDetails(List<Flight> flightdetails);

	void successfulMessage(String string);

	void bookingTicketInfo(List<TicketDetails> ticketDetails);

	void bookingIndex();

	void getPassengerDetails(BookingParameters bookingParameters);

	void errorMessage(String string);

}
