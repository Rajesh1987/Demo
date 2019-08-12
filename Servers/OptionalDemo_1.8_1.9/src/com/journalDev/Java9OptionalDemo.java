package com.journalDev;

import java.util.Optional;

public class Java9OptionalDemo {

	public static void main(String[] args) {
		Optional<Integer> opt1 = division(4,2);
		
		opt1.ifPresentOrElse(x -> System.out.println("Opt1 result found : "+x), () -> System.out.println("Opt1 result not found"));
				
		Optional<Integer> opt2 = division(4,0);
		opt2.ifPresentOrElse(x -> System.out.println("Opt1 result found : "+x), () -> System.out.println("Opt2 result not found"));
		

	}
	
	private static Optional<Integer> division(Integer i1, Integer i2) {
		if(i2 ==0) return Optional.empty();
		else {
			Integer i3 = i1 / i2;
			return Optional.of(i3);
		}
	}

}
