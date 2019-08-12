package com.java8.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		
		//Example 1 predicate String
		Predicate<String> predicateString = s -> s.equals("Java Code Geek");
		System.out.println("Predicate string : "+ predicateString.test("Java Code Geek"));
		
		//Example 2 predicate Integer
		Predicate<Integer> predicateInteger = i -> i > 0;
		System.out.println("Predicate Integer : "+ predicateInteger.test(-9));
	
		//Example 3 predicate list
		List<String> names = Arrays.asList("Rajesh", "Guru", "Nani");
		Predicate<String> namesPredicate = n -> n.startsWith("R");
		names.stream().filter(namesPredicate).forEach(n -> System.out.println("Names starts with R : " +n));
		
		
		//Example 4 predicate default methods
		Predicate<String> predicate = s -> s.equals("Java");
		
		Predicate<String> predicateAnd = predicate.and(s -> s.length() > 3);
		System.out.println("predicate And : "+ predicateAnd.test("Java"));
	}

}
