
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student();
		
		s.name = "ȫ�浿";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("�̸�:"+s.name);
		System.out.println("����:"+s.getTotal(s.kor, s.eng, s.math) );
		System.out.println("���:"+s.getAverage( ) );
	}

}
