package com.string.codingBat;

public class CountCode {

	public static void main(String[] args) {
		
		// Method 1
		String s = "Hello I am Rajesh. Hello Rajesh";
	
		String word = "Hello";
		
		int count = 0;
		
		String[] split = s.split(" ");
		
		for(int i=0; i<split.length ; i++) {
			
			if(word.equals(split[i])) {
				count ++;
			}
		}
		
		System.out.println("count using method 1 : "+ count);
		
		// Method 2 : 
		
		String s1 = "JavaCodeJavaExampleJavaJava";
		
		int count1 = s1.split("Java", -1).length - 1 ;
		
		System.out.println("count by method 2 :"+ count1);
		
		

	}

}
