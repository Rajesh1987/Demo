package com.array;

import java.util.Arrays;

public class KthLargestElement {

	public static void main(String[] args) {
		
		int[] numbers = {10,20,30,40,50};
		Arrays.sort(numbers);
		
		int n = 4;
		
		System.out.println(numbers[numbers.length-n]);

	}

}
