package com.array;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		int a[] = { 1, 3, 3, 4, 2, 1, 5, 6, 7, 7, 8, 10 };
	    Arrays.sort(a);
	    int j = 0;
	    for (int i = 0; i < a.length - 1; i++) {
	        if (a[i] != a[i + 1]) {
	            a[j] = a[i];
	            j++;
	        }
	    }
	    a[j] = a[a.length - 1];
	    
	    System.out.println("array length : "+ a.length);
	    for (int i = 0; i <= j; i++) {
	        System.out.println(a[i]);
	    }
	    
	  
	}

}
