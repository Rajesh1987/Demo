package com.mkyong.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterMapTest {

	public static void main(String[] args) {
		
		Map<Integer, String> userMap = new HashMap<>();
		userMap.put(1, "Rajesh");
		userMap.put(2, "Nani");
		userMap.put(3, "Chinnu");
		userMap.put(4, "Guru");
		
		Map<Integer, String> filteredMap = userMap.entrySet()
				.stream()
				.filter( map -> !map.getValue().equals("Chinnu"))
				.collect(Collectors.toMap( u -> u.getKey(), u -> u.getValue() ));
		
		System.out.println(filteredMap);
		
	}

}
