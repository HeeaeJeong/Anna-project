import java.util.Scanner;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//������ ���ڰ� ���ڷθ� �Ǿ� �ִ��� �ƴϸ� �ٸ� ���������� �Ǻ��ϴ� �ڵ带 �ۼ����ּ���.
		/*
		 * char c = 'A';
		
		boolean d = true;
		
		Scanner in = new Scanner(System.in);
		System.out.print("�Է����ּ���");
		String str=in.next();
		
		for(int i=0; i<str.length();i++) {
			if(c < '0' || c>'9') {
				d = false;
				break;
			}
		}
		if(d == true) {
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("�����Դϴ�.");
		}
		 */
		
		//�����Դϴ�.
		//���ڰ� �ƴմϴ�.
		//(�ƽ�Ű �ڵ�)
		
		//������ �ڵ�.
		char c = 'A';
		boolean numberOK = true;
		System.out.println((int)c);
		
		int asccode = (int)c;
		if(asccode < 48 || asccode > 57) {
			numberOK = false;
		}
		if(numberOK) {
			System.out.println("�����Դϴ�");
		}else {
			
		}System.out.println("���ڰ� �ƴմϴ�");
		
		
		//�Էµ� ���ڿ��� ��� ���ڷ� �Ǿ� �ִ��� �ƴϸ� ��� ���ڷ� �Ǿ� ���� �ʴ��� ����
		//(�ƽ�Ű�ڵ�)
		//123 123a 1s23
		Scanner sc = new Scanner(System.in);
		
		System.out.println("number");
		String strNum = sc.next();    //"12345" -> char[]
		
		numberOK = true;
		for (int i = 0; i < strNum.length(); i++) {
			char ch = strNum.charAt(i);
			int n = (int)ch;
			if(n < 48 || n > 57) {
				
			}
		}
		if(numberOK) {
			System.out.println("��� �����Դϴ�");
			
			int Number = Integer.parseInt(strNum);
		}else {
			
		}System.out.println("���ڰ� �ƴ� ���ڰ� ���ԵǾ� �ֽ��ϴ�");
		
		//���ܾ�� �Է� -> toUpperCase�� toLowerCase�� ������� �ʰ� ��� �빮�ڷ� ��µǵ��� �϶�.	
		
		String word = "Hello";
		String result = "";
		
		for(int i = 0; i < word.length(); i++ ) {
			char c1 = word.charAt(i);
			int n = (int)c1;
			
			if(n >= 97 ) { //97(a) 65(A) = 32
				n = n -32;
				
			}
			
			result = result + (char)n;
			
		}
		System.out.println(result);
		
		
		

	}
}
