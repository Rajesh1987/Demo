package com.sorting;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapFiltering {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Rajesh");
		map.put(2, "Nani");
		map.put(3, "Guru");
		map.put(4, "Chinnu");
		map.put(5, "Gundu");
		map.put(6, "Raj");
		
		Map<Integer, String> FilteredMap = map.entrySet().stream()
				.filter(emp ->  emp.getKey() % 2 == 0)
					.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue) );
		
		FilteredMap.entrySet().stream().forEach( entry -> System.out.println(" Key "+ entry.getKey() + " value : "+ entry.getValue()));

	}

}
