package com.codeclan.courseBooker.courseBooker_w13_d4_lab.controllers;

import com.codeclan.courseBooker.courseBooker_w13_d4_lab.models.Customer;
import com.codeclan.courseBooker.courseBooker_w13_d4_lab.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/bookings/ofcourse/{id}")
    public List<Customer> findCustomersByCourseId(@PathVariable Long id) {
        return customerRepository.findCustomersByCourseId(id);
    }
}
