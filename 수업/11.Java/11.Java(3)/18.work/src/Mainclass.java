
import java.util.Arrays;
import java.util.Scanner;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 사용자가 원하는 학생수로 점수를 입력을 받는다.
		 총점, 평균 그리고 최고점수를 구한다.
		 입력 받은 점수 중에서 90점이상인 학생의 수는 몇명인가?
		 그리고 그 점수들만을 새로운 배열에 저장하도록 한다.
		
		int count = 0;
		int number[] = null;  //동적할당을 해줘야 하는 요소.
		// 입력
		// 몇명?
		System.out.print("몇명의 통계를 구하시겠습니까? = ");
		count = sc.nextInt();
		
		number = new int[count];
		// 학생들의 점수.		
		for ( int i = 0; i < number.length; i++) {
			System.out.println((i + 1) + "번째 점수 = ");
			number[i] = sc.nextInt();
		}		
		// 총점
		int sum = 0;
		for(int i = 0; i < number.length; i++) {
			sum = sum + number[i];
		}
		
		// 평균
		double avg = (double)sum / number.length;
		
		// 최고점수
		int max = number[0];
		for (int i = 1; i < number.length; i++) {
			if(number[i] > max) {
				max = number[i];
			}
		}
		
		// 우등생의 수
		int high = 0;
		for (int i = 0; i < number.length; i++) {
			if(number[i] >=90) {
				high++;
			}
		}
		
		// 우등생의 점수를 배열에 저장
		int highCount[] = new int[high];
		int n = 0;
		for (int i = 0; i < number.length; i++) {
			if(number[i] >=90) {
				highCount[i] = number[i];
				n++;
			}
		}
		
		// 배열에 저장
		System.out.println(Arrays.toString(number));
		System.out.println("합계:" + sum);
		System.out.println("평균:" + avg);
		System.out.println("최고점수:" + max);
		System.out.println("90점이상 점수의 학생수: " + high);
		System.out.println(Arrays.toString(highCount));	
		 */
		
		/*
		 숫자 입력 5개로 음수가 입력되면 다시 입력한다.
		
		
		int inputNum[] = new int[5];
		
		int w = 0;
		
		while(w<5) {
			System.out.print((w+1)+"번째 수 = ");
			int num = sc.nextInt();
			if(num > 0 ) {//정상입력
				inputNum[w] = num;
			}else {
				System.out.println("0이상의 수를 입력해 주십시오.");
				continue;
			}
			w++;
		}
		
		System.out.println(Arrays.toString(inputNum));
		 */
	}
}
