package com.example.Rupeek.Cab_Booking.service;

import com.example.Rupeek.Cab_Booking.entity.TripBooking;

import java.util.List;

public interface TripBookingService {
    public TripBooking insertTripBooking(TripBooking tripBooking, int customerId,int driverId);

    public TripBooking updateTripBooking(TripBooking TripBooking);

    public void deleteTripBooking(int tripBookingId);

    public TripBooking getTripById(int tripBookingId);

    public List<TripBooking> viewAllTripsCustomer(int customerId);

    public TripBooking calculateFare(int customerId);
}
