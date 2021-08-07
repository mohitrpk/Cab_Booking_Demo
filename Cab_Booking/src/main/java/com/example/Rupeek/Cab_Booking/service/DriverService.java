package com.example.Rupeek.Cab_Booking.service;

import com.example.Rupeek.Cab_Booking.entity.Driver;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DriverService {
    public Driver insertDriver(Driver Driver);

    public Driver updateDriver(Driver Driver, int id);

    public void deleteDriver(int driverId);

    public List<Driver> viewBestDrivers();

    public Driver viewDriver(int driverId);

    public Driver getFreeDriver();
}
