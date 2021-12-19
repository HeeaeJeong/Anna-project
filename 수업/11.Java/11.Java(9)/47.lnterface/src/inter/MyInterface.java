package inter;

/*
	추상메소드만을 포함하는 형태(template)
	멤버변수를 포함할 수 없다
	일반 메소드도 포함할 수 없다.
	
	상속받은 후에 메소드를 정의한 후에 사용할 수 있다.
	class의 사양을 파악할 수 있는 용도
	확장성에서 사용
	다중 상속이 가능하다
*/
public interface MyInterface {

//	private int number;	
//	public void method() {	}
	
	public void method();
	
}



