package com.groovy

class RuntimeImplOfTraits_11 implements Something{

	static void main(String[] args) {
		
		def s = new Something() as Extra
		
		s.doSomething()
	}
}

trait Extra {
	
	String extra() { "I am an extra method" }
}

trait Something {
	
	String doSomething() {
		"Some thing"
	}
}
