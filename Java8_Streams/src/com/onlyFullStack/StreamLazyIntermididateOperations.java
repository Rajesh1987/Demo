package com.onlyFullStack;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamLazyIntermididateOperations {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Executing lazy operations");
		List<String> names = Arrays.asList("Rajesh","Guru", "Nani");
		Stream<String> mappedNames = names.stream().map( name -> {
			System.out.println("during mapping");
			return name.toUpperCase();
		});
		
		System.out.println("After map statement");
		Thread.sleep(5000);
		mappedNames.forEach(System.out::println);

	}

}
