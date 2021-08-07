package com.example.Rupeek.Cab_Booking.service;

import com.example.Rupeek.Cab_Booking.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
    public Customer insertCustomer(Customer customer);

    public Customer updateCustomer(Customer customer, int id);

    public void deleteCustomer(int customerId);

    public Customer viewCustomer(int customerId);

    public List<Customer> viewCustomers();

    public Customer validateCustomer(int userId, String password);

}
