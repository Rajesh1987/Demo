package com.numbers;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int n = 25;
		
		int i =2;
		
		boolean primeNumber = true;
		
		while(i < n) {
			
			if( n % i == 0) {
				
				primeNumber = false;
				break;
			}
			
			System.out.println(i);
			
			i++;
		}
		
		System.out.println(primeNumber);

	}

}
