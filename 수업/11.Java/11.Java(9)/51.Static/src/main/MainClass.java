package main;

import cls.MyClass;
import cls.YouClass;

public class MainClass {
	
	static int number = 1;
	
	public static void main(String[] args) {
		
		
		/*
			static : ���� <=> ����(dynamic)
			
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
		
		
		// �޼ҵ�
	//	YouClass yc = new YouClass();
	//	yc.memberMethod();	// ����޼ҵ�, �ν��Ͻ��޼ҵ�
		
		YouClass.staticMethod();	// static�޼ҵ�, class�޼ҵ� 
		
		YouClass.swap(null, 0, 0);
		
	}
	
	static int func() {		
		return 1;
	}
}


