package com.example.Rupeek.Cab_Booking.serviceimpl;

import com.example.Rupeek.Cab_Booking.entity.Admin;
import com.example.Rupeek.Cab_Booking.entity.TripBooking;
import com.example.Rupeek.Cab_Booking.repository.AdminRepo;
import com.example.Rupeek.Cab_Booking.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminRepo adminRepo;

    @Override
    public Admin insertAdmin(Admin admin) {
        return adminRepo.save(admin);
    }

    @Override
    public Admin updateAdminById(Admin admin, int id) {
        Admin adminUpdate = adminRepo.getById(id);
        System.out.println(adminUpdate.getAddress());
        if(adminUpdate!=null) {
            adminUpdate.setAddress(admin.getAddress());
            adminUpdate.setEmail(admin.getEmail());
            adminUpdate.setMobileNumber(admin.getMobileNumber());
            adminUpdate.setPassword(admin.getPassword());
            adminUpdate.setUsername(admin.getUsername());
            return adminRepo.save(adminUpdate);
        }
        return null;

    }

    @Override
    public void deleteAdmin(int id) {
        adminRepo.deleteById(id);
    }

    @Override
    public Admin getAdminById( int id) {
       return adminRepo.getById(id);
     }

    @Override
    public Admin validateAdmin(int userId, String password) {
//        if(adminRepo.validateAdmin(userId,password)!=null)
//            return true;
//        return false;
        return adminRepo.validateAdmin(userId,password);
    }

    @Override
    public List<TripBooking> getAllTrips(int customerId) {
        return null;
    }

    @Override
    public List<TripBooking> getTripCabWise() {
        return null;
    }

    @Override
    public List<TripBooking> getTripDateWise() {
        return null;
    }

    @Override
    public List<TripBooking> getAllTripsForDays(int customerId, Date startDate, Date endDate) {
        return null;
    }
}
