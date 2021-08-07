package com.example.Rupeek.Cab_Booking.serviceimpl;

import com.example.Rupeek.Cab_Booking.entity.Driver;
import com.example.Rupeek.Cab_Booking.repository.DriverRepo;
import com.example.Rupeek.Cab_Booking.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverServiceImpl implements DriverService {
    @Autowired
    DriverRepo driverRepo;

    @Override
    public Driver insertDriver(Driver driver) {
        return driverRepo.save(driver);
    }

    @Override
    public Driver updateDriver(Driver driver, int id) {
        Driver driverU = driverRepo.getById(id);
        if(driverU!=null){
            driverU.setAddress(driver.getAddress());
            driverU.setEmail(driver.getEmail());
            driverU.setMobileNumber(driver.getMobileNumber());
            driverU.setPassword(driver.getPassword());
            driverU.setUsername(driver.getUsername());
            driverU.setRating(driver.getRating());
            driverU.setLicenseNo(driver.getLicenseNo());
            driverU.setCab(driver.getCab());
            return driverRepo.save(driverU);
        }
        return null;

    }

    @Override
    public void deleteDriver(int driverId) {
        driverRepo.deleteById(driverId);
    }

    @Override
    public List<Driver> viewBestDrivers() {
        return driverRepo.viewBestDrivers();
    }

    @Override
    public Driver viewDriver(int driverId) {
        return driverRepo.getById(driverId);
    }

    @Override
    public Driver getFreeDriver(){
        List<Driver> driverList = driverRepo.getFreeDriver();
//        System.out.println(driverList.get(0).getDriverId());
        return driverList.get(0);
    }
}
