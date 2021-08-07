package com.example.Rupeek.Cab_Booking.serviceimpl;

import com.example.Rupeek.Cab_Booking.entity.Customer;
import com.example.Rupeek.Cab_Booking.entity.Driver;
import com.example.Rupeek.Cab_Booking.entity.TripBooking;
import com.example.Rupeek.Cab_Booking.repository.CustomerRepo;
import com.example.Rupeek.Cab_Booking.repository.DriverRepo;
import com.example.Rupeek.Cab_Booking.repository.TripBookingRepo;
import com.example.Rupeek.Cab_Booking.service.TripBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class TripBookingServiceImpl implements TripBookingService {
    @Autowired
    private TripBookingRepo tripBookingRepo;

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private DriverRepo driverRepo;

    @Override
    public TripBooking insertTripBooking(TripBooking tripBooking, int customerId,int driverId) {
        Customer customer = customerRepo.getById(customerId);
        Driver driver = driverRepo.getById(driverId);
        tripBooking.setCustomer(customer);
        tripBooking.setDriver(driver);
        return tripBookingRepo.save(tripBooking);
    }

    @Override
    public TripBooking updateTripBooking(TripBooking TripBooking) {
        return null;
    }

    @Override
    public void deleteTripBooking(int tripBookingId) {
        tripBookingRepo.deleteById(tripBookingId);
    }

    @Override
    public List<TripBooking> viewAllTripsCustomer(int customerId) {
        return tripBookingRepo.viewAllTripsCustomer(customerId);
    }

    @Override
    public TripBooking getTripById(int tripBookingId){
        return tripBookingRepo.getById(tripBookingId);
    }

    @Override
    public TripBooking calculateFare(int customerId) {
//        TripBooking tripBooking = tripBookingRepo.viewAllTripsCustomer(customerId);
//        float totalDistance =
        return null;
    }


}
