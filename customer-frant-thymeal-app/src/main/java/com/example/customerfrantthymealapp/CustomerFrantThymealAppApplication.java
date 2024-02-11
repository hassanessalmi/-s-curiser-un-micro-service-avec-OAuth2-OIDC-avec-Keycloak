package com.example.customerfrantthymealapp;

import com.example.customerfrantthymealapp.entities.Customer;
import com.example.customerfrantthymealapp.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerFrantThymealAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerFrantThymealAppApplication.class, args);
	}

	@Bean

	public CommandLineRunner commandLineRunner(CustomerRepository cs) {
		return args -> {
			cs.save(Customer.builder()
					.name("hassan")
					.email("hassan@gmail.com")
					.build());
			cs.save(Customer.builder()
					.name("mohamed")
					.email("mohamed@gmail.com")
					.build());
			cs.save(Customer.builder()
					.name("manal")
					.email("manal@gmail.com")
					.build());

		};
	}
}
