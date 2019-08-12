package com.java8.function;

import java.util.function.Function;

public class FunctionComposeDemo {

	public static void main(String[] args) {
	
		Function<Integer, Integer> f1 = t -> t*2;
		Function<Integer, Integer> f2 = t -> t - 5;
		
		System.out.println("And then :" +f1.andThen(f2).apply(10));
		System.out.println("Compose : "+ f1.compose(f2).apply(10));
		

	}

}
