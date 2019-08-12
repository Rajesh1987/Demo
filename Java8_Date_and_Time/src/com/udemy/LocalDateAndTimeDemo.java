package com.udemy;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateAndTimeDemo {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now(); // Date info 
		System.out.println(date);

		LocalTime time = LocalTime.now(); // Time info
		System.out.println(time);
		
		System.out.println(date.getMonthValue());
		System.out.println(time.getHour());
		
		LocalDateTime dateTime = LocalDateTime.now();  // Date and Time info
		System.out.println(dateTime);
		
		LocalDateTime dt = LocalDateTime.of(1987, 05, 12, 16, 48);
		System.out.println(dt.plusMonths(6));
	}

}
