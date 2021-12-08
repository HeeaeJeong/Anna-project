
public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Continue문.
 * Continue : Skip(생략)
 * 
 * loop문과 같이 사용.
 * 
 * while(조건문){
 * 처리1
 * 처리2
 * if(조건){
 * continue;
 * }
 * 처리3 ->조건이 true면 이 처리는 되지 않는다.
 * }
 * */
	for(int i =0; i< 10; i++) {
		System.out.println("i = " + i);
		
		System.out.println("for start");
		
		if(i > 3) {
			continue;
		}
		System.out.println("for end");
	}
	
	//while문으로 실행./무한루프가 실행됨.
	int w = 0;
	while(w<10) {
		System.out.println("w = " + w);
		
		System.out.println("while start");
		
		if(w > 3) {
			continue;
		}
		System.out.println("while end");
		
		w++;//연산식이 하단에 있기 때문에.
	}
	
	
	}

}
