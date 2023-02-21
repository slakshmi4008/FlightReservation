package com.slakshmi.flightreservation.dto;

public class Passenger {

	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getTicketID() {
		return ticketID;
	}
	public void setTicketID(int ticketID) {
		this.ticketID = ticketID;
	}
	private String passengerName;
	private int age;
	private String gender;
	private int ticketID;
	public Passenger(String passengerName, int age, String gender,int ticketID) {
		super();
		this.passengerName = passengerName;
		this.age = age;
		this.gender = gender;
		this.ticketID=ticketID;
	}
}
