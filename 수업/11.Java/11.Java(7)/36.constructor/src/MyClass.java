public class MyClass {
	// �������
	int number;
	String name;	
	
	MyClass(){
		System.out.println("MyClass �⺻������");
		
		this.number = 12;
		this.name = "ȫ�浿";
	}
	
	MyClass(int num){
		System.out.println("MyClass(int num) ������");
	}
	
	MyClass(int number, String name){		
		this.number = number;
		this.name = name;
		System.out.println("MyClass(int num, String na) ������");
		
		// this : �ڱ����� -> ���� ��ü�� �ּ�
	}
	
	MyClass getThis() {
		return this;
	}
	
	
}
