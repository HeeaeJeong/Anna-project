
public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		Exception : ���� != ����
		int number <- 'A' == 65
		
		��)
			number -> char
			array -> �����ʰ�		[5] -> 0 ~ 4 :: [5]
			class -> ����
			file -> ����
			
		����:
			try{
			
				���ܰ� �߻��� ���ɼ��� �ִ� �ڵ�
				
			}catch(����Ŭ����1 e){		<- number
				���� Ŭ���� �޽��� ���
			}catch(����Ŭ����2 e){		<- bound
				���� Ŭ���� �޽��� ���
			}
					:
			finally{
				������ ����!
				��ó��
			}	
			
			�Լ��ȿ��� �߻��� ���
			static void method() throws ����Ŭ���� {
				�Լ� �ȿ��� ���ܰ� �߻��� ���
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
	//	System.out.println("�迭�� ���� �ʰ�");
		e.printStackTrace();			
	//	return;
		
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}finally {
			System.out.println("finally �κ�");			
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
