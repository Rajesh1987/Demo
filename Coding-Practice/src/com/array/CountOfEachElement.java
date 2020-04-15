package com.array;

import java.util.HashMap;
import java.util.Map;

public class CountOfEachElement {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,1,1,3,3,3,2,1,3};
		
		Map<Integer, Integer> numbersMap = new HashMap<>();
		
		for (int number : numbers) {
			
			if(! numbersMap.containsKey(number)) {
				numbersMap.put(number, 1);
			} else {
				numbersMap.put(number, numbersMap.get(number)+1);
			}
		}
		
		System.out.println(numbersMap);

	}

}
