package com.string;

public class CharecterAtGivenIndex {

	public static void main(String[] args) {
		
		String s = "Java is good exercise";
		
		s.toUpperCase();
		
		int index = 3;
		
		System.out.println("character at position " + index + " is " + s.charAt(index));
		
		System.out.println(s.contains("is g"));

	}

}
