package com.example.Rupeek.Cab_Booking.repository;

import com.example.Rupeek.Cab_Booking.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Integer> {
    @Query("select c from Customer c where c.customerId=:username AND c.password=:password")
    public Customer validateCustomer(@Param("username")int username, @Param("password") String password);
}
