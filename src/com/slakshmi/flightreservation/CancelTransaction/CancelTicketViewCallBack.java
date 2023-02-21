package com.slakshmi.flightreservation.CancelTransaction;

import java.util.List;

import com.slakshmi.flightreservation.dto.TicketDetails;

public interface CancelTicketViewCallBack {

	void noBookings(String string);

	void bookingTicketInfo(List<TicketDetails> ticketDetails);

	void cancellSuccesfully(String succesMessage);

	void cancelFailure(String failureMessage);

}
