
public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 Wrapper Class
		 �Ϲ� �ڷ���(Char, in, double)�� ����ϱ� ���ϵ��� ���� �س��� ��.
		 "���ڿ�" "��" "��" "��" "h" "e" "l"
		 String ->Wrapper Class
		 /�������� ����� ���� Ŭ����.(��������)
		 Char chArr[] = {} 
		 
		 �Ϲ� �ڷ���                  Wrapper Class(object)
		 boolean                   Boolean
		 byte                      Byte
		 short                     Short
		 int                       Integer  ---------
		 long                      Long
		 
		 float                     Float
		 double                    Double ----------
		 
		 char                      Chracter
		 char[]                    String ---------
		 
		 //ǥ���� �������� ����ϸ� ��.
		  Integer, Double, String
		*/  
		  //Integer == int
		    int i = 123;
		  //Integer iobj = 123;
		    Integer iobj = new Integer(123);
		    
		    System.out.println("i = " + i);
		    System.out.println("iobj = " + iobj);
		    
		    // class == ����, ���� + ���� + �Լ�(�޼ҵ�) - ���.
		    // MyClass cls = new MyClass();
		    // var cls = MyClass()
		    
		    //String str = "hello";
		    //String strOj = new String("hello");
		    
		    //wrapper Ȱ�� ����.
		    //1.����->���ڿ��� �����ϴ� ���.
		    
		    Integer objNumber = 123;
		    String str = objNumber.toString() + 1; //.toString���� �ϴ��� ������ �� ���� �����.
		    System.out.println(str);
		    
		    int num = 123;
		    String str1 = num + "";
		    System.out.println(num);
		    
		    double dnum = 123.456;
		    String str2 = dnum + "";
		    System.out.println(dnum);
		    
		    //2.���ڿ�->���ڷ� �����ϴ� ���. 
		    
		    String str3 = "12345";
		    int n = Integer.parseInt(str3); //���� ���� ����� ��.
		    System.out.println(n + 2); 
		    
		    String str4 = "123.456";
		    double d = Double.parseDouble(str4);
		    System.out.println(d);
		    
		    //2����, 8����, 10����, 16���� ����.
		    //10���� -> 2����
		    int num10 = 16;
		    String num2 = Integer.toBinaryString(num10);
		                //Integer.toOctalString(i) - 8����
		                //Integer.toHexString(i)  -16����
		    System.out.println(num2);		    
		    
		    //2���� -> 10����
		   /*
		      1010 1100
		      8421 8421 ->�� 15
		      (16 * 10) +  (1 * 12)
		       160+ 12 -> 172    
		           
		       
		    */
		    String number2 = "10101100";
		    int number10 = Integer.parseInt(number2,2);
		    System.out.println(number10);
		    
		    //10���� -> 8����
		    int num5 = 80;
		    String change = Integer.toOctalString(num5);
		    System.out.println(change);
		    
		 
		 
		
	}

}
