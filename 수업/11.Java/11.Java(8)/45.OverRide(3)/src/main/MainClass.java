package main;

import cls.ChildOne;
import cls.ChildTwo;
import cls.ParentClass;

public class MainClass {
	public static void main(String[] args) {
		
		// �ڽ� Ŭ������ ��ü�� �� 10���� ��ü�� ����
		ChildOne arrOne[] = new ChildOne[10];
		ChildTwo arrTwo[] = new ChildTwo[10];
		
		/*
		String name = "";
		if(name.equals("one")) {
			
		}else {				
		arrOne[0] = new ChildOne();
		arrTwo[0] = new ChildTwo();
		arrTwo[1] = new ChildTwo();
		arrOne[1] = new ChildOne();
		arrOne[2] = new ChildOne();
		arrOne[3] = new ChildOne();
		arrTwo[2] = new ChildTwo();
		arrOne[4] = new ChildOne();
		*/
		
		
		// �ڽ� Ŭ������ ��ü�� �� 10���� ��ü�� ����
//		ParentClass pc1 = new ChildOne();
//		ParentClass pc2 = new ChildTwo();
		
		ParentClass arrParent[] = new ParentClass[10];
		
		arrParent[0] = new ChildOne();
		arrParent[1] = new ChildTwo();
		arrParent[2] = new ChildTwo();
		arrParent[3] = new ChildOne();
		arrParent[4] = new ChildOne();
		arrParent[5] = new ChildOne();
		arrParent[6] = new ChildTwo();
		arrParent[7] = new ChildOne();
		arrParent[8] = new ChildOne();
		arrParent[9] = new ChildTwo();
		
		for (int i = 0; i < arrParent.length; i++) {
			arrParent[i].Method();
			
			if(arrParent[i] instanceof ChildOne) {
				ChildOne one = (ChildOne)arrParent[i];
				one.func();
			}
			else if(arrParent[i] instanceof ChildTwo) {
				ChildTwo two = (ChildTwo)arrParent[i];
				two.proc();
			}
		}
		
		
		
		/*
		ChildOne o = (ChildOne)arrParent[0];
		o.func();
		
		// instanceof	: ������ class�� ã���ش�.
		
		if(arrParent[0] instanceof ChildOne) {
			ChildOne one = (ChildOne)arrParent[0];
			one.func();
		}
		*/
		
	}
}






