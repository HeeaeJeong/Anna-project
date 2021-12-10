
public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
  String : Wrapper class
           char[]
           문자열을 편집, 정보를 취득등등.
           
*/
		
		String str;
	  //String : class 명칭.
	  //str    : Class 변수 == object(객체)
		
		str = "안녕하세요";
		System.out.println(str);
		
		String str1 = new String("안녕하세요");//정석
		String str2 = "반갑습니다";//이렇게도 사용 가능.
		
		//문자열 결합.
		String str3 = str1 + str2;
		System.out.println(str3);
		
		str = str3 + "건강하세요";
		System.out.println(str);
		
		//equals: 문자열을 비교.
		String str4 = "world";
		String str5 = "world";
		str5 = str5 + "d";
		
		if(str4 == str5) {
			System.out.println("같은 문자열입니다.");
		}
		
	    boolean b = str4.equals(str5);
	    if(b == true) {
	    	System.out.println("같은 문자열입니다.");
	    }else {
	    	System.out.println("다른 문자열입니다.");
	    }
	    
	    //indexOf : 문자의 위치를 돌려 준다. hello world
	    //lastIndexOf
	    String str6 = "hello world";
	    int index = str6.indexOf("l");
	    System.out.println(index);
	    
	    
	    int lastIndex = str6.lastIndexOf("l");
	    System.out.println(lastIndex);
	    
	    //length : 문자열의 길이
	    int len = str6.length();
	    System.out.println(len);
	    
	    //replace : 수정
	    String str7 = "A*B*C*D";
	    String repStr = str7.replace("*", "-");
	    System.out.println(repStr);
	    
	    //split : 문자열을 자른다   홍길동-24-2001/05/14-서울시
	    String str8 = "홍길동-24-2001/05/14-서울시";
	    String spStr[] = str8.split("-");
	    System.out.println(spStr[0]);
	    System.out.println(spStr[1]);
	    System.out.println(spStr[2].replace("/", "-"));
	    System.out.println(spStr[3]);
	    /*
	    for (int =0; i<spStr.length; i++) {
	    	System.out.println(spStr[i]);//이방식으로 사용할 수 있음.
	    }
	    */
	    
	    //substring : 문자열의 범위를 자른다.
	    String str9 = "안녕 반가워요 건강해요";
	    String substr = str9.substring(3, 7); //시작위치, 이 위치 전까지.
	    System.out.println(substr);
	    
	    
	    
	    
	    
	    /**/
	    //toUpperCase : 모두 대문자 //사용빈도수 낮음.
	    String str10 = "abcDEF";
	    String upStr = str10.toUpperCase();
	    System.out.println(upStr);
	    
	    //toLowerCase : 모두 소문자 //사용빈도수 낮음.
	    String lowStr = str10.toLowerCase();
	    System.out.println(lowStr);
	    
	    //trim : 문자열의 앞뒤에 공백을 제거.//자주 쓰임.
	    String str11 = "           java java java       ";
	    String trimStr = str11.trim();
	    System.out.println(trimStr);
	    
	    //charAt hello world
	    String str12 = "가나다라마";
	    char c = str12.charAt(2);
	    System.out.println(c);
	    
	    //contains _ 컨테이너 문자열을 생각하면 됨.
	    String str13 = "서울시 마포구 서교동";
	    boolean b1 = str13.contains("마포");
	    System.out.println(b1);
	    
	    

		

	}

}
