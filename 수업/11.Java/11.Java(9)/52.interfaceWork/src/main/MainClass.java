package main;

import cls.Circle;
import cls.Point3D;
import cls.Rectangle;

public class MainClass {
	public static void main(String[] args) {
		
		Circle c = new Circle(3.0);
		System.out.println( c.calcArea() );
		
		Rectangle rect = new Rectangle(3, 6);
		System.out.println( rect.calcArea() );
		
		
		Point3D p1 = new Point3D(1,2,3);
		Point3D p2 = new Point3D(1,2,3);		
		
		System.out.println(p1);		// toString()
		System.out.println(p2);
		
		System.out.println("p1==p2?"+(p1==p2));
		System.out.println("p1.equals(p2)?"+(p1.equals(p2)));
	
		Object obj = new Point3D();		
		Point3D p3d = (Point3D)obj;
		
		// (3)		
		Unit unitArr[] = new Unit[10];
		
		unitArr[0] = new Marine();
		unitArr[1] = new Tank();
		unitArr[2] = new Dropship();
		
		// (4)
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
		
		for (int i = 0; i < arr.length; i++) {
			action(arr[i]);
		}		
	}

	public static void action(Robot robot) {
		if(robot instanceof DanceRobot) {
			DanceRobot dr = (DanceRobot)robot;
			dr.dance();
		}
		else if(robot instanceof SingRobot) {
			((SingRobot)robot).sing();
		}
		else if(robot instanceof DrawRobot) {
			((DrawRobot)robot).draw();
		}
	}
}
/*
class Unit{
	protected int x, y; // ������ġ
	
	void move(int x, int y) {
		// ��������ġ���̵� 
		System.out.println("move");
	}

	void stop() {
		// ������ġ������ 
		System.out.println("stop");
	}
}
*/

interface Unit{
	void move(int x, int y);
	void stop();
}

class Marine implements Unit{ // ����
	int x, y;
	
	void stimPack() {
		/* ������������Ѵ�. */
		System.out.println("�������� ����Ѵ�.");
	}

	@Override
	public void move(int x, int y) {			
	}

	@Override
	public void stop() {			
	}
}

class Tank implements Unit{ // ��ũ	
	int x, y;
	
	void changeMode() {
		/* ���ݸ�带��ȯ�Ѵ�. */
		System.out.println("���ݸ�带 ��ȯ�Ѵ�.");
	}
	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub		
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub		
	}
	
}

class Dropship implements Unit{ // ���ۼ�
	int x, y;
		
	void load() {
		/* ���õȴ�����¿��. */ 
		System.out.println("���õ� ����� �¿��.");
	}

	void unload() {
		/* ���õȴ����������. */ 
		System.out.println("���õ� ����� ������.");
	}

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub		
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub		
	}	
}





class Robot {
}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("������ϴ�.");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("�뷡���մϴ�.");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("�׸����׸��ϴ�.");
	}
}





