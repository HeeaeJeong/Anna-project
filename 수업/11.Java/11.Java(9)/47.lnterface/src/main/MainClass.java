package main;

import cls.HeClass;
import cls.MyClass;
import cls.YouClass;
import inter.MyInterface;

public class MainClass {
	public static void main(String[] args) {
		
	//	MyInterface myi = new MyInterface();
		
		MyClass mycls = new MyClass();
		mycls.method();
		
		MyInterface myi = new MyClass();
		myi.method();
		
		MyInterface myinter = new MyInterface() {			
			@Override
			public void method() {				
			}
		};
		
		YouClass ycls = new YouClass();
		ycls.func();
		ycls.method();
		
	//	MyInterface myinterface = new MyClass();
		MyInterface myinterface = new YouClass();
		
		
		
		
		
		Object myobj = new MyClass();
		Object youobj = new YouClass();
		Object heobj = new HeClass();
		
		Object array[] = new Object[3];
		
		array[0] = new YouClass();
		
	}
}

//
//class ParentOne{	
//}
//class ParentTwo{	
//}
//
//class Child extends ParentOne, ParentTwo{
//}