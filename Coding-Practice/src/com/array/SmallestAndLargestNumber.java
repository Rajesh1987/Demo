package com.array;

public class SmallestAndLargestNumber {

	public static void main(String[] args) {
		
		int[] numbers = {0,1,2,4,7,8,15,25,17};
		
		int smallest = numbers[0];
		int largest = numbers[1];
		
		for (int i = 0; i < numbers.length; i++) {
			
			if(numbers[i] > largest) {
				largest = numbers[i];
			}
			
			if(numbers[i] < smallest) {
				smallest = numbers[i];
			}
			
		}
		System.out.println("largest number : "+ largest + " smallest number : "+ smallest);

	}

}
