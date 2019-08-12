package com.journalsDev.localVariable;

import java.util.ArrayList;
import java.util.List;

public class LocalVariableTypeInference {

	public static void main(String[] args) {
		
		
		var listofStrings = new ArrayList<String>();  // infers ArrayList<String>
		var stream = listofStrings.stream(); // infers Stream<String>
		var var =5; //Syntactically correct;
		
		var numbers = List.of(1, 2, 3, 4, 5);
		
		//Index of enhanced loop
		for(var number : numbers) {
			System.out.println(number);
		}
		
		//local variable declared in loop
		System.out.println("in for loop");
		for(var i=0; i < numbers.size(); i++ ) {
			System.out.println(numbers.get(i));
		}

	}

}
