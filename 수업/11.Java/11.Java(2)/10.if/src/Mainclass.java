
public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * if : ���ǹ�.
 * 
 * ���� : if(����>90){ ���� -> true/false
 * ó��
 * }
 * 
 * ���� : == (����), >(ũ��), <(�۴�), >=(ũ�ų� ����), ,<=(�۰ų� ����), !=(���� �ʴ�)
 * 
 * �ټ��� ���� : �� �����ڿ� �Բ� ����Ѵ�.
 *            &&(and), ||(or), !(not)
 *            
 *              if(���� 1 && ����2){
 *              }
 *
 *
 **/
		
		/*
		int number = 5;
		if (number > 0) {//<-true
			System.out.println("number�� 0���� Ů�ϴ�");
		}
		
		if(number == 5) {
			System.out.println("number�� 5�Դϴ�");
		}
	
	if(number >= 5) {
		System.out.println("number�� 5���� ũ�ų� �����ϴ�");
	}

		
		boolean b = true;
		
		if(b == true) {
			System.out.println("b�� true�Դϴ�.");
			}
		
	
	if(b) {
		System.out.println("if(b) true�Դϴ�.");
		}
	
	b = false;
	if(b == false) {
		System.out.println("b�� false�Դϴ�.");
		}
	
	
	if(number >0 && number <= 10 && b == false) {
		System.out.println("number�� 0���� ũ�� 10���� �۰ų� ���� b�� false�Դϴ�.");
		
	}
	
	if(number > 0 || number > 10 ) {
		System.out.println("number�� 0���� ũ�ų� 10���� ũ��");
	}
	*/
	/* if ---else��.
	if( ���� ) {
	    ó��1
	    }else{
	    ó��2
	    }
	    
	    ���� ������
	    �� = (����) ? ��1 : ��2
	    
	
	 
		int number = 69;
		
		if(number >= 70) {
			System.out.println("����Դϴ�.");
		}else {
			System.out.println("������Դϴ�"); //���߿� �ϳ��� ������ �ݵ�� �����Ǿ�� �Ѵ�.
		}
		
		//���� ������
		
		String result = (number >= 70) ? "����Դϴ�":"������Դϴ�"; //���� �����̱� ������ ���׿����ڶ�� �θ���.
		System.out.println(result);
		
		int num = (number > 60)?10:5;
		System.out.println(result);*/
	
		/*
		 ���Ǻб�
		 if( ����1 ){
		     ó��1
		 }
		 else if( ����2 ){
		     ó��2
		 }
		 else if( ����3 ){
		     ó��3
		 }
		 else{
		     ó��4
		 } 
		 
		 
		 
		
		int number = 90;
		
		if(number == 100) {
			System.out.println("A+ �Դϴ�.");
		}
		else if(number >= 90) {
			System.out.println("A �Դϴ�.");
		}
		else if(number >= 80) {
			System.out.println("B �Դϴ�.");
		}
		else if(number >= 70) {
			System.out.println("C �Դϴ�.");
		}
		else{
			System.out.println("������Դϴ�.");
		}
		*/
		//���ǹ� �ȿ� ���ǹ�.
		/*
		 * if(����1) {
		 * if(����2){
		 *    ó��1
		 * }else{
		 *    ó��2
		 *    }
		 *    }
		

		 */
		

		//String
		String str1 ="�ȳ��ϼ���";
		String str2 ="�ȳ�";
		
		str2 = str2 + "�ϼ���";
		System.out.println(str2);
		
		if(str1 == str2) {
			System.out.println("���� ���ڿ��Դϴ�.");
		}
		else {
			System.out.println("�ٸ� ���ڿ��Դϴ�.");
		}
		
		//�ٸ� ������ ���ϴٺ��� �ٸ��ٰ� �ν���.
		//equlas(����)�� ����ؾ���.
		
		if(str1.equals( str2 )) { //��ȭ�� �Լ�. str1�� ���ڿ��� str2�� ���ڿ��� ����.
			System.out.println("���� ���ڿ��Դϴ�.");
		}
		else {
			System.out.println("�ٸ� ���ڿ��Դϴ�.");
		} //���� ���ڿ��̶�� ��µ�.
		
		
		
		
	
	
	
	}
	
	
	
}
