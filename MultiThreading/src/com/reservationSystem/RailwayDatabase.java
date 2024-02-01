package com.reservationSystem;

public class RailwayDatabase {
    private static int availableSeats = 10;
    
    public static void setAvaialbleSeats(int seats){
    	availableSeats = seats;
    }
    public static int getAvailableSeats(){
    	return availableSeats;
    }
}
