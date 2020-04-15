package com.array;

public class MissingNumber {

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4,5,6,8,9,10};
		
		// first way
		int numsTotal = 0;
		
		int n = 10;
		int totalSum = ( n * (n+1) ) / 2 ;

		for (int i = 0; i < nums.length; i++) {
			
			numsTotal += nums[i];
		}
		
		System.out.println("missing numbers = : " + (totalSum - numsTotal) );
		
		// second way 
		
		int temp = 1;
		for (int i = 0; i < nums.length; i++) {
			
			if( temp != nums[i]) {
				System.out.println("missing number - second way : "+ temp);
				break;
			}
			temp++;
			
			
		}
	}

}
