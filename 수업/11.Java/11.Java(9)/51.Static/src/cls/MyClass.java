package cls;

public class MyClass {

	private int number;			// �������
	public static int staticNumber;	// ��������, global variable�ε� ����ϴ� ��찡 �ִ�.
	
	public void method(int number) {	// �Ű�����
		int localnumber;		// ����(local)����
		
		{
			int localnum;			
		}		
	}
	
	public void func() {
		int localnumber = 0;	
		
		localnumber++;
		number++;
		staticNumber++;
				
		System.out.println("local����:" + localnumber);
		System.out.println("�������:" + number);
		System.out.println("��������:" + staticNumber);
				
	}
	

}






