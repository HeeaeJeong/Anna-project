import java.util.Scanner;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//변수의 문자가 숫자로만 되어 있는지 아니면 다른 문자인지를 판별하는 코드를 작성해주세요.
		/*
		 * char c = 'A';
		
		boolean d = true;
		
		Scanner in = new Scanner(System.in);
		System.out.print("입력해주세요");
		String str=in.next();
		
		for(int i=0; i<str.length();i++) {
			if(c < '0' || c>'9') {
				d = false;
				break;
			}
		}
		if(d == true) {
			System.out.println("숫자입니다.");
		}else {
			System.out.println("문자입니다.");
		}
		 */
		
		//숫자입니다.
		//숫자가 아닙니다.
		//(아스키 코드)
		
		//선생님 코드.
		char c = 'A';
		boolean numberOK = true;
		System.out.println((int)c);
		
		int asccode = (int)c;
		if(asccode < 48 || asccode > 57) {
			numberOK = false;
		}
		if(numberOK) {
			System.out.println("숫자입니다");
		}else {
			
		}System.out.println("숫자가 아닙니다");
		
		
		//입력된 문자열이 모두 숫자로 되어 있는지 아니면 모두 숫자로 되어 있지 않는지 판정
		//(아스키코드)
		//123 123a 1s23
		Scanner sc = new Scanner(System.in);
		
		System.out.println("number");
		String strNum = sc.next();    //"12345" -> char[]
		
		numberOK = true;
		for (int i = 0; i < strNum.length(); i++) {
			char ch = strNum.charAt(i);
			int n = (int)ch;
			if(n < 48 || n > 57) {
				
			}
		}
		if(numberOK) {
			System.out.println("모두 숫자입니다");
			
			int Number = Integer.parseInt(strNum);
		}else {
			
		}System.out.println("숫자가 아닌 문자가 포함되어 있습니다");
		
		//영단어로 입력 -> toUpperCase나 toLowerCase를 사용하지 않고 모두 대문자로 출력되도록 하라.	
		
		String word = "Hello";
		String result = "";
		
		for(int i = 0; i < word.length(); i++ ) {
			char c1 = word.charAt(i);
			int n = (int)c1;
			
			if(n >= 97 ) { //97(a) 65(A) = 32
				n = n -32;
				
			}
			
			result = result + (char)n;
			
		}
		System.out.println(result);
		
		
		

	}
}
