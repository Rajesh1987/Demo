package com.cassandra.model;

import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table(value="customer")
public class CustomerDetails {
	
	@PrimaryKey
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	
	public CustomerDetails() { }
	
	public CustomerDetails(int id, String firstName, String lastName, int age) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "CustomerDetails [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ "]";
	}
	
	
}
