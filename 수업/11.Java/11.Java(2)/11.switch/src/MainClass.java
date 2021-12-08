
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Switch : if문과 비슷하다.
		 * 상황빈도수가 낮음.
		 * 값이 명확해야함.
		 * 범위를 지정할 수 없다. >
		 * 실수를 사용할 수 없다. 0.12
		 * 
		 * if(number == 1){
		 * }else if(number == 2){
		 * }
		 * 
		 * 
		 * 형식 :
		 * switch( 대상이 되는 변수 ){
		 * 
		 * case 값1:                 if(대상이 되는 변수 == 값1)
		 *     처리1
		 *    break;
		 *    
		 * case 값2:
		 *     처리2
		 *    break;
		 *    :
		 *    default:
		 *    해당 값이 없을 경우의 처리
		 *    break;
		 * 
		 * }
		 * */
		
		int number =2;
		switch( number ) {
		case 1 : 
			System.out.println("number는 1입니다");
			break;
		case 2 : 
			System.out.println("number는 2입니다");
			break;
		case 3 :
			System.out.println("number는 3입니다");
			break;
		default:
			System.out.println("number는" + number);			
			break;//붙이지 않아도 됨.


		
			
			
		}
		
	}

}
