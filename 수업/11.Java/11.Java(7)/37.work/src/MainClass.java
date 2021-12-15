
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student();
		
		s.name = "È«±æµ¿";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("ÀÌ¸§:"+s.name);
		System.out.println("ÃÑÁ¡:"+s.getTotal(s.kor, s.eng, s.math) );
		System.out.println("Æò±Õ:"+s.getAverage( ) );
	}

}
