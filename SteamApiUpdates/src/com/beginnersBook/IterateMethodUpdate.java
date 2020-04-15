package com.beginnersBook;

import java.util.stream.IntStream;

public class IterateMethodUpdate {

	public static void main(String[] args) {
	
		IntStream.iterate(1, n -> n<30, n -> n*3).forEach(n -> System.out.println(n));

	}

}
