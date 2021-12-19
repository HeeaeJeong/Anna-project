package main;

public class MainClass {
	public static void main(String[] args) {
		/*
			final == const define
			
			variable
			class
			method
		*/
		
		final int number = 10; 	// 변수 -> 상수(지정된 수, 변할 수 없는수) 
								// 대입용도
	//	number = 20;			//	val var -> kotlin
		
		final int MEMBERMAX = 20;
		
		int num = number;
		int num1 = MEMBERMAX;
		
		if(num > 0 && num < MEMBERMAX) {
			
		}		
	}
}

/* final */ class Parent{	// final이 추가되면 상속금지!
	
	public /* final */ void method() {		
	}
}

class Child extends Parent{
	
	public void method() {	// Over Ride 금지!		
	}
}














