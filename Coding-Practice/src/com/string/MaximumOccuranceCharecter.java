package com.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MaximumOccuranceCharecter {

	public static void main(String[] args) {
	
		String s = "Java";
		
		char[] chars = s.toCharArray();
		
		Map<Character, Integer> map = new HashMap<>();
		
		for (char c : chars) {
			
			if(map.get(c) == null) {
				
				map.put(c, 1);
			} else {
				map.put(c, map.get(c)+1);
			}
		}
		
		System.out.println(map);
		Set<Entry<Character,Integer>> entrySet = map.entrySet();
		
		int maxValue =0;
		char maxKey = 'z';
		
		for (Entry<Character, Integer> entry : entrySet) {
			
			if(entry.getValue() > maxValue ) {
				
				maxKey = entry.getKey();
				maxValue = entry.getValue();
			}			
		}
		
		System.out.println("max key : "+ maxKey + " max value : "+ maxValue);
		
					
	}
}
