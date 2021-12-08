
public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	/*
	 * 숫자(상수) : 지정한 숫자. 0~10
	 * 2진수 : 0, 1
	 * 8진수 : 0~7 8->10  011->9(10진수)_쓸 일이 많이 없음.
	 * 10진수 : 0~9
	 * 16진수 : 0~9 A B C D E F(15)  15(10진수)
	 * 
	 * 변수(공간) : 그릇(크기는 다양).==variable
	 * 1. 변수를 선언. 변수명을 작명.
	 * 2. 자료형 지정.
	 * 
	 * 문자, 숫자, 문자열, 논리값
	 * 
	 * 기본형태 - 자료형지정 변수명; ->변수의 선언. (그릇을 준비)
	 * 변수명 = 값; -> 변수의 값의 대입. (그릇에 내용물을 넣는 것)
	 * 
	 * */
	
	//정수 == integer
	int number; // number라는 그릇을 준비하는것.
	number = 123;
	
	System.out.println(number);
	
	//변수의 작명 규칙.
	int a;
	int A; //대문자와 소문자를 다른 변수로 취급함.
	
	//예약어는 사용할 수 없다. -> 프로그래밍에 먼저 설정되어 있는 단어.ex)int int;
	//int 2a; -> 이 형태도 사용할 수 없음.
	//int 123;
	int num123;
	//int +number;
	//int -number;
	//int *number;
	//int /number;
	//int =number;
	int _number;//최근에는 잘 사용하지 않는 형태임.
	
	int number_position_char;
	int numberpostionchar;
	int numberpostionChar;
	int numberPosChar;
	int iNumPosChar;
	
	int 숫자1;
	숫자1 = 333;
	System.out.println(숫자1);
	
	//흔한 명칭은 사용을 피하는게 좋다.
	//ex) length, object, size
	
	//변수의 자료형의 종류.
	//1.숫자 자료형.
	//정수
	//byte, short, int, long
	byte by; //크기 : 1byte == 8bit / 0000 0000 -> 1111 1111 -> 256개 / 0 ~ 255
	         //                      맨 앞에 있는 bit는 부호를 나타낸다. (0->+ 1->-)
	         //                      -128 ~ 127
	by = -128;
	
	short sh; //2 byte == 16bit
	sh=12345;//영역이 넘어가면 에러를 발생함.
	
	int i; //4 byte == 32bit
	i=23232323;//범위를 넘어가면 왜 넘어가는지를 알아야 함.
	
	long l; //8 byte == 64bit
	l=423432423424L;//long은 마지막에 L이라는 부호를 붙어야 함.
	
	
	//실수
	//float, double, 
	float f; //4byte
	f = 123.45678F;//float도 long과 동일하게 뒷부분에 F라고 부호를 붙어야 함.
	
	double d; //8byte
	d = 12.3456789;
	
	//2.문자(열) 자료형.
	//문자.
	char c; //2byte character  ASCII(아스키코드) < UNIcode < MULTIbyte
	c = 'A';
	c = 'b';//javaScript var c = "hello";
	c = '+';
	c = '한';
	c = ' ';//null문자.
//	c = '하나';
	
	//문자열. hello nice to meet you
	String str; //string 자료형이 아니라, wrapper class.
	str = "hello";
	str = "hi my name is Anna";
	
	System.out.println(str);
	
	
	//3.논리형 자료형.(true/false)
	boolean b; //true(1)/false(0)
	b=true;

	

}}
