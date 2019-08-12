package com.onlyFullStack;

import java.util.Arrays;
import java.util.List;

public class Parcel {
	
	private String name;
	private List<String> items;
	
	public Parcel() { }	
	
	public Parcel(String name, String... items) {
		super();
		this.name = name;
		this.items = Arrays.asList(items);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getItems() {
		return items;
	}
	public void setItems(List<String> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Parcel [name=" + name + ", items=" + items + "]";
	}
	
	
	

}
