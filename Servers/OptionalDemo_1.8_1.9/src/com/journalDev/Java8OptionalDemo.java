package com.journalDev;

import java.util.Optional;

public class Java8OptionalDemo {

	public static void main(String[] args) {
		
		Optional<Integer> opt1 = division(4,2);
		opt1.ifPresent(x -> System.out.println("Option1 result found :  "+ x));
		
		Optional<Integer> opt2 = division(4,0);
		opt2.ifPresent(x -> System.out.println("Option2 result found : "+ x));
		
		System.out.println("Option 2 result not found, default value is : "+ opt2.orElse(new Integer(0)));
		
		if(opt2.isPresent()) {
			System.out.println("Option2 : result found");
		} else {
			System.out.println("Option2 : result not found");
		}

	}
	
	private static Optional<Integer> division(Integer i1, Integer i2) {
		if(i2 ==0) return Optional.empty();
		else {
			Integer i3 = i1 / i2;
			return Optional.of(i3);
		}
	}

}
