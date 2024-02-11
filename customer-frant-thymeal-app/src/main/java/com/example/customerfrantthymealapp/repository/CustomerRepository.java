package com.example.customerfrantthymealapp.repository;


import com.example.customerfrantthymealapp.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}

