package main;

public class MyClass {

	private int number;
	private String name;
	
	public MyClass() {	// �⺻ ������
		this(0, "��ĭ");
				
		System.out.println("MyClass MyClass()");		
	}

	public MyClass(int number, String name) {
	//	this();		// �⺻ ������
		
		this.number = number;
		this.name = name;
		System.out.println("MyClass MyClass(int number, String name)");
	}
	
	
	
}
