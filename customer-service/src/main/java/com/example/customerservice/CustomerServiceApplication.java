package com.example.customerservice;

import com.example.customerservice.entities.Customer;
import com.example.customerservice.repo.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);}
	@Bean

		public CommandLineRunner commandLineRunner(CustomerRepository cs){
			return args -> {
				cs.save(Customer.builder()
								.name("hassan")
								.email("hassan@gmail.com")
						.build());
				cs.save(Customer.builder()
						.name("mohamed")
						.email("mohamed@gmail.com")
						.build());cs.save(Customer.builder()
						.name("manal")
						.email("manal@gmail.com")
						.build());

			};



	}
}
