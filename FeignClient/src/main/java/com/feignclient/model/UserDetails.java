package com.feignclient.model;

public class UserDetails {
	
	private String name;
	private String location;
	private String country;
	
	public UserDetails() {}
	
	
	public UserDetails(String name, String location, String country) {
		super();
		this.name = name;
		this.location = location;
		this.country = country;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	

}
