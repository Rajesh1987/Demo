package com.string;

public class ReverseOfString {

	public static void main(String[] args) {
		
		String s = "hello";
		char[] charArray = s.toCharArray();
		
		int i =0;
		int j = charArray.length -1;
		
		while(i < j) {
			
			char temp = charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = temp;
			
			i++;
			j--;
		}
		
		System.out.println(String.valueOf(charArray));
		
	}

}
