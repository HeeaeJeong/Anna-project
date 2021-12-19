package cls;

public class ChildClass extends ParentClass{

	/*
		Over Ride : 부모 클래스에서 상속받은 메소드를 고쳐 기입
		
		1. 상속받은 함수를 고쳐 작성하여 사용. 
		2. class 관리
	*/
	
	// OverRide
	// @Override	// == namespace -> 주석, 표시
	public void pMethod() {
	//	super.pMethod();
		
		System.out.println("ChildClass pMethod()");		
	}
		
	public void func() {
	//	pMethod();		
		super.pMethod();	
		
		method(); 
	}
	
	
	
}
