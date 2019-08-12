package com.mkyong.java8;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		
		Integer i1 = null;
		Integer i2= new Integer(10);
		
		Optional<Integer> o1 =  Optional.ofNullable(i1);
		Optional<Integer> o2 = Optional.of(i2);
		
		System.out.println(o1.isPresent());
		System.out.println(o2.isPresent());
		Integer int1 = o1.orElse(new Integer(0)) ;
		Integer int2 = o2.get();
		System.out.println(int1 + int2);
		

		
	}

}
