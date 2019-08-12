package com.beginnersBook;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {

	public static void main(String[] args) {
		
		List<String> namesList = new ArrayList<>();
		namesList.add("Rajesh");
		namesList.add("Raj");
		namesList.add("Guru");
		namesList.add("Chinnu");
		
		long count = namesList.stream().filter( name -> name.length() > 4).count();
		System.out.println("names with length > 4 - count is : "+ count); // gives count
		
		List<String> filteredNames = namesList.stream().filter( name -> name.length() > 4).collect(Collectors.toList());
		filteredNames.stream().forEach(System.out:: println); // gives the filtered names
		
	
		
		

	}

}
