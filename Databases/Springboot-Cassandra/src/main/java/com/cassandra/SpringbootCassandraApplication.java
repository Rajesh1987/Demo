package com.cassandra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.cassandra.model.CustomerDetails;
import com.cassandra.repository.CustomerRepository;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class SpringbootCassandraApplication implements CommandLineRunner {
	
	@Autowired
	private CustomerRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCassandraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		clearData();
		saveData();
		
	}

	private void saveData() {
		
		CustomerDetails custDetails  = new CustomerDetails(1, "Rajesh", "Yarraguntla", 30);
		CustomerDetails custDetails2 = new CustomerDetails(2, "Lavanya", "Yarraguntla", 25);
		CustomerDetails custDetails3 = new CustomerDetails(3, "Jon", "Stober", 38);
		CustomerDetails custDetails4 = new CustomerDetails(4, "Lakshmi", "Desaraju", 35);
		CustomerDetails custDetails5 = new CustomerDetails(5, "Paul", "Deepu", 33);
		CustomerDetails custDetails6 = new CustomerDetails(6, "Naresh", "Sunikireddy", 42);
		CustomerDetails custDetails7 = new CustomerDetails(7, "Raja", "Padbanaban", 33);
		CustomerDetails custDetails8 = new CustomerDetails(8, "Guna", "Sekaran", 29);
		CustomerDetails custDetails9 = new CustomerDetails(9, "Nick", "Ohio", 26);
		CustomerDetails custDetails10 = new CustomerDetails(10, "Jeya", "Rajendran", 28);
		CustomerDetails custDetails11 = new CustomerDetails(11, "Abhishek", "Acharya", 33);
		
		repository.save(custDetails);
		repository.save(custDetails2);
		repository.save(custDetails3);
		repository.save(custDetails4);
		repository.save(custDetails5);
		repository.save(custDetails6);
		repository.save(custDetails7);
		repository.save(custDetails8);
		repository.save(custDetails9);
		repository.save(custDetails10);
		repository.save(custDetails11);
		
	}

	private void clearData() {
		repository.deleteAll();		
	}
}
