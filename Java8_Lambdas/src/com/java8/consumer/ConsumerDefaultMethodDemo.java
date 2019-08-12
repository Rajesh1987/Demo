package com.java8.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDefaultMethodDemo {

	public static void main(String[] args) {
		
		Consumer<Integer> consumer =  (i) -> System.out.println(" "+i);
		
		Consumer<Integer> consumerWithThen = consumer.andThen(i -> System.out.println("printed "+i));
		
		List<Integer> integerList = Arrays.asList(10,20,30,50);
		
	//	integerList.stream().forEach(consumer); // consumer using streams
		
		printList(integerList, consumerWithThen); // consumer using accept method

	}
	
	private static void printList(List<Integer> integerList, Consumer<Integer> consumer) {
		
		for(Integer i : integerList) {
			consumer.accept(i);
		}
		
	}

}