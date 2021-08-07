package com.example.Rupeek.Cab_Booking.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;

@Entity
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"})
public class TripBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int tripBookingId;
    @OneToOne()
    @JoinColumn(name = "customerId", nullable = false)
    private Customer customer;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "driverId", nullable= false)
    private Driver driver;
    private String fromLocation;
    private String toLocation;
    private Date  startDate;
    private Date endDate;
    private Boolean status;
    private float distanceKm;
    private float totalFare;

    public TripBooking(){
        super();
    }

    public TripBooking(int tripBookingId, Customer customer, Driver driver, String fromLocation, String toLocation, Date startDate, Date endDate, Boolean status, float distanceKm, float totalFare) {
        super();
        this.tripBookingId = tripBookingId;
        this.customer = customer;
        this.driver = driver;
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.distanceKm = distanceKm;
        this.totalFare = totalFare;
    }

    public int getTripBookingId() {
        return tripBookingId;
    }

    public void setTripBookingId(int tripBookingId) {
        this.tripBookingId = tripBookingId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public String getToLocation() {
        return toLocation;
    }

    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public float getDistanceKm() {
        return distanceKm;
    }

    public void setDistanceKm(float distanceKm) {
        this.distanceKm = distanceKm;
    }

    public float getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(float totalFare) {
        this.totalFare = totalFare;
    }
}
