package com.array;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5,6,7};
		
		int remove = 3;
		
		// Method 1
		
		int[] updatedArray = new int[numbers.length -1];
		int k =0;
		
		for (int i = 0; i < numbers.length; i++) {
			
			if(numbers[i] != remove) {
				
				updatedArray[k] = numbers[i];
				k++;
			}
		}
		
		Arrays.stream(updatedArray).forEach(System.out :: println);
		
		// Method 2 
		int j = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			
			if(numbers[i] != remove) {
				
				numbers[j] = numbers[i];
				
				j++;
			}
			
		}
		
		int[] copyOf = Arrays.copyOf(numbers,j);
		Arrays.stream(copyOf).forEach(System.out::println);
		
	}

}
