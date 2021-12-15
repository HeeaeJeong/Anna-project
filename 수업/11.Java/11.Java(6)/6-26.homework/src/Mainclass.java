
public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//학생들의 정보를 2차 배열에 입력을 받는다.
	//(이름, 생년월일, 국어, 영어, 수학)
	//각 학생들의 국어 영어 수학을 합친 총점은?
	//학생들의 국어점수의 총점은?
	//영어 점수의 최고 점수는 몇점인가?
	//수학 점수의 최저점수는 몇점인가?
	//학급에서 1등은 누구인가? 이름을 출력해라.

	
	String[] title = {"이름  생년월일","국어","영어","수학","총합"};
	String[] name = {"이유라 990322","강한나 990211","홍길동 990230"};
	
	int[][] score = {{90,90,90},{60,60,60},{80,80,0}};
	int arr []=new int[3];
	int kotot = 0;
	int egtot = 0;
	int matot = 0;
	
	//타이틀
	System.out.println("학생들의 정보");
	for(String t:title) {
		System.out.print(t+"\t");		
	}
	System.out.println();
	//이름,점수
	for(int i = 0; i<score.length;i++) {
		System.out.print(name[i]+"\t");
		
	for(int j=0;j<score[i].length;j++) {
			System.out.print(score[i][j]+"\t");
			
			arr[j]+=score[i][j];
		}
	//국어 총합
	kotot += score[i][0];
		
	//총합
	int summ = 0;
	for(int j = 0; j < score[i].length; j++) {
		summ += score[i][j];
	}
		System.out.println(summ+"\t");
	}
	System.out.println("");
	
	//국어 총합
	System.out.println("학생들의 국어 총점은 얼마인가요?");
	System.out.println("총점은"+kotot+"입니다.");
	
	System.out.println("");
	
	//영어 점수의 최고 점수는 몇점 인가요?
	System.out.println("영어 점수의 최고 점수는 몇점인가요?");

	egtot = score[0][1];
	int max = 0;
		if(score[0][1] > max) {
			max = score[0][1];
		}
	System.out.println("영어의 최고 점수는" + max);
	
	System.out.println("");	
	
	//수학 점수의 최저점수는 몇점인가?
	System.out.println("수학 점수의 최저 점수는 몇점인가요?");
	matot = score[0][2];
	int min = 0;
	    if(score[0][2] < min) {
	    	min = score[0][2];
	    }
	System.out.println("수학 최저 점수는" + min);
	
	System.out.println("");	
	//학급에서 1등은 누구인가? 이름을 출력해라.


	


	


	
	
	}
}
