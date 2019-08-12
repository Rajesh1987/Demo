package com.java8.supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Rajesh", "Nani","Guru");
		names.stream().forEach( name -> {
			printNames( () -> name);
		});
	}

	private static void printNames(Supplier<String> supplier) {
		System.out.println(supplier.get());
	}

}
