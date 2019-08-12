package com.onlyFullStack;

import java.util.ArrayList;
import java.util.List;

public class PeekDemo {

	public static void main(String[] args) {
	
		List<Student> students = new ArrayList<>(); 
		students.add(new Student("Rajesh", "Hyderabad", 30));
		students.add(new Student("Rajesh", "Delhi", 31));
		students.add(new Student("Guru", "Hyderabad", 32));
		students.add(new Student("Nani", "Chennai", 25));
		students.add(new Student("Raj", "Bangalore", 35));
		
		students.stream().peek( s -> System.out.println("before filter "+ s.getName()))
							.filter( s -> s.getLocation().equals("Hyderabad"))
								.peek(s -> System.out.println("after filter "+ s.getName()))
									.forEach(System.out::println);
	}

}
