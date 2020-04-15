package com.array;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,5, 6 };
		
		int i =0;
		int j = numbers.length -1;
		
		while (i < j) {
		
			int temp = numbers[i];
			numbers[i] = numbers[j];
			numbers[j] = temp;
			
			i++;
			j--;
			
		}
		
		Arrays.stream(numbers).forEach(System.out :: println);

	}

}
