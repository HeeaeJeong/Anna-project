
public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* Continue��.
 * Continue : Skip(����)
 * 
 * loop���� ���� ���.
 * 
 * while(���ǹ�){
 * ó��1
 * ó��2
 * if(����){
 * continue;
 * }
 * ó��3 ->������ true�� �� ó���� ���� �ʴ´�.
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
	
	//while������ ����./���ѷ����� �����.
	int w = 0;
	while(w<10) {
		System.out.println("w = " + w);
		
		System.out.println("while start");
		
		if(w > 3) {
			continue;
		}
		System.out.println("while end");
		
		w++;//������� �ϴܿ� �ֱ� ������.
	}
	
	
	}

}
