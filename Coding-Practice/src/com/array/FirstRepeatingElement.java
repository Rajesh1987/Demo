package com.array;

public class FirstRepeatingElement {

	public static void main(String[] args) {
		
		int[]  input = {10, 5, 3, 4, 3, 5, 6};
		
		boolean elementFound = false;
		
		for (int i = 0; i < input.length; i++) {
			
			if(!elementFound) {
				
				for (int j = i+1; j < input.length; j++) {
					
					if(input[i] == input[j]) {
						System.out.println("first repeated element : "+ input[i]);
						elementFound = true;
					}
					
				}
			}
			

		}



	}

}
