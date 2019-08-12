package com.vogella.customannotation;

public class AnnotationRunner {
	
	public void method1() {
		System.out.println("in method1");
	}
	
	@CarRun(name = "Honda", year = 2013)
	public void method2() {
		System.out.println("in method2");
	}
	
	@CarRun
	public void method3() {
		System.out.println("in method3");
	}
	
	@CarRun(name = "Toyota", year = 2018)
	public void method4() {
		System.out.println("in method4");
	}

}
