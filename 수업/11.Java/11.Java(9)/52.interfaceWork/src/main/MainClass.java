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
	protected int x, y; // 현재위치
	
	void move(int x, int y) {
		// 지정된위치로이동 
		System.out.println("move");
	}

	void stop() {
		// 현재위치에정지 
		System.out.println("stop");
	}
}
*/

interface Unit{
	void move(int x, int y);
	void stop();
}

class Marine implements Unit{ // 보병
	int x, y;
	
	void stimPack() {
		/* 스팀팩을사용한다. */
		System.out.println("스팀팩을 사용한다.");
	}

	@Override
	public void move(int x, int y) {			
	}

	@Override
	public void stop() {			
	}
}

class Tank implements Unit{ // 탱크	
	int x, y;
	
	void changeMode() {
		/* 공격모드를변환한다. */
		System.out.println("공격모드를 변환한다.");
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

class Dropship implements Unit{ // 수송선
	int x, y;
		
	void load() {
		/* 선택된대상을태운다. */ 
		System.out.println("선택된 대상을 태운다.");
	}

	void unload() {
		/* 선택된대상을내린다. */ 
		System.out.println("선택된 대상을 내린다.");
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
		System.out.println("춤을춥니다.");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를합니다.");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을그립니다.");
	}
}





