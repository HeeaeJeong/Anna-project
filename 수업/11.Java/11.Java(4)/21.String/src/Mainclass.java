
public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
  String : Wrapper class
           char[]
           ���ڿ��� ����, ������ �����.
           
*/
		
		String str;
	  //String : class ��Ī.
	  //str    : Class ���� == object(��ü)
		
		str = "�ȳ��ϼ���";
		System.out.println(str);
		
		String str1 = new String("�ȳ��ϼ���");//����
		String str2 = "�ݰ����ϴ�";//�̷��Ե� ��� ����.
		
		//���ڿ� ����.
		String str3 = str1 + str2;
		System.out.println(str3);
		
		str = str3 + "�ǰ��ϼ���";
		System.out.println(str);
		
		//equals: ���ڿ��� ��.
		String str4 = "world";
		String str5 = "world";
		str5 = str5 + "d";
		
		if(str4 == str5) {
			System.out.println("���� ���ڿ��Դϴ�.");
		}
		
	    boolean b = str4.equals(str5);
	    if(b == true) {
	    	System.out.println("���� ���ڿ��Դϴ�.");
	    }else {
	    	System.out.println("�ٸ� ���ڿ��Դϴ�.");
	    }
	    
	    //indexOf : ������ ��ġ�� ���� �ش�. hello world
	    //lastIndexOf
	    String str6 = "hello world";
	    int index = str6.indexOf("l");
	    System.out.println(index);
	    
	    
	    int lastIndex = str6.lastIndexOf("l");
	    System.out.println(lastIndex);
	    
	    //length : ���ڿ��� ����
	    int len = str6.length();
	    System.out.println(len);
	    
	    //replace : ����
	    String str7 = "A*B*C*D";
	    String repStr = str7.replace("*", "-");
	    System.out.println(repStr);
	    
	    //split : ���ڿ��� �ڸ���   ȫ�浿-24-2001/05/14-�����
	    String str8 = "ȫ�浿-24-2001/05/14-�����";
	    String spStr[] = str8.split("-");
	    System.out.println(spStr[0]);
	    System.out.println(spStr[1]);
	    System.out.println(spStr[2].replace("/", "-"));
	    System.out.println(spStr[3]);
	    /*
	    for (int =0; i<spStr.length; i++) {
	    	System.out.println(spStr[i]);//�̹������ ����� �� ����.
	    }
	    */
	    
	    //substring : ���ڿ��� ������ �ڸ���.
	    String str9 = "�ȳ� �ݰ����� �ǰ��ؿ�";
	    String substr = str9.substring(3, 7); //������ġ, �� ��ġ ������.
	    System.out.println(substr);
	    
	    
	    
	    
	    
	    /**/
	    //toUpperCase : ��� �빮�� //���󵵼� ����.
	    String str10 = "abcDEF";
	    String upStr = str10.toUpperCase();
	    System.out.println(upStr);
	    
	    //toLowerCase : ��� �ҹ��� //���󵵼� ����.
	    String lowStr = str10.toLowerCase();
	    System.out.println(lowStr);
	    
	    //trim : ���ڿ��� �յڿ� ������ ����.//���� ����.
	    String str11 = "           java java java       ";
	    String trimStr = str11.trim();
	    System.out.println(trimStr);
	    
	    //charAt hello world
	    String str12 = "�����ٶ�";
	    char c = str12.charAt(2);
	    System.out.println(c);
	    
	    //contains _ �����̳� ���ڿ��� �����ϸ� ��.
	    String str13 = "����� ������ ������";
	    boolean b1 = str13.contains("����");
	    System.out.println(b1);
	    
	    

		

	}

}
