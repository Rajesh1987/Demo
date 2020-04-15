package com.string.codingBat;

public class DoubeChar {

	public static void main(String[] args) {
		
		// the --> tthhee
	
		String s = "Hello";
		char[] charArray = s.toCharArray();
		char[] outputArray = new char[s.length() * 2];
		
		int j= 0;
		
		for (int i = 0; i < charArray.length; i++) {
			
			char c = charArray[i];
			
			outputArray[j] = c;
			outputArray[++j] = c;
			
			j++;
			
		}

		System.out.println(new String(outputArray));
	}

}
