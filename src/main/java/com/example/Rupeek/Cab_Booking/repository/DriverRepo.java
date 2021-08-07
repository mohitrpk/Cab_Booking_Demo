package com.example.Rupeek.Cab_Booking.repository;

import com.example.Rupeek.Cab_Booking.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DriverRepo extends JpaRepository<Driver, Integer> {
    @Query("select d from Driver d where d.rating>=4.5")
    public List<Driver> viewBestDrivers();

    @Query("select d from Driver d where d.driverId not in (select t.driver.driverId from TripBooking t where t.status=true)")
    public List<Driver> getFreeDriver();
}
