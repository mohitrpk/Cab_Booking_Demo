package com.example.Rupeek.Cab_Booking.controller;

import com.example.Rupeek.Cab_Booking.dto.ValidateDTO;
import com.example.Rupeek.Cab_Booking.entity.Customer;
import com.example.Rupeek.Cab_Booking.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @PostMapping("/")
    public Customer addCustomer(@RequestBody Customer customer){

        return customerService.insertCustomer(customer);
    }
    @PutMapping("/{id}")
    public Customer updateCustomer(@RequestBody Customer customer,@PathVariable("id") int id){
        return customerService.updateCustomer(customer, id);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable("id") int id){
        customerService.deleteCustomer(id);
    }

    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable("id") int id){
        return customerService.viewCustomer(id);
    }

    @GetMapping("/")
    public List<Customer> getAllCustomers(){
        return customerService.viewCustomers();
    }

    @PostMapping("/validateCustomer")
    public Customer validateCustomer(@RequestBody ValidateDTO customerValidateDTO){
        return customerService.validateCustomer(customerValidateDTO.getUserId(),customerValidateDTO.getPassword());
    }
}
