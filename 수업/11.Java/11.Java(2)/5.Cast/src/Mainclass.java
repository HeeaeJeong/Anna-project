
public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
�ڷ���     byte   �켱����   ex)�׸�
boolean  1byte    ����      �۴�
byte     1byte
short    2byte
int      4byte
long     8byte
float    4byte
double   8byte    ����      ũ��

char     2byte
String   "ABC" //6byte//������ ������ ����./���ڵ� ���Ե�.

(�ڷ�)�� ��ȯ
���� �׸�->ū �׸�/ �ڵ�(�ڷ�)�� ��ȯ-> 
ū �׸�->���� �׸�/ ����(�ڷ�)�� ��ȯ-> Cast

*/
		
		short sh = 12345;	//2
		int num;			//4
		
		num = sh;				//�ڵ��� ��ȯ.
		System.out.println(num);
		
		num = 23456; 		//������ �Ѿ�� ������ ���ڰ� ��µ�.
		sh = (short)num; //������ �ٲ���!!
		System.out.println(sh);
		
		long l = 1234567L;
		float f;
		
		f = 1;
		System.out.println(f);
		
		double d = 1.23e3; 
		
		/*
		 1.23e3   e3 == 10�� 3�� == 1000 -> 1.23 * 1000 = 1230
		 */
		
		System.out.println(d);
		
		d = 2.34e-2;
		/* 
		 2.34e-2;   e-2 == 1/10�� 2�� == 0.01 -> 2.34 * 0.01 = 0.0234
		 */
		
		System.out.println(d);
		
		int number1, number2;
		float fnum;
		
		number1 = 3;
		number2 = 2;
		
		fnum = (float)number1 / number2;
		System.out.println(fnum);
		
		//increment == ++ == +1
		//decrement == -- == -1
		
		number1++;
		System.out.println(number1);
		number1--;
		System.out.println(number1);
		++number1;
		System.out.println(number1);
		--number1;
		System.out.println(number1);
		
		int num1, num2;
		
		num1 = 0;
		num2 = 0;
		
		num2 = num1++;
		//num2 = ++num1;
		
		System.out.println("num1=" + num1);
		System.out.println("num2=" + num2);
				
	
		
		
		
		
	}

}
