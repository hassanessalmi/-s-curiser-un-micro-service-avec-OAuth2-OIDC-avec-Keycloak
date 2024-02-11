package com.example.customerfrantthymealapp.web;

import com.example.customerfrantthymealapp.entities.Customer;
import com.example.customerfrantthymealapp.repository.CustomerRepository;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller

public class CustomerRestController {

    private CustomerRepository customerRepository;

    public CustomerRestController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @GetMapping("/customers")
    public String customers(Model model){
        List<Customer> CustomerList=customerRepository.findAll();
        model.addAttribute("customers",CustomerList);
        return "customers";
    }
}