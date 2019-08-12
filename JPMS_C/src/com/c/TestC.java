package com.c;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.a.TestA;
import com.b.TestB;

public class TestC {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		TestB b = new TestB();
		b.m2();
		
		
//	Access private methods in other modules using reflection
 	
/*   Class classB = b.getClass();
		Method methodM2 = classB.getDeclaredMethod("m2");
		methodM2.setAccessible(true);
		methodM2.invoke(b); */
		
		System.out.println(" Transtive dependency ");
		TestA a = new TestA();
		a.m1();

	}

}
