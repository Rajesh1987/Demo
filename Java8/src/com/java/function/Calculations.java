package com.java.function;

public class Calculations {

	public static void main(String[] args) {
		
		Calculator addition	=  (a, b) -> a + b;
		
		System.out.println(addition.addition(10, 20));
		
	}
}
