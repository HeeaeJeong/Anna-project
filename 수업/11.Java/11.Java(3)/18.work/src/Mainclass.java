
import java.util.Arrays;
import java.util.Scanner;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 ����ڰ� ���ϴ� �л����� ������ �Է��� �޴´�.
		 ����, ��� �׸��� �ְ������� ���Ѵ�.
		 �Է� ���� ���� �߿��� 90���̻��� �л��� ���� ����ΰ�?
		 �׸��� �� �����鸸�� ���ο� �迭�� �����ϵ��� �Ѵ�.
		
		int count = 0;
		int number[] = null;  //�����Ҵ��� ����� �ϴ� ���.
		// �Է�
		// ���?
		System.out.print("����� ��踦 ���Ͻðڽ��ϱ�? = ");
		count = sc.nextInt();
		
		number = new int[count];
		// �л����� ����.		
		for ( int i = 0; i < number.length; i++) {
			System.out.println((i + 1) + "��° ���� = ");
			number[i] = sc.nextInt();
		}		
		// ����
		int sum = 0;
		for(int i = 0; i < number.length; i++) {
			sum = sum + number[i];
		}
		
		// ���
		double avg = (double)sum / number.length;
		
		// �ְ�����
		int max = number[0];
		for (int i = 1; i < number.length; i++) {
			if(number[i] > max) {
				max = number[i];
			}
		}
		
		// ������ ��
		int high = 0;
		for (int i = 0; i < number.length; i++) {
			if(number[i] >=90) {
				high++;
			}
		}
		
		// ������ ������ �迭�� ����
		int highCount[] = new int[high];
		int n = 0;
		for (int i = 0; i < number.length; i++) {
			if(number[i] >=90) {
				highCount[i] = number[i];
				n++;
			}
		}
		
		// �迭�� ����
		System.out.println(Arrays.toString(number));
		System.out.println("�հ�:" + sum);
		System.out.println("���:" + avg);
		System.out.println("�ְ�����:" + max);
		System.out.println("90���̻� ������ �л���: " + high);
		System.out.println(Arrays.toString(highCount));	
		 */
		
		/*
		 ���� �Է� 5���� ������ �ԷµǸ� �ٽ� �Է��Ѵ�.
		
		
		int inputNum[] = new int[5];
		
		int w = 0;
		
		while(w<5) {
			System.out.print((w+1)+"��° �� = ");
			int num = sc.nextInt();
			if(num > 0 ) {//�����Է�
				inputNum[w] = num;
			}else {
				System.out.println("0�̻��� ���� �Է��� �ֽʽÿ�.");
				continue;
			}
			w++;
		}
		
		System.out.println(Arrays.toString(inputNum));
		 */
	}
}
