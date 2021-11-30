package org.example;

import java.util.ArrayList;

public class BookingManager
{
    private final ArrayList<Booking> bookingList;
    private PassengerStore passengerStore;
    private VehicleManager vehicleManager;

    // Constructor
    public BookingManager() {
        this.bookingList = new ArrayList<>();
    }

    //TODO implement functionality as per specification
    public Booking tryBooking(String passengerId, String VehicleType,int year, int month, int day, int hours, int minutes, double startLatitude
    , double startLongtitude, double endLatitude, double endLongtitude){
        if(passengerStore.findPassengerById(passengerId) != null){

        }
    }
}
