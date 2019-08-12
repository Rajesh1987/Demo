package com.algorithms;

public class LinearSearch {

	public static void main(String[] args) {
		
		int arr[] = {10,20, 58, 44, 33};
		int searchElement = 59;
		System.out.println("search key : "+ searchElement + " found at index "+linearSearchMethod(arr, searchElement) );
	}

	private static int linearSearchMethod(int[] arr, int searchElement) {
		
		for(int i=0; i < arr.length; i++) {
			if(arr[i] == searchElement) {
				return i;
			}
		}
		
		return -1;
		
	}

}
