package com.array;

public class SumEqualsGivenNumber {

	public static void main(String[] args) {
	
		int[] numbers = {0,1,3,5,2,10,25,17};
		
		int sum = 15;
		
		for (int i = 0; i < numbers.length; i++) {
			
			for (int j = i+1; j < numbers.length; j++) {

				if(numbers[i] + numbers[j] == sum) {
					System.out.println("numbers pair is : "+ numbers[i] + " and "+ numbers[j]);
				}
				
			}
		}

	}

}
