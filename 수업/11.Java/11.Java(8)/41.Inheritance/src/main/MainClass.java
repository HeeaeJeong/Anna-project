package main;

import ccls.ChildClass;
import cls.ParentClass;

public class MainClass {

	public static void main(String[] args) {		

		ChildClass cc = new ChildClass();
		
		cc.parentMethod();
		cc.chileMethod();
		
	//	cc.setNumber(2);
		
	//	cc.name = "������";
		
		ParentClass pc = new ParentClass();
		pc.parentMethod();
	//	pc.chileMethod();
		
	}

}

