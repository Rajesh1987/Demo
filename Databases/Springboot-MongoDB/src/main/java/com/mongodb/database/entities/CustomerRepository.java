package com.mongodb.database.entities;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, Long> {
	
	  public Customer findByFirstName(String firstName);
	  public List<Customer> findByLastName(String lastName);

}
