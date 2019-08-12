package com.stackify;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsPartitioning {

	public static void main(String[] args) {
		
		List<Integer> integers = Arrays.asList(2,4,5,6,8,9);
		List<String> names = Arrays.asList("Rajesh", "Nani", "Guru", "Raj");
		
		Map<Boolean, List<Integer>> partitionedList = integers.stream().collect(Collectors.partitioningBy( i -> i % 2 == 0));
		System.out.println(partitionedList);
		
		Map<Boolean, List<String>> partitionedNames = names.stream().collect( Collectors.partitioningBy(name -> name.startsWith("R")));
		System.out.println(partitionedNames);
	}

}
