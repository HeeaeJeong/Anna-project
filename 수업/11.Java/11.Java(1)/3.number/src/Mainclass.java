
public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	/*
	 * ����(���) : ������ ����. 0~10
	 * 2���� : 0, 1
	 * 8���� : 0~7 8->10  011->9(10����)_�� ���� ���� ����.
	 * 10���� : 0~9
	 * 16���� : 0~9 A B C D E F(15)  15(10����)
	 * 
	 * ����(����) : �׸�(ũ��� �پ�).==variable
	 * 1. ������ ����. �������� �۸�.
	 * 2. �ڷ��� ����.
	 * 
	 * ����, ����, ���ڿ�, ����
	 * 
	 * �⺻���� - �ڷ������� ������; ->������ ����. (�׸��� �غ�)
	 * ������ = ��; -> ������ ���� ����. (�׸��� ���빰�� �ִ� ��)
	 * 
	 * */
	
	//���� == integer
	int number; // number��� �׸��� �غ��ϴ°�.
	number = 123;
	
	System.out.println(number);
	
	//������ �۸� ��Ģ.
	int a;
	int A; //�빮�ڿ� �ҹ��ڸ� �ٸ� ������ �����.
	
	//������ ����� �� ����. -> ���α׷��ֿ� ���� �����Ǿ� �ִ� �ܾ�.ex)int int;
	//int 2a; -> �� ���µ� ����� �� ����.
	//int 123;
	int num123;
	//int +number;
	//int -number;
	//int *number;
	//int /number;
	//int =number;
	int _number;//�ֱٿ��� �� ������� �ʴ� ������.
	
	int number_position_char;
	int numberpostionchar;
	int numberpostionChar;
	int numberPosChar;
	int iNumPosChar;
	
	int ����1;
	����1 = 333;
	System.out.println(����1);
	
	//���� ��Ī�� ����� ���ϴ°� ����.
	//ex) length, object, size
	
	//������ �ڷ����� ����.
	//1.���� �ڷ���.
	//����
	//byte, short, int, long
	byte by; //ũ�� : 1byte == 8bit / 0000 0000 -> 1111 1111 -> 256�� / 0 ~ 255
	         //                      �� �տ� �ִ� bit�� ��ȣ�� ��Ÿ����. (0->+ 1->-)
	         //                      -128 ~ 127
	by = -128;
	
	short sh; //2 byte == 16bit
	sh=12345;//������ �Ѿ�� ������ �߻���.
	
	int i; //4 byte == 32bit
	i=23232323;//������ �Ѿ�� �� �Ѿ������ �˾ƾ� ��.
	
	long l; //8 byte == 64bit
	l=423432423424L;//long�� �������� L�̶�� ��ȣ�� �پ�� ��.
	
	
	//�Ǽ�
	//float, double, 
	float f; //4byte
	f = 123.45678F;//float�� long�� �����ϰ� �޺κп� F��� ��ȣ�� �پ�� ��.
	
	double d; //8byte
	d = 12.3456789;
	
	//2.����(��) �ڷ���.
	//����.
	char c; //2byte character  ASCII(�ƽ�Ű�ڵ�) < UNIcode < MULTIbyte
	c = 'A';
	c = 'b';//javaScript var c = "hello";
	c = '+';
	c = '��';
	c = ' ';//null����.
//	c = '�ϳ�';
	
	//���ڿ�. hello nice to meet you
	String str; //string �ڷ����� �ƴ϶�, wrapper class.
	str = "hello";
	str = "hi my name is Anna";
	
	System.out.println(str);
	
	
	//3.���� �ڷ���.(true/false)
	boolean b; //true(1)/false(0)
	b=true;

	

}}
