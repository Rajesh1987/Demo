package com.string;

public class CharacterIsAlphabet {

	public static void main(String[] args) {
		
		char c = 'R';
		
		if( (c >= 'a' && c <= 'z') || ( c >= 'A') && c <= 'Z' ) {
			
			System.out.println("Char is alphabet");
		} else {
			System.out.println("Char is not alphabet");
		}

	}

}
