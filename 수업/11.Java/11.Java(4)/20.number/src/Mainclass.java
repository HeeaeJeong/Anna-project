import java.util.Scanner;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("menu >>>");
		System.out.println("1.10���� -> 2������ ����");
		System.out.println("2.10���� -> 8������ ����");
		System.out.println("3.10���� -> 16������ ����");		
		System.out.println("4.2���� -> 10������ ����");
		System.out.println("5.8���� -> 8������ ����");
		System.out.println("6.16���� -> 10������ ����");   //0~9 A~F -> AC 9F
		System.out.println("���Ͻô� ó�� ��ȣ�� �Է����޿� >>");
		int work = sc.nextInt();
		
		System.out.println("�����ϰ� ���� ���ڸ� �Է��� �ֽʽÿ� >>>");
		String numStr = sc.next();
		
		int num10;
		String num2, num8, num16;
		switch(work) {
		   case 1:
			//	num10 = Integer.parseInt(numStr);
			//	num2 = Integer.toBinaryString(num10);
				num2 = decToBin(numStr);
				System.out.println("10���� " + numStr + "�� 2������ " + num2 + "�Դϴ�");
				break;
			case 2:
				num10 = Integer.parseInt(numStr);
				num8 = Integer.toOctalString(num10);
				System.out.println("10���� " + numStr + "�� 8������ 0" + num8 + "�Դϴ�");				
				break;
			case 3:
				num10 = Integer.parseInt(numStr);
				num16 = Integer.toHexString(num10);
				System.out.println("10���� " + numStr + "�� 16������ 0x" + num16 + "�Դϴ�");
				break;
			case 4:
				num10 = Integer.parseInt(numStr, 2); 
				System.out.println("2���� " + numStr + "�� 10������ " + num10 + "�Դϴ�");
				break;
			case 5:
				num10 = Integer.parseInt(numStr, 8); 
				System.out.println("8���� 0" + numStr + "�� 10������ " + num10 + "�Դϴ�");
				break;
			case 6:
				num10 = Integer.parseInt(numStr, 16); 
				System.out.println("16���� 0x" + numStr + "�� 10������ " + num10 + "�Դϴ�");
				break;		
		}		
	}


static String decToBin(String numStr) {
	int num10 = Integer.parseInt(numStr);
	String num2 = Integer.toBinaryString(num10);
	return num2;
}

}

		
		
		
	
	
