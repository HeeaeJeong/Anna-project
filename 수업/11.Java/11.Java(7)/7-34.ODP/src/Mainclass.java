
public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * ����, ����
		 * Object Oriented Progrmming
		 * ��ü  ����
		 * 
		 * �帧 -> ��������
		 * 
		 * 1.���м�(ĸ��ȭ)
		 * 2.��Ӽ�
		 * 3.�پ缺
		 * 
		 * 
		 * ����:
		 *    class Ŭ������{
		 *       variable
		 *      
		 *       method 
		 *     }
		 * 
		 * */
     //class, array -> allocation(�����Ҵ�) -> Heap
		MyClass cls = new MyClass();
	//   �ڷ���   Ŭ������ ���� == ��ü, object, 
	//          instance(��ü)
		cls.number = 1;
		cls.name ="ȫ�浿";
		cls.method();
		
		MyClass cls1 = new MyClass();
		cls1.number = 2;
		cls1.name = "������";
		cls1.method();
		
		// ��������
		boolean isPowerOn[] = new boolean[2];
		int channel[] = new int[2];
		int volume[] = new int[2];
		String maker[] = new String[2];
		
		isPowerOn[0] = true;
		channel[0] = 23;
		volume[0] = 10;
		maker[0] = "�Ｚ";
		
		isPowerOn[1] = false;
		channel[1] = 50;
		volume[1] = 0;
		maker[1] = "LG";		
		
		for(int i = 0; i < channel.length; i++) {
		System.out.println("ȸ��� "+ maker[i] + "���´�" + isPowerOn[i] + "ä����" + channel[i] + "�Դϴ�.");			
		}

		
		
		/*
		TV tv1 = new TV();
		tv1.isPowerOn = true;
		tv1.channel = 23;
		tv1.volume = 10;
		tv1.method();
		
		TV tv2 = new TV();
		tv2.isPowerOn = false;
		tv2.channel = 50;
		tv2.volume = 0;
		tv2.method();		
		*/
		
		TV tvArr[] = new TV[2]; //���� : ��ü ���� �ƴ� (�迭 ����-TV tv1, tv2, tv3;)
		
		for (int i =0; i < tvArr.length; i++) {
			tvArr[i] = new TV();//��ü����
		}
		
		tvArr[0].isPowerOn = true;
		tvArr[0].channel = 23;
		tvArr[0].volume = 10;
		tvArr[0].maker = "�Ｚ";
		
		tvArr[1].isPowerOn = false;
		tvArr[1].channel = 50;
		tvArr[1].volume = 0;
		tvArr[1].maker = "LG";
		
		for (int i =0; i < tvArr.length; i++) {
			tvArr[i].method();
		}
	}
	
}
		
class TV{
	boolean isPowerOn;
	int channel;
	int volume;
	String maker;
	
	void method() {
		System.out.println("ȸ��� "+ maker + "���´�" + isPowerOn + "ä����" + channel + "�Դϴ�.");

		
		
	}

}

class MyClass{
	// ��� ����
	int number;
	String name;
	// ��� �޼ҵ�
	void method() {
		System.out.println("MyClass method()");
	}
	
}
