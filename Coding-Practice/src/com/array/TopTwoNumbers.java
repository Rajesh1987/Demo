package com.array;

public class TopTwoNumbers {

	public static void main(String[] args) {
		
		int[] numbers = {1,5,25,8,20};
		
		int max = 0;
		int second = 0;
		for (int i = 0; i < numbers.length; i++) {
			
			if(numbers[i] > max ) {
				second = max;
				max = numbers[i] ;
			}
			
			if(numbers[i] > second && numbers[i]!= max) {
				second = numbers[i];
			}
		}
		
		System.out.println("max element : "+ max + " second max : "+ second);
	}

}
