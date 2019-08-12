package com.beginnersBook;

import java.util.stream.Stream;

public class NullableMethod {

	public static void main(String[] args) {
		
		Stream<String> nullableStream = Stream.ofNullable(null);
		
		System.out.println(nullableStream.findFirst());
		
		nullableStream.forEach(s -> System.out.println(s));
	}

}
