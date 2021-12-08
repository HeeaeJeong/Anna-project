import java.util.Arrays;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 
		 * Array : 같은 자료형의 묶음 변수들.
		 * 			접근 및 관리는 index로 된다.
		 * 			             번호 (0~Array. length-1)
		 * 			int Arr[] = new int[5]; //0~4까지.
		 * 			1.배열은 동적으로 정한다.(할당)
		 * 			2.정한후, 정적으로 사용.
		 * 			1차원 0-0-0-0-0 행(row)
		 * 
		 * 			int array[] = {1, 2, 3, 4, 5};
		 * 
		 * 			2차원 
		 * 				0-0-0-0-0  -> 행
		 * 				0-0-0-0-0
		 * 				0-0-0-0-0
		 * 
		 * 			int array2[][] = new int[큰 묶음][그안의 원소의 갯수];
		 * 
		 * 			0-0-0-0
		 * 			0-0-0-0
		 * 			0-0-0-0
		 * 		
		 * 			2차원 배열 필수로 알아야 함.(필수)
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
		 *3차원 배열과 4차원 배열이 있으나, 잘 사용하지 않아서 없다고 표현함.
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
		
		System.out.println(Arrays.toString(Array2[0]));*/ //[]추가해야 값을 출력할 수 있음.
		// Array[큰 묶음][각각의 요소]
		int Array23[][] = {
				{ 1, 2 },
				{ 3, 4 },
				{ 5, 6 },
		};
		
		System.out.println(Array23[3][2]);//줄간격에 따라서 달라짐.
		
		System.out.println(Array23.length);//큰묶음의 길이값이 나옴.
		System.out.println(Array23[0].length);
		
		int ArrCopy[][] = Array23;
		


	}

}
