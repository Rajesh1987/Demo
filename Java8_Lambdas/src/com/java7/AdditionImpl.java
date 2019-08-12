package com.java7;

public class AdditionImpl implements Addition {
	
	public static void main(String[] args) {
		
		Addition addition = new AdditionImpl();
		System.out.println(addition.add(10, 20));
		
	}
	
	@Override
	public int add(int a, int b) {
		return a+b;
	}

}
