package com.slakshmi.flightreservation.CancelTransaction;

import java.util.List;

import com.slakshmi.flightreservation.dto.TicketDetails;
import com.slakshmi.flightreservation.repository.FlightRepository;

public class CancelTicketModel implements CancelTicketModelCallBack {
	private CancelTicketModelControlerCallBack cancelTicketControler;

	CancelTicketModel(CancelTicketControler cancelTicketControler) {
		this.cancelTicketControler = cancelTicketControler;
	}

	public void showBookedTicket() {// to show booked ticket
		List<TicketDetails> ticketDetails = FlightRepository.getInstance().getBookingInfo();
		cancelTicketControler.bookingDetails(ticketDetails);
	}

	public void cancelTicket(int cancelId) {
		boolean cancelTicket = FlightRepository.getInstance().cancelTicket(cancelId);
		if (cancelTicket) {
			cancelTicketControler.cancelSuccesfully("Tickets Cancelled Succesfully");
		} else {
			cancelTicketControler.cancelFailure("Given Ticket id is invalid");
		}
	}
    public interface CancelTicketModelControlerCallBack {

		void bookingDetails(List<TicketDetails> ticketDetails);

		void cancelFailure(String string);

		void cancelSuccesfully(String string);
	
	}

}
