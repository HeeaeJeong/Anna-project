
public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 Wrapper Class
		 일반 자료형(Char, in, double)을 사용하기 편리하도록 구현 해놓은 것.
		 "문자열" "가" "나" "다" "h" "e" "l"
		 String ->Wrapper Class
		 /누군가가 만들어 놓은 클래스.(도구상자)
		 Char chArr[] = {} 
		 
		 일반 자료형                  Wrapper Class(object)
		 boolean                   Boolean
		 byte                      Byte
		 short                     Short
		 int                       Integer  ---------
		 long                      Long
		 
		 float                     Float
		 double                    Double ----------
		 
		 char                      Chracter
		 char[]                    String ---------
		 
		 //표시한 세가지만 기억하면 됨.
		  Integer, Double, String
		*/  
		  //Integer == int
		    int i = 123;
		  //Integer iobj = 123;
		    Integer iobj = new Integer(123);
		    
		    System.out.println("i = " + i);
		    System.out.println("iobj = " + iobj);
		    
		    // class == 설계, 구성 + 변수 + 함수(메소드) - 기능.
		    // MyClass cls = new MyClass();
		    // var cls = MyClass()
		    
		    //String str = "hello";
		    //String strOj = new String("hello");
		    
		    //wrapper 활용 예시.
		    //1.숫자->문자열로 변경하는 경우.
		    
		    Integer objNumber = 123;
		    String str = objNumber.toString() + 1; //.toString보다 하단의 내용을 더 많이 사용함.
		    System.out.println(str);
		    
		    int num = 123;
		    String str1 = num + "";
		    System.out.println(num);
		    
		    double dnum = 123.456;
		    String str2 = dnum + "";
		    System.out.println(dnum);
		    
		    //2.문자열->숫자로 변경하는 경우. 
		    
		    String str3 = "12345";
		    int n = Integer.parseInt(str3); //자주 쓰니 기억할 것.
		    System.out.println(n + 2); 
		    
		    String str4 = "123.456";
		    double d = Double.parseDouble(str4);
		    System.out.println(d);
		    
		    //2진수, 8진수, 10진수, 16진수 변경.
		    //10진수 -> 2진수
		    int num10 = 16;
		    String num2 = Integer.toBinaryString(num10);
		                //Integer.toOctalString(i) - 8진수
		                //Integer.toHexString(i)  -16진수
		    System.out.println(num2);		    
		    
		    //2진수 -> 10진수
		   /*
		      1010 1100
		      8421 8421 ->합 15
		      (16 * 10) +  (1 * 12)
		       160+ 12 -> 172    
		           
		       
		    */
		    String number2 = "10101100";
		    int number10 = Integer.parseInt(number2,2);
		    System.out.println(number10);
		    
		    //10진수 -> 8진수
		    int num5 = 80;
		    String change = Integer.toOctalString(num5);
		    System.out.println(change);
		    
		 
		 
		
	}

}
