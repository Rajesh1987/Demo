package com.java8.function;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		
		Function<Integer, String> func = (t) -> {
			if(t%2 ==0) return "even number ";
			else return "odd number";
		};
		
		System.out.println("10 is an :" +func.apply(10));
		System.out.println("5 is a : " +func.apply(5));
	}

}
