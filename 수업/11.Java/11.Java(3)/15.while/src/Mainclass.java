
public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		loop
		
		for(초기화;조건식;연산식){
			처리
		}
		
		초기화
		while(조건식){	if(조건식) // > < >= 
			처리
			연산식
		}
		
		초기화
		do{				
			처리			
			연산식
		}while(조건식);		
	*/
	
	int w;		
	w = 0;
	while(w < 10) {			
		System.out.println("while loop " + w);
		
		w++;
	}
	
	int i;		
	i = 0;
	for( ; i < 10 ; ) {
		System.out.println("for loop " + i);
		
		i++;
	}
	/*
	int count = 0;
	while( true ) {
		count++;
		System.out.println(count);
	}
	*/
	
	/*
		Program
		
		초기화 - initialize			
		메인 - loop(무한루프)			
		해방(메모리) - release		
	*/
	
	int dw;
	
	dw = 0;		
	do {
		System.out.println("do while loop " + dw);			
		dw++;
	}while(dw < 10);
	
	// 2중 while 구구단
	int w1, w2;
	w1 = w2 = 1;
	
	while(w1 < 10) {			
		w2 = 1;
		while(w2 < 10) {
			System.out.print(w1 + " x " + w2 + " = " + (w1 * w2) + " ");				
			w2++;
		}		
		System.out.println();			
		w1++;
	}		

}
}
		

