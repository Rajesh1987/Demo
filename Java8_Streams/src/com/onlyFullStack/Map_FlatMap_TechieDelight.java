package com.onlyFullStack;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map_FlatMap_TechieDelight {

	public static void main(String[] args) {
		
		List<Integer> a = Arrays.asList(1,2,3);
		List<Integer> b = Arrays.asList(4,5);
		List<Integer> c = Arrays.asList(6,7,8);

		List<List<Integer>> listOfListOfInts = Arrays.asList(a,b,c);
		
		System.out.println("before flat map :"+ listOfListOfInts);
		
		List<Integer> listOfInts = listOfListOfInts.stream()
													 .flatMap( list -> list.stream())
													 	.collect(Collectors.toList());
		
		System.out.println("after flat map : "+ listOfInts);
	}

}
