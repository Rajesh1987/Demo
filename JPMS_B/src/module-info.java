
module moduleB {
	
	exports com.b;
	opens com.b;
	requires transitive moduleA;
}