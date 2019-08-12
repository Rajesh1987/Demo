package com.groovy

class SimpleInheritance_8_1 implements Polite {

	static main(args) {
	
		def person = new SimpleInheritance_8_1(name : "Raj Lavanya")
		println person.introduce()

				
	}
}

trait Named {
	String name
}

trait Polite extends Named {
	
	String introduce() {
		"Hello , I am $name"
	}
}
