package com.example.Rupeek.Cab_Booking.controller;

import com.example.Rupeek.Cab_Booking.dto.ValidateDTO;
import com.example.Rupeek.Cab_Booking.entity.Admin;
import com.example.Rupeek.Cab_Booking.service.AdminService;
import com.example.Rupeek.Cab_Booking.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @GetMapping("/ping")
    public String ping(){
        return "hello";
    }

    @PostMapping(path = "/")
    public Admin addAdmin(@RequestBody Admin admin) {
        return adminService.insertAdmin(admin);
    }

    @DeleteMapping(path = "/{id}")
    public void dropAdmin(@PathVariable("id") int id) {
        adminService.deleteAdmin(id);
    }

    @GetMapping(path = "/{id}")
    public Admin getAdmin(@PathVariable("id") Integer id) {
        System.out.println("Done");
        return adminService.getAdminById(id);
    }

    @PutMapping(path = "/{id}")
    public Admin updateAdmin(@RequestBody Admin admin, @PathVariable("id") int id) {
        return adminService.updateAdminById(admin, id);
    }

    @PostMapping("/validateAdmin")
    public Admin validateAdmin(@RequestBody ValidateDTO validateDTO){
        return adminService.validateAdmin(validateDTO.getUserId(),validateDTO.getPassword());
    }


}
