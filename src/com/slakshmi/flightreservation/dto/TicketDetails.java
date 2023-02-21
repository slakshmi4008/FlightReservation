package com.slakshmi.flightreservation.dto;

public class TicketDetails {
  private Passenger passenger;
  private BookingParameters bookingParameters;
public Passenger getPassenger() {
	return passenger;
}
public void setPassenger(Passenger passenger) {
	this.passenger = passenger;
}
public BookingParameters getBookingParameters() {
	return bookingParameters;
}
public void setBookingParameters(BookingParameters bookingParameters) {
	this.bookingParameters = bookingParameters;
}
public TicketDetails(Passenger passenger, BookingParameters bookingParameters) {
	super();
	this.passenger = passenger;
	this.bookingParameters = bookingParameters;
}
  
}
