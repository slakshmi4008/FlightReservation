package com.slakshmi.flightreservation.bookingTransaction;

import java.util.List;
import java.util.Scanner;

import com.slakshmi.flightreservation.dto.BookingParameters;
import com.slakshmi.flightreservation.dto.Flight;
import com.slakshmi.flightreservation.dto.Passenger;
import com.slakshmi.flightreservation.dto.TicketDetails;
import com.slakshmi.flightreservation.repository.FlightRepository;

public class BookTicketView implements BookTicketViewCallBack {
	private int ticketID=1;
	private BookTicketControllerCallBack bookTicketController;
	Scanner scanner = new Scanner(System.in);
	
	public BookTicketView(){
		bookTicketController = new BookTicketController(this);
	}

	public void create()  {
		bookingIndex();
		
	}

	public void bookingIndex()  {
		System.out.println("---------------------------------");
		System.out.println("Enter the option---->");
		System.out.println("1.Booking");
		System.out.println("2.Cancel");
		System.out.println("3.Show Booking");
		System.out.println("4.Log out");
		int bookingIndexOption = scanner.nextInt();
		bookTicketController.processbookingIndex(bookingIndexOption);
	}

	public void printFlightDetails(List<Flight> flightdetails) {
		System.out.println("------------------------------------");
		System.out.println("Flight details");
		System.out.println("FlightId" +"\t | " +"FlightName" +"\t | " + "From" + "\t | " +"To" +"\t | " +"Available Seats");
		for(Flight flight:flightdetails) {
			System.out.println(flight.getFlightId()+" \t | " + flight.getFlightName()+" \t | " +flight.getFromLocation()+" \t | " +
		 flight.getToLocation()+" \t | " +flight.getAvailableSeats());
			
		}
		bookTicket();
    }
	public void bookingTicketInfo(List<TicketDetails> ticketDetails) {
		System.out.println("---------------------------------");
		System.out.println("Booking details-->");
		System.out.println("TicketId | Name   | Age  | Gender | FlightId");
		for (TicketDetails bookInfo : ticketDetails) {
			Passenger passenger = bookInfo.getPassenger();
			BookingParameters bookingParamters = bookInfo.getBookingParameters();
			
			System.out.println(passenger.getTicketID()+ " \t | " + passenger.getPassengerName() + " |" + passenger.getAge()
					+ " \t|" +passenger.getGender()+ "\t | " + bookingParamters.getFlightId());
		}
	}

	private void bookTicket() {
		System.out.println("---------------------------------------");
		System.out.println("Fill the travel details");
		System.out.println();
		System.out.println("Enter the Flight id");
		String flightId=scanner.next();
		System.out.println("Enter no of tickets");
		int noOfTickets=scanner.nextInt();
		BookingParameters bookingParameters = new BookingParameters(flightId,noOfTickets);
		bookTicketController.bookTicket(bookingParameters);
		
	}

	public void getPassengerDetails(BookingParameters bookingParameters) {
		System.out.println("----------------------------------");
		System.out.println("Passenger details-->");
		int noOfTickets =bookingParameters.getNoOfTickets();
		List<List> ticketdetails=null;
		while(noOfTickets>0) {
			System.out.println("Enter passenger name");
			String passengerName=scanner.next();
			System.out.println("Enter passenger age");
			int passengerAge=scanner.nextInt();
			System.out.println("Enter passenger gender Male/Female");
			String passengerGender=scanner.next();
			Passenger passenger = new Passenger(passengerName,passengerAge,passengerGender,ticketID);
			ticketID++;
			noOfTickets--;
		    bookTicketController.addPassenger(passenger,bookingParameters);
		}
	}
	
	public void errorMessage(String errorMessage) {
		
		System.out.println("----------------------------------------");
		System.out.println(errorMessage);
		bookTicket();
	}
	
    public void successfulMessage(String message) {
		
    	System.out.println("----------------------------------------");
		System.out.println(message);
	}


}
