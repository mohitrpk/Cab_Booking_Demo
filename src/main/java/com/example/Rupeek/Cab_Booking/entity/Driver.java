package com.example.Rupeek.Cab_Booking.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"})
public class Driver extends AbstractUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int driverId;

    private String licenseNo;

//    @OneToOne(fetch = FetchType.LAZY,cascade =  CascadeType.ALL)
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cabId",unique = true)
    private Cab cab;

    private float rating;


}
