package com.cassandra.controller;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cassandra.core.util.CollectionUtils;
import org.springframework.data.cassandra.repository.support.BasicMapId;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cassandra.model.CustomerDetails;
import com.cassandra.repository.CustomerRepository;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerRepository repository;

	@GetMapping(value="customerdetails")
	public List<CustomerDetails> getCustomerDetails() {
		
		Iterable<CustomerDetails> customerDetails = repository.findAll();
		
		List<CustomerDetails> custDetailsList = CollectionUtils.toList(customerDetails);
			
		List<CustomerDetails> sortedList = custDetailsList.stream().sorted(compareById).collect(Collectors.toList());
			
		return sortedList;
			
	}
	
	Comparator<CustomerDetails> compareById = (c1, c2) -> c1.getId() < c2.getId() ? -1 : 1 ;
	
	@GetMapping(value="/customer/{id}")
	public CustomerDetails createCustomerDetails(@PathVariable("id") Integer id ) {
		
		CustomerDetails customer = repository.findOne(BasicMapId.id("id", id));
		
		List<CustomerDetails> findByLastNameList = repository.findByLastName("Yarraguntla");
		if(findByLastNameList != null) {
			System.out.println("last name list size :"+ findByLastNameList.size());
		}
		
		return customer;
	}
	
	@PutMapping(value="/customer/{id}")
	public ResponseEntity<CustomerDetails> updateCustomerDetails(@PathVariable("id") Integer id, @RequestBody CustomerDetails custDetails ) {
		
		CustomerDetails customer = repository.findOne(BasicMapId.id("id", id));
		
		if(customer == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		customer.setFirstName(custDetails.getFirstName());
		customer.setLastName(custDetails.getLastName());
		customer.setAge(custDetails.getAge());
		
		repository.save(customer);
		return new ResponseEntity<CustomerDetails>(customer , HttpStatus.OK);
		
	}
	
	
}
