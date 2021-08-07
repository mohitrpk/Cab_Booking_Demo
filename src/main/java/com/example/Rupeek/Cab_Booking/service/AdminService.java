package com.example.Rupeek.Cab_Booking.service;

import com.example.Rupeek.Cab_Booking.dto.ValidateDTO;
import com.example.Rupeek.Cab_Booking.entity.Admin;
import com.example.Rupeek.Cab_Booking.entity.TripBooking;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public interface AdminService {
    public Admin insertAdmin(Admin Admin);

    public Admin getAdminById(int id);

    public Admin updateAdminById(Admin admin, int id);

    public void deleteAdmin(int id);

    public List<TripBooking> getAllTrips(int customerId);

    public List<TripBooking> getTripCabWise();

    public List<TripBooking> getTripDateWise();

    public List<TripBooking> getAllTripsForDays(int customerId, Date startDate, Date endDate);

    public Admin validateAdmin(int userId, String password);
}
