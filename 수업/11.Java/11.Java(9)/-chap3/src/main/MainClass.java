package main;

import movie.Movie;
import movie.MovieWork;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie mv = new Movie("�����̴���", 7, 5);
		mv.display();
		
		System.out.println("***********************************"); // �Ű����� 4���� �����ڷ� ��ü ����
		
		MovieWork mk = new MovieWork("��Ʈ����", 9, 10, 10, 8, 9);
		mk.display();
	}

}
