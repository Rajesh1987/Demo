package com.numbers;

public class Palandrome {

	public static void main(String[] args) {

		int n = 12121;
		
		int givenNumber = n;
		int reverse = 0;
		
		while(n > 0) {
			reverse = reverse * 10 + n % 10;
			n = n/10;
		}
		
		System.out.println(reverse);
		
		if(givenNumber == reverse) {
			System.out.println("Given number is palandrome");
		} else {
			System.out.println("Given number is not a palandrome");
		}

	}

}
