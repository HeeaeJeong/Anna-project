import java.util.Arrays;
import java.util.Scanner;

public class Mainclass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		// ���� ���α׷�
		//int count;	// ��� ���������� ����
		int number[] = null;
		int updown;
		
		// �Է�
		// user ��� ���ڸ� ����?
		// ������ ����
		System.out.print("��� ���ڸ� ���� = ");
		int count = sc.nextInt();
		
		number = new int[count];
		// ���ڵ��� �Է�
		for (int i = 0; i < number.length; i++) {
			System.out.print((i + 1) + "��° �� = ");
			number[i] = sc.nextInt();
		}
		
		// ����/����
		System.out.print("����(1)/����(2) = ");
		updown = sc.nextInt();
		
		
		// ����ó��
		int temp;		
		for (int i = 0; i < number.length - 1; i++) {	// [0][1][2][3][4]
			for (int j = i + 1; j < number.length; j++) {				
				if(updown == 1) {					
					if(number[i] > number[j]) {
						temp = number[i];
						number[i] = number[j];
						number[j] = temp;								
					}
				}
				else {
					
					if(number[i] < number[j]) {
						temp = number[i];
						number[i] = number[j];
						number[j] = temp;								
					}
				}
			}
		}
		
		System.out.println(Arrays.toString(number));
		
		
		
		// ������
		/*
		int number[] = { 3, 5, 1, 4, 2 };
					//	 1 ->					Debug : 
					//		2 ->
					//		   3 ->
					//			  4 ->		
		int temp;
		for(int i = 0;i < number.length - 1; i++) {			
			for(int j = i + 1; j < number.length; j++ ) {				
				if(number[i] < number[j]) {		// ��ȯó��
					temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}			
		}		
*/
		//����� �۾�: run - Debug (ctrl+f11 ->f6) //breakpoint ������ ����.
		//variable�� ������ �� ����.
		//�츮�� ���� ���� ������ ������ ���-Expressions
	}
	

	}
