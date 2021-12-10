import java.util.Arrays;
import java.util.Scanner;

public class Mainclass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		// 정렬 프로그램
		//int count;	// 몇개를 정렬할지의 변수
		int number[] = null;
		int updown;
		
		// 입력
		// user 몇개의 숫자를 정렬?
		// 갯수를 결정
		System.out.print("몇개의 숫자를 정렬 = ");
		int count = sc.nextInt();
		
		number = new int[count];
		// 숫자들을 입력
		for (int i = 0; i < number.length; i++) {
			System.out.print((i + 1) + "번째 수 = ");
			number[i] = sc.nextInt();
		}
		
		// 오름/내림
		System.out.print("오름(1)/내림(2) = ");
		updown = sc.nextInt();
		
		
		// 정렬처리
		int temp;		
		for (int i = 0; i < number.length - 1; i++) {	// [0][1][2][3][4]
			for (int j = i + 1; j < number.length; j++) {				
				if(updown == 1) {					
					if(number[i] > number[j]) {
						temp = number[i];
						number[i] = number[j];
						number[j] = temp;								
					}
				}
				else {
					
					if(number[i] < number[j]) {
						temp = number[i];
						number[i] = number[j];
						number[j] = temp;								
					}
				}
			}
		}
		
		System.out.println(Arrays.toString(number));
		
		
		
		// 결과출력
		/*
		int number[] = { 3, 5, 1, 4, 2 };
					//	 1 ->					Debug : 
					//		2 ->
					//		   3 ->
					//			  4 ->		
		int temp;
		for(int i = 0;i < number.length - 1; i++) {			
			for(int j = i + 1; j < number.length; j++ ) {				
				if(number[i] < number[j]) {		// 교환처리
					temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}			
		}		
*/
		//디버깅 작업: run - Debug (ctrl+f11 ->f6) //breakpoint 잡은후 실행.
		//variable을 기입할 수 있음.
		//우리가 보고 싶은 변수만 선택할 경우-Expressions
	}
	

	}
