package com.groovy

class MultipleInheritance implements B, A {

	static main(args) {
		
		MultipleInheritance i = new MultipleInheritance()
		
		println i.exec()
		
	}

}

trait A {
	String exec() { "A" }
}

trait B {
	String exec() { "B" }
}
