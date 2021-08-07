package com.example.Rupeek.Cab_Booking.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","fieldHandler"})
public class Admin extends AbstractUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int adminId;

    public Admin() {
        super();
    }

    public Admin(String username, String password, String address, String email, String mobileNumber) {
        super(username, password, address, email, mobileNumber);
    }
    public Admin(String username, String password, String address, String email, String mobileNumber,int adminId) {
        super(username, password, address, email, mobileNumber);
        this.adminId=adminId;
    }
    //DOUBT
    public Admin(int adminId){
        super();
        this.adminId=adminId;
    }
    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }
}
