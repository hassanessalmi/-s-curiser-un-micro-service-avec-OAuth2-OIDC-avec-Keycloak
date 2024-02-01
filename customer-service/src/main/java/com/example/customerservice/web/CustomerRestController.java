package com.example.customerservice.web;

import com.example.customerservice.entities.Customer;
import com.example.customerservice.repo.CustomerRepository;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.pulsar.PulsarProperties;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerRestController {
    @Autowired
    private CustomerRepository customerRepository;
    @GetMapping("/customers")
    @PreAuthorize("hasAnyAuthority('USER')")
    public List<Customer> getAllCustomer(){
        return customerRepository.findAll();

    }
    @GetMapping("/customers/{id}")
    public Customer getCustomerByid(@PathVariable Long id){
        return customerRepository.findById(id).get();
    }

@GetMapping("/mySession")
    public Authentication authentication ( Authentication authentication){
        return authentication;
}
}
