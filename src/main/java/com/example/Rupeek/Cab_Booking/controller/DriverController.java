package com.example.Rupeek.Cab_Booking.controller;

import com.example.Rupeek.Cab_Booking.entity.Cab;
import com.example.Rupeek.Cab_Booking.entity.Driver;
import com.example.Rupeek.Cab_Booking.repository.CabRepo;
import com.example.Rupeek.Cab_Booking.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/driver")
public class DriverController {
    @Autowired
    private DriverService driverService;

    @Autowired
    private CabRepo cabRepo;

    @PostMapping("/")
    public Driver addDriver(@RequestBody Driver driver) {
        return driverService.insertDriver(driver);
    }

    @DeleteMapping("/{id}")
    public void deleteDriver(@PathVariable("id") int id) {
        driverService.deleteDriver(id);
    }

    @PutMapping("/{id}")
    public Driver updateDriver(@RequestBody Driver driver, @PathVariable("id") int id) {
        return driverService.updateDriver(driver, id);
    }

    @GetMapping("/bestDrivers")
    public List<Driver> getBestDrivers() {
        return driverService.viewBestDrivers();
    }

    @GetMapping("/{id}")
    public Driver getDriverById(@PathVariable("id") int id) {
        return driverService.viewDriver(id);
    }
    @GetMapping("/getFreeDriver")
    public Driver getFreeDriver() {
        return driverService.getFreeDriver();
    }

}
