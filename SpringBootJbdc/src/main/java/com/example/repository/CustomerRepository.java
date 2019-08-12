package com.example.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.model.Customer;

@Repository
public class CustomerRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private String sql = "select * from employee";

	public List<Customer> findAll() {
		
		
		
		List<Customer> result = jdbcTemplate.query(sql, 
				(rs, rowNum) -> new Customer(rs.getInt("id"), rs.getString("name"), rs.getString("email"))
				);

		/* with out JAVA 8		
		List<Customer> query = jdbcTemplate.query(sql, new RowMapper<Customer>() {

			@Override
			public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new Customer(rs.getInt("id"), rs.getString("name"), rs.getString("email"));
			}
			
		});*/
		
		return result;
		
	}
}
