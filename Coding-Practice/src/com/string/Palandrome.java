package com.string;

public class Palandrome {

	public static void main(String[] args) {
		
		String s = "aabbaa";
		
		String reverse = "";
		
		for (int i = s.length()-1 ; i >= 0 ; i--) {
			
			reverse = reverse +  s.charAt(i);
			
		}
		
		if(s.equals(reverse)) {
			System.out.println("string is palandrome");
		} else {
			System.out.println("String is not a palandrome");
		}
		
		

	}

}
