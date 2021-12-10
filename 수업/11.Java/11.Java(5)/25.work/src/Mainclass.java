import java.util.Arrays;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ƽ�Ű �ڵ� ���� �Է��ϸ� ���ڸ� Ȯ���� �� �ִ� �Լ��� �ۼ��϶�.
		// static char ascToChar(int asc)
		char c = ascToChar(97);
		System.out.println(c);		
		
		// �μ��� �������� �ϴ� �Լ��� �ۼ��϶�. �ϳ��� �Լ����� ��(return)�� ������(�迭)�� ���Ѵ�. ���X
		int tag[] = new int[1];
		int r = div(9, 2, tag);
		System.out.println("��:" + r + " ������:" + tag[0]);
		
		// ���� ������ �Ÿ��� ���ϴ� �Լ��� �ۼ��϶�. 
		// static double distance(double x1, double y1, double x2, double y2)
		// 	root (y2 - y1)2�� + (x2 - x1)2��
		int x1, y1, x2, y2;
		x1 = 0;
		y1 = 0;
		x2 = 1;
		y2 = 1;
		double dis = distance(x1, y1, x2, y2);
		System.out.println(dis);

		// �Էµ� ���ڰ� �������� �Ǽ����� Ȯ���� �� �ִ� �Լ��� �ۼ��϶�.
		// static boolean isDouble(String snumber)
		String snumber = "123.456";
		boolean b = isDouble(snumber);
		System.out.println(b);

		// 2���� �迭�� 1���� �迭�� �����ؼ� �����ϴ� �Լ��� �ۼ��϶�.
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
	
	static int[] array2ToArray1(int array2[][]) {	// �Լ��� prototype	
		int array1[] = new int[ array2.length * array2[0].length ];
		/*
		 * 						i = 0 1 2	j = 0 1 2 3
		   array2 array1[]
		    2����   1���� 										   i   j	
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
