package com.example.Rupeek.Cab_Booking.repository;

import com.example.Rupeek.Cab_Booking.entity.Cab;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CabRepo extends JpaRepository<Cab,Integer> {

    @Query("SELECT c from Cab c WHERE LOWER(c.carType)=LOWER(:carType)")
    List<Cab> viewCabsOfType(String carType);

    @Query("select count(c) from Cab c where LOWER(c.carType) = LOWER(:carType)")
    int countCabsOfType(String carType);

}
