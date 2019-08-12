package com.onlyFullStack;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Map_FlatMap_Stackoverflow {

	public static void main(String[] args) {
		
		Parcel amazon = new Parcel("Amazon", "Phone", "Laptop");
		Parcel ebay = new Parcel("Ebay", "Watche", "Headsets");
		
		List<Parcel> parcels = Arrays.asList(amazon, ebay);
		
		List<List<String>> parcelMap = parcels.stream().map(Parcel::getItems).collect(Collectors.toList());
		System.out.println("map : "+ parcelMap);
		
		List<String> mapToFlatMap = parcelMap.stream()//.map(s -> s)
														.flatMap(Collection :: stream)
															.collect(Collectors.toList());
		System.out.println("map to flat map : "+ mapToFlatMap );
		
		List<String> parcelFlatmap = parcels.stream().map(Parcel::getItems)
													  .flatMap(Collection::stream)
													  	.collect(Collectors.toList());
		System.out.println("flat map : "+ parcelFlatmap);

	}

}
