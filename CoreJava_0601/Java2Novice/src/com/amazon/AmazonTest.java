package com.amazon;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AmazonTest {

	public static void main(String[] args) {
		
		List<Coordinates> coordinates = new ArrayList<>();
		coordinates.add(new Coordinates(1, 2));
		coordinates.add(new Coordinates(4, 3));
		coordinates.add(new Coordinates(3, 3));
		coordinates.add(new Coordinates(2, 2));
		
		findNearestRestarents(coordinates, 2);
		
  }
	
	private static void findNearestRestarents(List<Coordinates> coordinates, int n ) {
	
		List<Coordinates> sortedCoordinates = coordinates.stream().sorted().collect(Collectors.toList());
		sortedCoordinates.forEach( c -> System.out.println(c.getX()));
	}

}
