import java.util.Arrays;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 
		 * Array : ���� �ڷ����� ���� ������.
		 * 			���� �� ������ index�� �ȴ�.
		 * 			             ��ȣ (0~Array. length-1)
		 * 			int Arr[] = new int[5]; //0~4����.
		 * 			1.�迭�� �������� ���Ѵ�.(�Ҵ�)
		 * 			2.������, �������� ���.
		 * 			1���� 0-0-0-0-0 ��(row)
		 * 
		 * 			int array[] = {1, 2, 3, 4, 5};
		 * 
		 * 			2���� 
		 * 				0-0-0-0-0  -> ��
		 * 				0-0-0-0-0
		 * 				0-0-0-0-0
		 * 
		 * 			int array2[][] = new int[ū ����][�׾��� ������ ����];
		 * 
		 * 			0-0-0-0
		 * 			0-0-0-0
		 * 			0-0-0-0
		 * 		
		 * 			2���� �迭 �ʼ��� �˾ƾ� ��.(�ʼ�)
		 * 
		 * 			int array2[][] = new int[3][4];
		 * 			int []array2[] = new int[3][4];
		 * 			int [][]array2 = new int[3][4];
		 * 
		 * 			0-0-0-0
		 * 			0-0-0-0 
		 * 			0-0-0-0
		 * 			
		 * 			int array2[][] = {
		 * 			{1,2,3,4},    0
		 * 			{5,6,7,8},    1
		 * 			{9,10,11,12}  2				
		 * 			}; 
		 * 
		 *3���� �迭�� 4���� �迭�� ������, �� ������� �ʾƼ� ���ٰ� ǥ����.
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		/*
		int Array2[][] = new int[3][4];
		
		Array2[0][0] = 1;
		Array2[0][1] = 2;
		Array2[0][2] = 3;
		Array2[0][3] = 4;
		
		Array2[1][0] = 5;
		Array2[1][1] = 6;
		Array2[1][2] = 7;
		Array2[1][3] = 8;
		
		Array2[2][0] = 9;
		Array2[2][1] = 10;
		Array2[2][2] = 11;
		Array2[2][3] = 12;
		
		System.out.println(Arrays.toString(Array2[0]));*/ //[]�߰��ؾ� ���� ����� �� ����.
		// Array[ū ����][������ ���]
		int Array23[][] = {
				{ 1, 2 },
				{ 3, 4 },
				{ 5, 6 },
		};
		
		System.out.println(Array23[3][2]);//�ٰ��ݿ� ���� �޶���.
		
		System.out.println(Array23.length);//ū������ ���̰��� ����.
		System.out.println(Array23[0].length);
		
		int ArrCopy[][] = Array23;
		


	}

}
