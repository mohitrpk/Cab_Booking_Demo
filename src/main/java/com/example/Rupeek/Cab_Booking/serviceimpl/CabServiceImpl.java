package com.example.Rupeek.Cab_Booking.serviceimpl;

import com.example.Rupeek.Cab_Booking.entity.Cab;
import com.example.Rupeek.Cab_Booking.repository.CabRepo;
import com.example.Rupeek.Cab_Booking.service.CabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CabServiceImpl implements CabService {

    @Autowired
    private CabRepo cabRepo;

    @Override
    public Cab insertCab(Cab cab) {
        return cabRepo.save(cab);
    }

    @Override
    public Cab updateCab(Cab Cab) {
        return null;
    }

    @Override
    public void deleteCab(int cabId) {
        cabRepo.deleteById(cabId);
    }

    @Override
    public List<Cab> viewCabsOfType(String cabType) {
        return cabRepo.viewCabsOfType(cabType);
    }

    @Override
    public int countCabsOfType(String cabType) {
        return cabRepo.countCabsOfType(cabType);
    }

    @Override
    public Cab getCabById(int cabId){
        System.out.println("Serviceimpl");
        Cab cab = cabRepo.getById(cabId);
        System.out.print(cab.toString());
        return cab;
    }
}
