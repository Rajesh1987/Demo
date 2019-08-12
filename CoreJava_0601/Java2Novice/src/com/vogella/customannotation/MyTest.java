package com.vogella.customannotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyTest {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		AnnotationRunner runner = new AnnotationRunner();
		Method[] methods = runner.getClass().getMethods();
		
		for(Method method : methods) {
			CarRun annotation = method.getAnnotation(CarRun.class);
			if(null != annotation) {
				System.out.println("name :"+ annotation.name() + " year :"+ annotation.year());
				method.invoke(runner);
			}
		}
	}

}
