import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//NullPointerException : 동적할당이 안된 경우 -가장 많이 활용됨.
		String str = null;
		
		try {
		System.out.println(str.length());
		}catch (NullPointerException e) {
		// e.printStacckTrace();
			System.out.println("str은 할당되지 않았습니다.");
		}
		//ArrayIndexOutOfBoundsException : 배열범위가 초과한 경우
		int array[] = { 1, 2, 3 };
		
		try {
		array[3] = 'a';
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		//FileNotFoundException : 파일이 없는 경우
		File file = new File("d:\\xxx");
		FileInputStream is;
		
		try {
		is = new FileInputStream(file);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//StringIndexOutOfBoundsException
		String str1 = "java";
		
		try {
		str1.charAt(4);
		}catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		//NumberFormatException : 숫자가 아닌 경우
		boolean b = false;
		
		try {
		int number = Integer.parseInt("12a");
		}catch(NumberFormatException e) {
			e.printStackTrace();
			b = true;
		}	
		if(b == false) {
		}
	}}

