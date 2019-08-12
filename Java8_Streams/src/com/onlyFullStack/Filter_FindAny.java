package com.onlyFullStack;

import java.util.ArrayList;
import java.util.List;

public class Filter_FindAny {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>(); 
		students.add(new Student("Rajesh", "Hyderabad", 30));
		students.add(new Student("Rajesh", "Delhi", 31));
		students.add(new Student("Guru", "Hyderabad", 32));
		students.add(new Student("Nani", "Chennai", 25));
		students.add(new Student("Raj", "Bangalore", 35));
		
		System.out.println("Executing filters");
		
		System.out.println("students who live in Hyderabad");
		students.stream().filter( s -> s.getLocation().equals("Hyderabad")).forEach(System.out :: println);
		
		System.out.println("students whose names starts with Rajesh and return null if not found");
		
		Student student = students.stream().filter( s -> s.getName().equals("Rajesh")).findAny().orElse(null);
		System.out.println(student);
	}

}
