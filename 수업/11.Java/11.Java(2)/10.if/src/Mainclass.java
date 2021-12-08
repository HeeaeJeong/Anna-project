
public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * if : 조건문.
 * 
 * 형식 : if(조건>90){ 조건 -> true/false
 * 처리
 * }
 * 
 * 조건 : == (같다), >(크다), <(작다), >=(크거나 같다), ,<=(작거나 같다), !=(같지 않다)
 * 
 * 다수의 조건 : 논리 연산자와 함께 사용한다.
 *            &&(and), ||(or), !(not)
 *            
 *              if(조건 1 && 조건2){
 *              }
 *
 *
 **/
		
		/*
		int number = 5;
		if (number > 0) {//<-true
			System.out.println("number는 0보다 큽니다");
		}
		
		if(number == 5) {
			System.out.println("number는 5입니다");
		}
	
	if(number >= 5) {
		System.out.println("number는 5보다 크거나 같습니다");
	}

		
		boolean b = true;
		
		if(b == true) {
			System.out.println("b는 true입니다.");
			}
		
	
	if(b) {
		System.out.println("if(b) true입니다.");
		}
	
	b = false;
	if(b == false) {
		System.out.println("b는 false입니다.");
		}
	
	
	if(number >0 && number <= 10 && b == false) {
		System.out.println("number는 0보다 크고 10보다 작거나 같고 b는 false입니다.");
		
	}
	
	if(number > 0 || number > 10 ) {
		System.out.println("number는 0보다 크거나 10보다 크다");
	}
	*/
	/* if ---else문.
	if( 조건 ) {
	    처리1
	    }else{
	    처리2
	    }
	    
	    삼향 연산자
	    값 = (조건) ? 값1 : 값2
	    
	
	 
		int number = 69;
		
		if(number >= 70) {
			System.out.println("통과입니다.");
		}else {
			System.out.println("재시험입니다"); //둘중에 하나의 조건이 반드시 성립되어야 한다.
		}
		
		//삼항 연산자
		
		String result = (number >= 70) ? "통과입니다":"재시험입니다"; //항이 세개이기 때문에 삼항연산자라고 부른다.
		System.out.println(result);
		
		int num = (number > 60)?10:5;
		System.out.println(result);*/
	
		/*
		 조건분기
		 if( 조건1 ){
		     처리1
		 }
		 else if( 조건2 ){
		     처리2
		 }
		 else if( 조건3 ){
		     처리3
		 }
		 else{
		     처리4
		 } 
		 
		 
		 
		
		int number = 90;
		
		if(number == 100) {
			System.out.println("A+ 입니다.");
		}
		else if(number >= 90) {
			System.out.println("A 입니다.");
		}
		else if(number >= 80) {
			System.out.println("B 입니다.");
		}
		else if(number >= 70) {
			System.out.println("C 입니다.");
		}
		else{
			System.out.println("재시험입니다.");
		}
		*/
		//조건문 안에 조건문.
		/*
		 * if(조건1) {
		 * if(조건2){
		 *    처리1
		 * }else{
		 *    처리2
		 *    }
		 *    }
		

		 */
		

		//String
		String str1 ="안녕하세요";
		String str2 ="안녕";
		
		str2 = str2 + "하세요";
		System.out.println(str2);
		
		if(str1 == str2) {
			System.out.println("같은 문자열입니다.");
		}
		else {
			System.out.println("다른 문자열입니다.");
		}
		
		//다른 참조로 비교하다보니 다르다고 인식함.
		//equlas(동등)을 사용해야함.
		
		if(str1.equals( str2 )) { //비교화는 함수. str1의 문자열과 str2의 문자열이 같다.
			System.out.println("같은 문자열입니다.");
		}
		else {
			System.out.println("다른 문자열입니다.");
		} //같은 문자열이라고 출력됨.
		
		
		
		
	
	
	
	}
	
	
	
}
