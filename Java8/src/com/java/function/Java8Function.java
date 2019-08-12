package com.java.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8Function {

	public static void main(String[] args) {
		
		List<Employee> empList = Arrays.asList(
				 new Employee(1, "Rajesh", "Pittsburg"),
				 new Employee(2, "Chinnu", "Dallas"),
				 new Employee(3, "Nani", "Columbus"),
				 new Employee(4, "Chinni", "Deleware")
				);
		
		
		List<String> empNameList = empList.stream()
											.map(funcEmpToString)
												.collect(Collectors.toList());
		
		 empNameList.forEach(System.out::println);
				
	}  
	
/*	static Function<Employee, String> funcEmpToString = new Function<Employee, String>() {

		@Override
		public String apply(Employee emp) {
			return emp.getName();
		}
	};*/
	
	static Function<Employee, String> funcEmpToString = (Employee e) -> e.getLocation();
	
}


