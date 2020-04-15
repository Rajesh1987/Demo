package com.numbers;

public class AmstrongNumber {

	public static void main(String[] args) {
		
		int n = 153;
		int ns = n;
		
		int output = 0;
		
		while(n > 0) {
			
			int temp = n % 10;
			
			output = (int) (output + Math.pow(temp, 3));
			
			n = n/10;
		}
		
		if(ns == output) {
			
			System.out.println("given number is amstrong number");
		} else {
			System.out.println("given number is not an amstrong number");
		}

	}

}
