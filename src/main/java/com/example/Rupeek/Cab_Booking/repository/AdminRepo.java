package com.example.Rupeek.Cab_Booking.repository;

import com.example.Rupeek.Cab_Booking.entity.Admin;
import com.example.Rupeek.Cab_Booking.entity.Customer;
import com.example.Rupeek.Cab_Booking.entity.TripBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface AdminRepo extends JpaRepository<Admin,Integer> {

    @Query("select t from TripBooking t where t.customer=:customerId")
    public List<TripBooking> getAllTrips(@Param("customerId") int customerId);

//    @Query("select t from TripBooking t where t.")
//    public List<TripBooking> getTripCabWise(int cabId);

    @Query("select t from TripBooking t order by t.startDate DESC ")
    public List<TripBooking> getTripDateWise();

    @Query("select c from Admin c where  c.adminId=:userId AND c.password=:password")
    public Admin validateAdmin(@Param("userId")int userId, @Param("password") String password);


//    @Query("select t from TripBooking t where t.customer=:customerId AND (t.startDate>=?1 AND t.endDate<=?2)")
//    public List<TripBooking> getAllTripForDays(@Param("customerId") int customerId,@Param Date startDate, Date endDate);
}
