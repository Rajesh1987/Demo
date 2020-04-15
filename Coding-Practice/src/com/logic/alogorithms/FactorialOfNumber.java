package com.logic.alogorithms;

public class FactorialOfNumber {

	public static void main(String[] args) {
		
		int n = 5;
		
		int factorial = 1;
		
		for(int i =n; i > 0; i--) {
			
			factorial = i * factorial;
			System.out.println(factorial);
			
		}
		
		System.out.println("factorial is :"+ factorial);

	}

}
