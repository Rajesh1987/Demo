package com.groovy

class Inheritance_16 implements IntCouple{

	static main(args) {
		BaseElem ele = new BaseElem()
		println(ele.f())
				
	}

}

trait IntCouple {
	
	int x = 1
	int y = 2
	int sum() { getX() + getY()  }
}

class BaseElem implements IntCouple{
	
	int x = 5
	int y = 10
	
	int f() {
		sum()
	}
}
