package com.mongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.database.entities.Customer;
import com.mongodb.database.entities.CustomerRepository;

@RestController
public class MongoController {
	
	@Autowired
	private CustomerRepository repository;
	
	@GetMapping(value = "/customers")
	public List<Customer> getCustomerDetails() {
		List<Customer> customerList = repository.findAll();
		return customerList;
		
	}
	
	@GetMapping(value = "/customer")
	public List<Customer> getCustomerDetail() {
		List<Customer> customerList = repository.findByLastName("Yarraguntla");
		return customerList;
		
	}

}
