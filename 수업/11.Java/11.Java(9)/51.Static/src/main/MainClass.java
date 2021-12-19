package main;

import cls.MyClass;
import cls.YouClass;

public class MainClass {
	
	static int number = 1;
	
	public static void main(String[] args) {
		
		
		/*
			static : 정적 <=> 동적(dynamic)
			
			variable
			method
		*/
		
		MyClass cls = new MyClass();		
		cls.func();
		cls.func();
		cls.func();
		
		MyClass mycls = new MyClass();		
		mycls.func();
		mycls.func();
		
	//	mycls.staticNumber = 12;
		
		MyClass.staticNumber = 14;
		
		
		// 메소드
	//	YouClass yc = new YouClass();
	//	yc.memberMethod();	// 멤버메소드, 인스턴스메소드
		
		YouClass.staticMethod();	// static메소드, class메소드 
		
		YouClass.swap(null, 0, 0);
		
	}
	
	static int func() {		
		return 1;
	}
}


