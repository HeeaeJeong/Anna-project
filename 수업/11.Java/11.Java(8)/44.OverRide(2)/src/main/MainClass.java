package main;

import cls.ChildOneClass;
import cls.ParentClass;

public class MainClass {
	public static void main(String[] args) {
		
	//	ChildOneClass child = new ChildOneClass();
	//	child.Method();
		
		ParentClass pc = new ChildOneClass();
		pc.Method();
		pc.func();
		
	//	pc.function();
		
		ChildOneClass coc = (ChildOneClass)pc;	// 강제 변환 Parent -> Child
		
	}
}














