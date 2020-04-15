package com.numbers;

public class ExponentOfNumber {

	public static void main(String[] args) {
		
		int base = 3, exponent = 4;
		
		int i =0;
		
		int output = 1;
		
		while(i < exponent) {
			
			output = base * output;
			
			i++;
		}
		
		System.out.println("output is : "+ output);
		

	}

}
