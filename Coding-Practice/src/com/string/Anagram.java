package com.string;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String s1 = "stoppp";
		String s2 = "topspp";
		
	
		
		boolean anagram = checkAnagram(s1,s2);
		
		System.out.println("anagram : "+ anagram);

	}

	private static boolean checkAnagram(String s1, String s2) {
		
		boolean anagram = false;
		
		if(s1.length() == s2.length()) {
			
			anagram = true;
			
			char[] charArray1 = s1.toCharArray();
			char[] charArray2 = s2.toCharArray();
			
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			
			for (int i = 0; i < charArray1.length; i++) {
				
				if(charArray1[i] != charArray2[i]) {
					anagram = false;
					break;
				}
				
			}
		}
		
		return anagram;
		
	}

}
