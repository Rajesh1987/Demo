package com.beginnersBook;

//Abstract class
abstract class MyClass<T> {
	
	abstract T add(T x, T y) ;
}


public class Demo {

	public static void main(String[] args) {
		
		MyClass<Integer> myClass = new MyClass<>() {

			@Override
			Integer add(Integer x, Integer y) {
				return x+y;
			}
		};
		
		Integer sum = myClass.add(10, 20);
		System.out.println("sum is :"+ sum);
		
	}

}
