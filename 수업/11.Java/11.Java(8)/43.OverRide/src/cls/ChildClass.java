package cls;

public class ChildClass extends ParentClass{

	/*
		Over Ride : �θ� Ŭ�������� ��ӹ��� �޼ҵ带 ���� ����
		
		1. ��ӹ��� �Լ��� ���� �ۼ��Ͽ� ���. 
		2. class ����
	*/
	
	// OverRide
	// @Override	// == namespace -> �ּ�, ǥ��
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
