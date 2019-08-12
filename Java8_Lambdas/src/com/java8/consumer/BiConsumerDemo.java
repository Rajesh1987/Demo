package com.java8.consumer;

import java.util.function.BiConsumer;

public class BiConsumerDemo {

	public static void main(String[] args) {
		
		BiConsumer<Integer, Integer> c1 = (a,b) -> System.out.println(a+b);
		c1.accept(10, 20);

	}

}
