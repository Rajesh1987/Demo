package com.string;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String s = "Java";
		String output = "";
		boolean duplicates = false;
		
		
		
		char[] charArray = s.toCharArray();
				
		for (int i = 0; i < charArray.length; i++) {
			
			for (int j = 0 ; j < output.length(); j++) {
				
				if(charArray[i] == output.charAt(j)) {

					duplicates = true;
				}
				
			}
			
			if(!duplicates) {
				
				output = output.concat(String.valueOf(charArray[i]));
				System.out.println(output);
			}
			
			
		}
	}

}
