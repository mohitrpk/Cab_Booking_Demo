package com.example.Rupeek.Cab_Booking.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler", "fieldHandler"})
public class Cab {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cabId;
    private String carType;
    private int perKmRate;

    @OneToOne(mappedBy = "cab",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JsonIgnore
    private Driver driver;







}
