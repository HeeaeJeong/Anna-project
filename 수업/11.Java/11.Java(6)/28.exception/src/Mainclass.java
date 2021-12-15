
public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		Exception : 예외 != 에러
		int number <- 'A' == 65
		
		예)
			number -> char
			array -> 범위초과		[5] -> 0 ~ 4 :: [5]
			class -> 없음
			file -> 없음
			
		형식:
			try{
			
				예외가 발생될 가능성이 있는 코드
				
			}catch(예외클래스1 e){		<- number
				예외 클래스 메시지 출력
			}catch(예외클래스2 e){		<- bound
				예외 클래스 메시지 출력
			}
					:
			finally{
				무조건 실행!
				뒤처리
			}	
			
			함수안에서 발생할 경우
			static void method() throws 예외클래스 {
				함수 안에서 예외가 발생될 경우
			}				
	*/
	
		int array[] = { 1, 2, 3 };
	
			System.out.println("start");
	
		try {
	
		for (int i = 0; i < 4; i++) {
			System.out.println(array[i]);
		}
		
			System.out.println("process");
	
		}catch (ArrayIndexOutOfBoundsException e) {
	//	System.out.println("배열의 범위 초과");
		e.printStackTrace();			
	//	return;
		
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}finally {
			System.out.println("finally 부분");			
		}
		
			System.out.println("end");
	
	
		method();
		
		try {
			objectCall();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e) {
		// TODO: handle exception
	}
}

	static void method()throws IndexOutOfBoundsException {
		int num[] = { 1, 2, 3 };
		for (int i = 0; i < 4; i++) {
			System.out.println(num[i]);
	}
}

	static void objectCall()throws Exception {
		Class.forName("MyClass");		
	
	
}

}
