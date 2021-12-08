
public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
ÀÚ·áÇü     byte   ¿ì¼±¼øÀ§   ex)±×¸©
boolean  1byte    ³·À½      ÀÛ´Ù
byte     1byte
short    2byte
int      4byte
long     8byte
float    4byte
double   8byte    ³ôÀ½      Å©´Ù

char     2byte
String   "ABC" //6byte//¹®ÀÚÀÇ °¹¼ö·Î µûÁü./ºó¹®ÀÚµµ Æ÷ÇÔµÊ.

(ÀÚ·á)Çü º¯È¯
ÀÛÀº ±×¸©->Å« ±×¸©/ ÀÚµ¿(ÀÚ·á)Çü º¯È¯-> 
Å« ±×¸©->ÀÛÀº ±×¸©/ °­Á¦(ÀÚ·á)Çü º¯È¯-> Cast

*/
		
		short sh = 12345;	//2
		int num;			//4
		
		num = sh;				//ÀÚµ¿Çü º¯È¯.
		System.out.println(num);
		
		num = 23456; 		//¹üÀ§°¡ ³Ñ¾î°¡¸é ¾û¶×ÇÑ ¼ıÀÚ°¡ Ãâ·ÂµÊ.
		sh = (short)num; //°­Á¦·Î ¹Ù²ãÁà!!
		System.out.println(sh);
		
		long l = 1234567L;
		float f;
		
		f = 1;
		System.out.println(f);
		
		double d = 1.23e3; 
		
		/*
		 1.23e3   e3 == 10ÀÇ 3½Â == 1000 -> 1.23 * 1000 = 1230
		 */
		
		System.out.println(d);
		
		d = 2.34e-2;
		/* 
		 2.34e-2;   e-2 == 1/10ÀÇ 2½Â == 0.01 -> 2.34 * 0.01 = 0.0234
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
