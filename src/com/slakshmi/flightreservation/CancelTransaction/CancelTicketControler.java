package com.slakshmi.flightreservation.CancelTransaction;

import java.util.List;

import com.slakshmi.flightreservation.CancelTransaction.CancelTicketModel.CancelTicketModelControlerCallBack;
import com.slakshmi.flightreservation.dto.TicketDetails;

public class CancelTicketControler implements CancelTicketControlerCallBack, CancelTicketModelControlerCallBack {
	private CancelTicketViewCallBack cancelTicketView;
	private CancelTicketModelCallBack cancelTicketModel;

	CancelTicketControler(CancelTicketViewCallBack cancelTicketView) {
		this.cancelTicketView = cancelTicketView;
		cancelTicketModel = new CancelTicketModel(this);
	}

	public void showBookedTicket() {// to view booked tickets to cancel
		cancelTicketModel.showBookedTicket();

	}

	public void bookingDetails(List<TicketDetails> ticketDetails) {
		if (ticketDetails.size() == 0) {
			cancelTicketView.noBookings("No booking from your account");
		} else {
			cancelTicketView.bookingTicketInfo(ticketDetails);
		}

	}

	public void cancelTicket(int cancelId) {
		cancelTicketModel.cancelTicket(cancelId);

	}

	public void cancelSuccesfully(String succesMessage) {
		cancelTicketView.cancellSuccesfully(succesMessage);

	}

	public void cancelFailure(String failureMessage) {
		cancelTicketView.cancelFailure(failureMessage);

	}

}
