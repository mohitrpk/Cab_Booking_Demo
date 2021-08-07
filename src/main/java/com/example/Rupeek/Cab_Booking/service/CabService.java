package com.example.Rupeek.Cab_Booking.service;

import com.example.Rupeek.Cab_Booking.entity.Cab;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CabService {
    public Cab insertCab(Cab Cab);
    public Cab updateCab(Cab Cab);
    public Cab getCabById(int cabId);
    public void deleteCab(int cabId);
    public List<Cab> viewCabsOfType(String cabType);
    public int countCabsOfType(String cabType);
}
