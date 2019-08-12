package com.groovy

class Composition_6 implements FlyingAbility, SpeakingAbility{
	
	//over riding the default implementation
	String speak() {
		"In Composition speak"
	}
	
	static void main(String[] args) {
		
		Composition_6 c = new Composition_6()
		println c.fly()
		println c.speak()
		
	} 

}

trait FlyingAbility {
	
	String fly() {
		"I am flying"
	}
}

trait SpeakingAbility {
	
	String speak() {
		"I am speaking"
	}
}
