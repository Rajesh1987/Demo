package com.beginnersBook;

import java.util.stream.Stream;

public class TakeWhileDropWhileDemo {

	public static void main(String[] args) {
		
		Stream<Integer> dropWhileStream = Stream.of(11, 22, 40, 60, 100, 10);
		Stream<Integer> takeWhileStream = Stream.of(11, 22, 40, 60, 100, 10);
		
		System.out.println("Drop while");
		dropWhileStream.dropWhile( n -> n < 50 ).forEach( n -> System.out.println(n));
		
		System.out.println("Take while");
		takeWhileStream.peek( n -> System.out.println( "processing element : "+ n))
							.takeWhile( n -> n > 50).forEach( n -> System.out.println(n));
		

	}

}
