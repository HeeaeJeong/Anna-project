
public class Student {

		String name;
		int ban;
		int no;
		int kor;
		int math;
		int eng;
		
		int total;
		/* 1��° ���
		int getTotal(int kor, int eng, int math) {
			total = kor + eng + math;
			return total;
		}
		
		double getAverage() {
			return (double)total / 3;
		}
		
		*/
		//2��° ���
		int getTotal(int kor, int eng, int math) {
			this.kor = kor;
			this.eng = eng;
			this.math = math;
			
			return (kor + eng + math);
		}
		
		double getAverage() {
			return (kor + eng + math ) /3;
		}
}
