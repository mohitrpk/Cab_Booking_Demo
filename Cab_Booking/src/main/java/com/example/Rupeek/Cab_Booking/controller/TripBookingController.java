package com.example.Rupeek.Cab_Booking.controller;

import com.example.Rupeek.Cab_Booking.entity.Customer;
import com.example.Rupeek.Cab_Booking.entity.Driver;
import com.example.Rupeek.Cab_Booking.entity.TripBooking;
import com.example.Rupeek.Cab_Booking.repository.CustomerRepo;
import com.example.Rupeek.Cab_Booking.repository.DriverRepo;
import com.example.Rupeek.Cab_Booking.service.DriverService;
import com.example.Rupeek.Cab_Booking.service.TripBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/tripBooking")
public class TripBookingController {
    @Autowired
    private TripBookingService tripBookingService;

    @Autowired
    private DriverService driverService;

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private DriverRepo driverRepo;

    @PostMapping("/{customerId}/{driverId}")
    public TripBooking insertTrip(@RequestBody TripBooking tripBooking, @PathVariable("customerId") int customerId, @PathVariable("driverId") int driverId){
        return tripBookingService.insertTripBooking(tripBooking,customerId,driverId);
    }


    @DeleteMapping("/{id}")
    public void deleteTrip(@PathVariable("id") int tripBookingId){
        tripBookingService.deleteTripBooking(tripBookingId);
    }

    @GetMapping("/trip/{id}")
    public TripBooking getTripById(@PathVariable("id") int tripBookingId){
       return tripBookingService.getTripById(tripBookingId);
    }

    @GetMapping("/viewAllTripsCustomer/{id}")
    public List<TripBooking> viewAllTripsCustomer(@PathVariable("id") int customerId){
        return tripBookingService.viewAllTripsCustomer(customerId);
    }

    @PostMapping("/createTrip/{customerId}")
    public TripBooking createTrip(@RequestBody TripBooking tripBooking, @PathVariable("customerId") int customerId){
            Driver driver = driverService.getFreeDriver();
            if(driver!=null)
                return tripBookingService.insertTripBooking(tripBooking,customerId,driver.getDriverId());
            return null;
    }

}
