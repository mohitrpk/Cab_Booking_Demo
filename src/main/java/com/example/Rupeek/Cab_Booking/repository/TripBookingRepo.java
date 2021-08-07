package com.example.Rupeek.Cab_Booking.repository;

import com.example.Rupeek.Cab_Booking.entity.TripBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TripBookingRepo extends JpaRepository<TripBooking,Integer> {
    @Query("select t from TripBooking t where t.customer.customerId=:id")
    public List<TripBooking> viewAllTripsCustomer(int id);

//    public
}
