
public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Over Load : �Լ� ���� ����, �Ű�����(prameter)�� �ڷ����̳� ������ �ٸ� ���� �ǹ�.
		 * 
		 * paint() : image drawing
		 * paint(int x, int y)
		 * print(int z)
		 * paint(char c)
		 * paint(char c,int i)
		 * paint(int i, char c)
		 * 
		 * void paint(int n, char ch) X
		 * int paint(int i, char c) X
		 */
		
		method();
		
		method('A');
		
		method(10);
		
		method('B',12);
		
		method(14,'C');
		
		int sum = sumProc(90, 95, 100, 75, 80);
		System.out.println(sum);
		
		sum = sumProc(10, 20, 30);
		System.out.println(sum);
		
		sumProc("������", 100, 90, 85); //�̸�/�����μ�

	}
	
	static void method() {
		System.out.println("method()");
	}
	
	static void method(char c) {
		System.out.println("method(char c)");
	}
	
	static void method(int i) {
		System.out.println("method(int i)");
	}
	
	static void method(char c, int i) {
		System.out.println("method(char c, int i)");
	}
	
	static void method(int i, char c) {
		System.out.println("method(int i,char c)");		
	}
	
	// �����μ�
	static int sumProc(int...num) {
		int sum = 0;
		
		for( int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		return sum;
				
	}
	
	static void sumProc(String name,int...num) {
		int sum = 0;
		for (int i =0; i < num.length; i++) {
			sum = sum + num[i];
		}
		System.out.println(name + "���� �հ�� " + sum + "�Դϴ�");
	}
	

}
