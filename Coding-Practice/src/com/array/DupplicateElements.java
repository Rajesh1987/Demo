package com.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.Set;

public class DupplicateElements {

	public static void main(String[] args) {
		
		int[] numbers = {0,3,3,2,1};
		
		// first way 
		for (int i = 0; i < numbers.length; i++) {
			
			for (int j = i+1; j < numbers.length; j++) {
				
				if(numbers[i] == numbers[j]) {
					System.out.println("1st way - Duplicate element : "+ numbers[i]);
				}
			}
		}
		
		// Method 2 : Using Hash Map
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int number : numbers) {
			
			if(map.get(number) == null) {
				map.put(number, 1);
			} else {
				map.put(number, map.get(number)+1);
			}
		}
		
		Set<Entry<Integer,Integer>> entrySet = map.entrySet();
		
		for (Entry<Integer, Integer> entry : entrySet) {
			
			if(entry.getValue() > 1 ) {
				System.out.println("duplicate key : "+ entry.getKey() + " value " + entry.getValue());
			}
		}
		
		// Method 3 : Hash Set
		Set<Integer> set = new HashSet<>();
		
		for (Integer number : numbers) {
			if(! set.add(number)) {
				System.out.println("Duplicate number : "+ number);
			}
		}
		
		// Method 4 : Java 8 stream
		
		Set<Integer> uniqueNumbers = new HashSet<>();
		Set<Integer> duplicates = Arrays.stream(numbers).filter( number -> !uniqueNumbers.add(number)).boxed().collect(Collectors.toSet());
		
		System.out.println("Duplicate numbers: "+ duplicates.toString());
		
		

	}

}
