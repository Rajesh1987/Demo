package com.java.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PersonJobDemo {

	public static void main(String[] args) {
		
		Person person = new Person(1, "Working for BOA");
		Job job = mapPersonToJob.apply(person);
		
		System.out.println("Job id :" + job.getJobDesc());
		
		
		List<Person> persons = Arrays.asList(
				new Person(1, "Working for PNC"),
				new Person(2, "Working for CITI"),
				new Person(3, "Working for CHASE")
			);
		
		List<Job> jobs  =   persons.stream()
									.map(mapPersonToJob)
										.collect(Collectors.toList());
		
		List<Integer> jobIds  =   persons.stream()
											.map(mapPersonIdToJob)
												.collect(Collectors.toList());
		
		System.out.println("Jobs list size  "+jobs.size());
		System.out.println("Job id for index 2 is : "+ jobIds.get(2));
				

	}
	
	
	static Function<Person, Job> mapPersonToJob = new Function<Person, Job>() {

		@Override
		public Job apply(Person person) {
			Job job = new Job(person.getPersonId(), person.getDesc());
			return job;
		}
	};
	
	static Function<Person, Integer> mapPersonIdToJob = new Function<Person, Integer>() {

		@Override
		public Integer apply(Person person) {
		
			Integer id = person.getPersonId();
			return id;
			
		}
	};

}
