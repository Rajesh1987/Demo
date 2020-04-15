package com.array;

import java.util.Arrays;
import java.util.List;

public class ContainsNumber {

	public static void main(String[] args) {
	
		Integer[] numbers = {1,3,5,2,6,7,9};
		
		int num =4;
		
		// Method 1 : Linear search
		for (int i : numbers) {
			
			if(i == num) {
				System.out.println(num + " is present in the array");
			}
		}
		
		// Method 2 : Binary search
		
		Arrays.sort(numbers);
		
		int binarySearch = Arrays.binarySearch(numbers, num);
		
		boolean contains = binarySearch > 0 ? true : false ;
		
		System.out.println( num + " is present : " + contains);
		
		// Method 3 - List contains.
		
		List<Integer> numList = Arrays.asList(numbers);

		System.out.println(num + " is present " + numList.contains(num));
		
		// Method 4 : Using Steams
		
		boolean found = Arrays.stream(numbers).anyMatch( i -> i == num);
		System.out.println("number is present : "+ found);
		
		

	}

}
