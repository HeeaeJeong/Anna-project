package cls;

public class MyClass {

	private int number;			// 멤버변수
	public static int staticNumber;	// 정적변수, global variable로도 사용하는 경우가 있다.
	
	public void method(int number) {	// 매개변수
		int localnumber;		// 지역(local)변수
		
		{
			int localnum;			
		}		
	}
	
	public void func() {
		int localnumber = 0;	
		
		localnumber++;
		number++;
		staticNumber++;
				
		System.out.println("local변수:" + localnumber);
		System.out.println("멤버변수:" + number);
		System.out.println("정적변수:" + staticNumber);
				
	}
	

}






