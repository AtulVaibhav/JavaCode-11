package com.reservationSystem;

public class ReservationSystem {
	public synchronized void bookingTicket(String userName, int seatsRequired) {
		System.out.println("-------------Welcome to IndianRailways------------");
		System.out.println("Hello Mr/Mrs/Miss :"+userName+" Seats requested :"+seatsRequired);
		System.out.println("Checking availability.Please wait.....");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		int avaialbleSeats = RailwayDatabase.getAvailableSeats();
		if(seatsRequired<=avaialbleSeats){
			avaialbleSeats = avaialbleSeats - seatsRequired;
			RailwayDatabase.setAvaialbleSeats(avaialbleSeats);
			System.out.println("Hello "+userName+".Seats confirmed...");
		}else{
			System.out.println("Hello "+userName+".No seats available...Sorry for inconvience.");
		}
		
		
	}

}
