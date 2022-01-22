package com.scsa.java.sixth.BookTest;

import com.scsa.java.sixth.Book.Book;
import com.scsa.java.sixth.Magazine.Magazine;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("*********************** 도서목록 **************************");
		
		Book b1 = new Book("21424", "Java Basic", "김하나", "Jane.kr", 15000, "Java 기본문법");
		Book b2 = new Book("33455", "JDBC Pro", "김철수", "Jane.kr", 23000, "");
		Book b3 = new Book("55355", "Servlet/JSP", "박자", "Jane.kr", 41000, "Mode12 기반");
		Book b4 = new Book("35332", "Android App", "홍길", "Jane.kr", 25000, "Lightweight Framework");
		Book b5 = new Book("35355", "OOAD 분석,설", "소나", "Jane.kr", 30000, "");
		
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		System.out.println(b3.toString());
		System.out.println(b4.toString());
		System.out.println(b5.toString());
		
		
		System.out.println("\r*********************** 잡지목록 **************************");
		
		Magazine m1 = new Magazine("35535", "Java World", "편집부", "Jane.kr", 7000, "", 2013, 2);
		Magazine m2 = new Magazine("33434", "Mobile World", "편집부", "Jane.kr", 8000, "", 2013, 8);
		Magazine m3 = new Magazine("75342", "Next Web", "편집부", "Jane.kr", 10000, "AJAX 소개", 2012, 10);
		Magazine m4 = new Magazine("76543", "Architecture", "편집부", "Jane.kr", 5000, "java 시스템", 2010, 3);
		Magazine m5 = new Magazine("76534", "Data Modeling", "편집부", "Jane.kr", 14000, "", 2012, 12);
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
		System.out.println(m4.toString());
		System.out.println(m5.toString());
		
		
		

	}

}
