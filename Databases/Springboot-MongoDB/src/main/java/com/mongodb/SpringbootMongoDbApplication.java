package com.mongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mongodb.database.entities.Customer;
import com.mongodb.database.entities.CustomerRepository;

@SpringBootApplication
public class SpringbootMongoDbApplication implements CommandLineRunner{
	
	@Autowired
	private CustomerRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMongoDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		repository.deleteAll();
		
		repository.save(new Customer(1, "Rajesh", "Yarraguntla"));
		repository.save(new Customer(2, "Lavanya", "Yarraguntla"));
		repository.save(new Customer(3, "Chinni", "Chinni"));
		repository.save(new Customer(4, "Chinnu", "Chinnu"));
	}
}
