
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Switch : if���� ����ϴ�.
		 * ��Ȳ�󵵼��� ����.
		 * ���� ��Ȯ�ؾ���.
		 * ������ ������ �� ����. >
		 * �Ǽ��� ����� �� ����. 0.12
		 * 
		 * if(number == 1){
		 * }else if(number == 2){
		 * }
		 * 
		 * 
		 * ���� :
		 * switch( ����� �Ǵ� ���� ){
		 * 
		 * case ��1:                 if(����� �Ǵ� ���� == ��1)
		 *     ó��1
		 *    break;
		 *    
		 * case ��2:
		 *     ó��2
		 *    break;
		 *    :
		 *    default:
		 *    �ش� ���� ���� ����� ó��
		 *    break;
		 * 
		 * }
		 * */
		
		int number =2;
		switch( number ) {
		case 1 : 
			System.out.println("number�� 1�Դϴ�");
			break;
		case 2 : 
			System.out.println("number�� 2�Դϴ�");
			break;
		case 3 :
			System.out.println("number�� 3�Դϴ�");
			break;
		default:
			System.out.println("number��" + number);			
			break;//������ �ʾƵ� ��.


		
			
			
		}
		
	}

}
