package com.b;

import com.a.TestA;

public class TestB {
	
	public void m2() {
		
		System.out.println(" In module B ");
		
		TestA a = new TestA();
		
		a.m1();
	}

}
