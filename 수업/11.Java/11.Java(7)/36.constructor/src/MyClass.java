public class MyClass {
	// 멤버변수
	int number;
	String name;	
	
	MyClass(){
		System.out.println("MyClass 기본생성자");
		
		this.number = 12;
		this.name = "홍길동";
	}
	
	MyClass(int num){
		System.out.println("MyClass(int num) 생성자");
	}
	
	MyClass(int number, String name){		
		this.number = number;
		this.name = name;
		System.out.println("MyClass(int num, String na) 생성자");
		
		// this : 자기참조 -> 현재 객체의 주소
	}
	
	MyClass getThis() {
		return this;
	}
	
	
}
