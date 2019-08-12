package com.java8.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class CustomFunctionDemo {

	public static void main(String[] args) {
		
		List<Person> persons = Arrays.asList( 
				new Person("Rajesh", "Pittsburgh"),
				new Person("Nani", "Dallas"),
				new Person("Guru", "Chennai"),
				new Person("Chinnu", "Hyderabad")
				
				);
		
		persons.stream().map(locationDetails).filter(l -> l.startsWith("P")).forEach(System.out::println);

	}
	
	static Function<Person, String> locationDetails = person -> person.getLocation();

}
