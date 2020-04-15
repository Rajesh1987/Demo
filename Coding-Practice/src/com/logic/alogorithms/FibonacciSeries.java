package com.logic.alogorithms;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int count = 10;
		
		int first = 0;
		int second = 1;
		
		System.out.println(first);
		System.out.println(second);
		
		for (int i=0; i < count -2 ; i++) {
			
			int temp = first + second;
			
			first = second;
			
			second = temp;
			
			System.out.println(temp);
		}
		
		

	}

}
