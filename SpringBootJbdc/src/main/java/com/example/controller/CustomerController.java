package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Customer;
import com.example.repository.CustomerRepository;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerRepository repository;
	
	@GetMapping(path = "/customerDetails")
	public void customerDetails() {
		
		List<Customer> customers = repository.findAll();
		
		customers.stream().forEach( customer -> System.out.println(customer));
	}
	

}
