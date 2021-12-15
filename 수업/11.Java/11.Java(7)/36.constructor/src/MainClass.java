public class MainClass {

	public static void main(String[] args) {
		/*
			constructor : 	생성자			
							객체 생성시에 호출
							메소드
							클래스명과 같다
							return 값이 없다
							overload가 가능하다
							생략이 가능하다.
							별도의 호출이 불가능하다.
			
			destructor : 	소멸자 <- X   가비지 컬렉터
		*/
		
		int array[] = { 11, 22, 33 };		
	//	MyClass cls = { 11, "홍길동" };
		
	//	MyClass cls = new MyClass();
	//	MyClass cls = new MyClass( 1 );
		MyClass cls = new MyClass(2, "hello");
		System.out.println(cls);		
		MyClass t = cls.getThis();
		System.out.println(t);
		
		MyClass cls1 = new MyClass();
		System.out.println(cls1);
		MyClass t1 = cls1.getThis();
		System.out.println(t1);

	}
}




