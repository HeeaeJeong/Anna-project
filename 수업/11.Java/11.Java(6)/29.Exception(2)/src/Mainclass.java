import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//NullPointerException : �����Ҵ��� �ȵ� ��� -���� ���� Ȱ���.
		String str = null;
		
		try {
		System.out.println(str.length());
		}catch (NullPointerException e) {
		// e.printStacckTrace();
			System.out.println("str�� �Ҵ���� �ʾҽ��ϴ�.");
		}
		//ArrayIndexOutOfBoundsException : �迭������ �ʰ��� ���
		int array[] = { 1, 2, 3 };
		
		try {
		array[3] = 'a';
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		//FileNotFoundException : ������ ���� ���
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
		
		//NumberFormatException : ���ڰ� �ƴ� ���
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

