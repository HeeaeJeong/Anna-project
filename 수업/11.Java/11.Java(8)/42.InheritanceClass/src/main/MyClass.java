package main;

public class MyClass {

	private int number;
	private String name;
	
	public MyClass() {	// 기본 생성자
		this(0, "빈칸");
				
		System.out.println("MyClass MyClass()");		
	}

	public MyClass(int number, String name) {
	//	this();		// 기본 생성자
		
		this.number = number;
		this.name = name;
		System.out.println("MyClass MyClass(int number, String name)");
	}
	
	
	
}
