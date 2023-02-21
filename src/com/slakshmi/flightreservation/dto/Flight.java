package com.slakshmi.flightreservation.dto;

public class Flight {
	
	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getFromLocation() {
		return fromLocation;
	}
	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}
	public String getToLocation() {
		return toLocation;
	}
	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		time = time;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	public int getBookedSeats() {
		return bookedSeats;
	}
	public void setBookedSeats(int bookedSeats) {
		this.bookedSeats = bookedSeats;
	}
	private String flightId;
	private String flightName;
	private String fromLocation;
	private String toLocation;
	private String time;
	private int availableSeats;
	private int totalSeats;
	private int bookedSeats;
	
	public Flight(String flightId, String flightName, String fromLocation, String toLocation, String time,
			int availableSeats, int totalSeats, int bookedSeats) {
		super();
		this.flightId = flightId;
		this.flightName = flightName;
		this.fromLocation = fromLocation;
		this.toLocation = toLocation;
		this.time = time;
		this.availableSeats = availableSeats;
		this.totalSeats = totalSeats;
		this.bookedSeats = bookedSeats;
	}
}
