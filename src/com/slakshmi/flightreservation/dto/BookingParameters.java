package com.slakshmi.flightreservation.dto;

public class BookingParameters {
	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public int getNoOfTickets() {
		return noOfTickets;
	}
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}
	private String flightId;
	private int noOfTickets;
	public BookingParameters(String flightId, int noOfTickets) {
		super();
		this.flightId = flightId;
		this.noOfTickets = noOfTickets;
	}

}
