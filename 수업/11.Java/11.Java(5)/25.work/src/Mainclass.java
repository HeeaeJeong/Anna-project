import java.util.Arrays;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 아스키 코드 값을 입력하면 문자를 확인할 수 있는 함수를 작성하라.
		// static char ascToChar(int asc)
		char c = ascToChar(97);
		System.out.println(c);		
		
		// 두수의 나눗셈을 하는 함수를 작성하라. 하나의 함수에서 몫(return)과 나머지(배열)를 구한다. 출력X
		int tag[] = new int[1];
		int r = div(9, 2, tag);
		System.out.println("몫:" + r + " 나머지:" + tag[0]);
		
		// 두점 사이의 거리를 구하는 함수를 작성하라. 
		// static double distance(double x1, double y1, double x2, double y2)
		// 	root (y2 - y1)2승 + (x2 - x1)2승
		int x1, y1, x2, y2;
		x1 = 0;
		y1 = 0;
		x2 = 1;
		y2 = 1;
		double dis = distance(x1, y1, x2, y2);
		System.out.println(dis);

		// 입력된 숫자가 정수인지 실수인지 확인할 수 있는 함수를 작성하라.
		// static boolean isDouble(String snumber)
		String snumber = "123.456";
		boolean b = isDouble(snumber);
		System.out.println(b);

		// 2차원 배열을 1차원 배열로 변경해서 리턴하는 함수를 작성하라.
		// static int[] array2ToArray1(int array[][])	3 * 4 -> 12
		int array2[][] = {
				{ 1, 2, 3, 4 },
				{ 5, 6, 7, 8, },
				{ 9, 10, 11, 12 },
		};
		
		int array1[] = array2ToArray1(array2);
		System.out.println(Arrays.toString(array1));
				
	}
	static char ascToChar(int asc) {
		return (char)asc;
	}
	
	// static int div(int n1, int n2, int* tag)
	
	static int div(int n1, int n2, int[] tag) {
		int r = n1 / n2;
		tag[0] = n1 % n2;
		return r;
	}
	
	static double distance(double x1, double y1, double x2, double y2) {
		double result;
		result = Math.sqrt( Math.pow((y2 - y1), 2) + Math.pow((x2 - x1), 2) );
		return result;
	}
	
	static boolean isDouble(String snumber) {
	//	boolean b = snumber.contains(".");
	//	return b;
		
		boolean b = false;
		for (int i = 0; i < snumber.length(); i++) {
			char c = snumber.charAt(i);
			if(c == '.') {
				b = true;
				break;
			}
		}
		
		return b;
	}
	
	static int[] array2ToArray1(int array2[][]) {	// 함수의 prototype	
		int array1[] = new int[ array2.length * array2[0].length ];
		/*
		 * 						i = 0 1 2	j = 0 1 2 3
		   array2 array1[]
		    2차원   1차원 										   i   j	
			0 0		0			array2[0].length * 0 + 0
			0 1		1			array2[0].length * 0 + 1
			0 2		2
			0 3		3
			
			1 0		4
			1 1		5
			1 2		6
			1 3		7
			
			2 0		8
			2 1		9
			2 2		10
			2 3		11
		*/
		
		int count = 0;
		for (int i = 0; i < array2.length; i++) {		// 0 1 2
			for (int j = 0; j < array2[i].length; j++) { // 0 1 2 3
			//	array1[ array2[i].length * i + j ] = array2[i][j];
				array1[ count ] = array2[i][j];
				count++;
			}			
		}
		
		return array1;
	}

}
