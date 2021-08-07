package com.example.Rupeek.Cab_Booking.serviceimpl;

import com.example.Rupeek.Cab_Booking.entity.Customer;
import com.example.Rupeek.Cab_Booking.entity.Customer;
import com.example.Rupeek.Cab_Booking.repository.CustomerRepo;
import com.example.Rupeek.Cab_Booking.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public Customer insertCustomer(Customer customer) {
        return customerRepo.save(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer, int id) {
        Customer customerU = customerRepo.getById(id);
        if(customerU!=null){
            customerU.setAddress(customer.getAddress());
            customerU.setEmail(customer.getEmail());
            customerU.setMobileNumber(customer.getMobileNumber());
            customerU.setPassword(customer.getPassword());
            customerU.setUsername(customer.getUsername());
            return customerRepo.save(customerU);
        }
        return null;
    }

    @Override
    public void deleteCustomer(int id) {
        customerRepo.deleteById(id);
    }

    @Override
    public Customer viewCustomer(int customerId) {
        return customerRepo.getById(customerId);
    }

    @Override
    public List<Customer> viewCustomers() {
        return customerRepo.findAll();
    }

    @Override
    public Customer validateCustomer(int userId, String password) {
//        if(customerRepo.validateCustomer(username,password)!=null)
//            return true;
//        return false;
        Customer customer = customerRepo.validateCustomer(userId,password);
        System.out.println(customer);
        return customer;
    }

}
