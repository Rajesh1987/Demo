package com.java8.supplier;

import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		
		Supplier<Person> supplier = () -> new Person("Rajesh", "Pittsburgh");
	
		
		System.out.println(supplier.get());

	}

}
