package main;

import movie.Movie;
import movie.MovieWork;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie mv = new Movie("스파이더맨", 7, 5);
		mv.display();
		
		System.out.println("***********************************"); // 매개변수 4개인 생성자로 객체 생성
		
		MovieWork mk = new MovieWork("매트릭스", 9, 10, 10, 8, 9);
		mk.display();
	}

}
