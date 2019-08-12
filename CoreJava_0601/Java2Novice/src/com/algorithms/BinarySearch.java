package com.algorithms;

public class BinarySearch {

	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		
		int arr[] = {2,4,6,8,10,12,14};
		int searchElement = 8;
		System.out.println("search element :"+ searchElement + " found at index "+ bs.binarySearch(arr, searchElement) );
		
	}

	private int binarySearch(int[] arr, int searchElement) {
		
		int start = 0;
		int end = arr.length -1;
		while(start <= end) {
			
			int mid = start + end / 2;
			if(searchElement == arr[mid]) {
				return mid;
				
			}
			if(searchElement < arr[mid]) {
				end = mid-1;
			} else {
				start = mid+1;
			}
		}

		
		return -1;
		
		
	}

}
