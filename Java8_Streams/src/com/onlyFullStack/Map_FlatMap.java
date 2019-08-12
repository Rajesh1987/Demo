package com.onlyFullStack;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Map_FlatMap {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>(); 
		students.add(new Student("Rajesh", "Hyderabad", 30));
		students.add(new Student("Rajesh", "Delhi", 31));
		students.add(new Student("Guru", "Hyderabad", 32));
		students.add(new Student("Nani", "Chennai", 25));
		students.add(new Student("Raj", "Bangalore", 35));
		
		Integer age = students.stream().filter( s -> s.getName().equals("Guru")).map( s -> s.getAge()).findAny().orElse(0);
		System.out.println("age is : "+ age);
		
		List<String> names = students.stream().map( s -> s.getName()).collect(Collectors.toList());
		System.out.println("names : "+ names);
	}

}
