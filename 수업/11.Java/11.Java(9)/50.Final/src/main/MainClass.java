package main;

public class MainClass {
	public static void main(String[] args) {
		/*
			final == const define
			
			variable
			class
			method
		*/
		
		final int number = 10; 	// ���� -> ���(������ ��, ���� �� ���¼�) 
								// ���Կ뵵
	//	number = 20;			//	val var -> kotlin
		
		final int MEMBERMAX = 20;
		
		int num = number;
		int num1 = MEMBERMAX;
		
		if(num > 0 && num < MEMBERMAX) {
			
		}		
	}
}

/* final */ class Parent{	// final�� �߰��Ǹ� ��ӱ���!
	
	public /* final */ void method() {		
	}
}

class Child extends Parent{
	
	public void method() {	// Over Ride ����!		
	}
}














