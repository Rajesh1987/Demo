package com.mongoDB;

public class Test {
	
	public static void main(String[] args) {
		
		String answer = createAnswer();
		System.out.println("answer is : "+ answer);
		
	}

	  // Create a silly answer that's not obvious just by code inspection.  Easier just to get it running!
    private static String createAnswer() {
        int i = 0;
        for (int bit = 0; bit < 16; bit++) {
            i |= bit << bit;
        }
        return Integer.toString(i);
    }
}
