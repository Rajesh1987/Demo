package com.cassandra.repository;

import java.util.List;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;

import com.cassandra.model.CustomerDetails;

public interface CustomerRepository extends CassandraRepository<CustomerDetails> {
	
	@Query(value="select * from customer where lastname=?0 ALLOW FILTERING")
	public List<CustomerDetails> findByLastName(String lastName);
	
}
