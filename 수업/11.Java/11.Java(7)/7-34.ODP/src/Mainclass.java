
public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 구조, 관리
		 * Object Oriented Progrmming
		 * 객체  지향
		 * 
		 * 흐름 -> 절차지향
		 * 
		 * 1.은닉성(캡슐화)
		 * 2.상속성
		 * 3.다양성
		 * 
		 * 
		 * 형식:
		 *    class 클래스명{
		 *       variable
		 *      
		 *       method 
		 *     }
		 * 
		 * */
     //class, array -> allocation(동적할당) -> Heap
		MyClass cls = new MyClass();
	//   자료형   클래스의 변수 == 객체, object, 
	//          instance(주체)
		cls.number = 1;
		cls.name ="홍길동";
		cls.method();
		
		MyClass cls1 = new MyClass();
		cls1.number = 2;
		cls1.name = "성춘향";
		cls1.method();
		
		// 절차지향
		boolean isPowerOn[] = new boolean[2];
		int channel[] = new int[2];
		int volume[] = new int[2];
		String maker[] = new String[2];
		
		isPowerOn[0] = true;
		channel[0] = 23;
		volume[0] = 10;
		maker[0] = "삼성";
		
		isPowerOn[1] = false;
		channel[1] = 50;
		volume[1] = 0;
		maker[1] = "LG";		
		
		for(int i = 0; i < channel.length; i++) {
		System.out.println("회사는 "+ maker[i] + "상태는" + isPowerOn[i] + "채널은" + channel[i] + "입니다.");			
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
		
		TV tvArr[] = new TV[2]; //주의 : 객체 새성 아님 (배열 생성-TV tv1, tv2, tv3;)
		
		for (int i =0; i < tvArr.length; i++) {
			tvArr[i] = new TV();//객체생성
		}
		
		tvArr[0].isPowerOn = true;
		tvArr[0].channel = 23;
		tvArr[0].volume = 10;
		tvArr[0].maker = "삼성";
		
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
		System.out.println("회사는 "+ maker + "상태는" + isPowerOn + "채널은" + channel + "입니다.");

		
		
	}

}

class MyClass{
	// 멤버 변수
	int number;
	String name;
	// 멤버 메소드
	void method() {
		System.out.println("MyClass method()");
	}
	
}
