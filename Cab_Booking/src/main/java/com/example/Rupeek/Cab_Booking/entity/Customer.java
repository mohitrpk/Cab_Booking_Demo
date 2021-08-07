package com.example.Rupeek.Cab_Booking.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"})
public class Customer extends AbstractUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerId;


    public Customer(int customerId, TripBooking tripBookingId) {
        super();
        this.customerId = customerId;
    }

    public Customer() {
        super();
    }

    public Customer(String username, String password, String address, String email, String mobileNumber) {
        super(username, password, address, email, mobileNumber);
    }
    public Customer(String username, String password, String address, String email, String mobileNumber,int customerId, TripBooking tripBookingId) {
        super(username, password, address, email, mobileNumber);
        this.customerId = customerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}
