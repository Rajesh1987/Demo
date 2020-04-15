package com.beginnersBook;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
	
	@SafeVarargs
	private void print(List<String>... names) {
		for(List<String> name : names) {
			System.out.println(name);
		}
	}

	public static void main(String[] args) {
		
		Demo demo = new Demo();
		
		List<String> namesList = new ArrayList<>();
		namesList.add("Rajesh");
		namesList.add("Nani");
		namesList.add("Guru");
		
		namesList = namesList.stream().sorted((n1,n2) -> n1.compareTo(n2)).collect(Collectors.toList());
		
		demo.print(namesList);
		

	}

}
