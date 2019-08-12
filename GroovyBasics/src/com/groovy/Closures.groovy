package com.groovy

class Closures {

	static void main(String[] args) {
		
		def clo = { println "Hello Chinnu ${it}" };
		clo.call("Chinni")

		def list = [1,2,3,4,5]
		list.each { println it }	
		
		list.each({ num -> 
						if( num%2 == 0)
							 println num
					})	
		
	}

}
