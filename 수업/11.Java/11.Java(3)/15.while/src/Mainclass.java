
public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		loop
		
		for(�ʱ�ȭ;���ǽ�;�����){
			ó��
		}
		
		�ʱ�ȭ
		while(���ǽ�){	if(���ǽ�) // > < >= 
			ó��
			�����
		}
		
		�ʱ�ȭ
		do{				
			ó��			
			�����
		}while(���ǽ�);		
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
		
		�ʱ�ȭ - initialize			
		���� - loop(���ѷ���)			
		�ع�(�޸�) - release		
	*/
	
	int dw;
	
	dw = 0;		
	do {
		System.out.println("do while loop " + dw);			
		dw++;
	}while(dw < 10);
	
	// 2�� while ������
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
		

