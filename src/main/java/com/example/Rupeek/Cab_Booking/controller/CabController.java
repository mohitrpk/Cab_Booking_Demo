package com.example.Rupeek.Cab_Booking.controller;

import com.example.Rupeek.Cab_Booking.entity.Cab;
import com.example.Rupeek.Cab_Booking.service.CabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/cab")
public class CabController {
    @Autowired
    private CabService cabService;

    @PostMapping(path = "/")
    public Cab addCab(@RequestBody Cab cab) {
        return cabService.insertCab(cab);
    }

    @DeleteMapping(path = "/{id}")
    public void dropCab(@PathVariable("id") int id) {
        cabService.deleteCab(id);
    }

    @GetMapping(path = "/viewCabType/{cabType}")
    public List<Cab> viewCabs(@PathVariable("cabType") String cabType) {
        return cabService.viewCabsOfType(cabType);
    }

    @GetMapping(path = "/countCabType/{cabType}")
    public int countCabs(@PathVariable("cabType") String cabType) {
        return cabService.countCabsOfType(cabType);
    }

    @GetMapping(path = "/{id}")
    public Cab viewCabsById(@PathVariable("id") int id) {
        return cabService.getCabById(id);
    }
}
