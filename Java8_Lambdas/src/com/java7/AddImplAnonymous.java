package com.java7;

public class AddImplAnonymous {

	public static void main(String[] args) {
		
		Addition addition = new Addition() {

			@Override
			public int add(int a, int b) {
				return a+b;
			}
			
		};
		
		System.out.println(addition.add(10, 20));

	}

}
