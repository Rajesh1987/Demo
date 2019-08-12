package com.groovy

import groovy.xml.MarkupBuilder

class GroovyBasics {
	
	int id
	String name;
	
	int marks1
	int marks2
	int marks3
	
	int total() {
		return marks1 + marks2+ marks3
	}
	
	
	static void main(String[] args) {

		GroovyBasics student = new GroovyBasics();
		student.id = 1
		student.name = "RajLavanya"
		student.marks1 = 100
		student.marks2 = 95
		student.marks3 = 87
		
		println(student.total())
	
   }
	
}
