package com.groovy

class Fields_5 implements Counter {

	static main(args) {
		
		Fields_5 foo = new Fields_5()
		
		println foo.count()
		println foo.count()
		
	}

}

trait Counter {
	
	private int count = 0
	
	 int count() {
		 count += 1 ; 
		 count
	 }
}


