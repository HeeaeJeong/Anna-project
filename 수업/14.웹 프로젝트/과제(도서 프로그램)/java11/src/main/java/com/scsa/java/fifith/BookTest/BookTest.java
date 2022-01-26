package com.scsa.java.fifith.BookTest;

import com.scsa.java.fifth.Book.Book;
import com.scsa.java.fifth.Magazine.Magazine;

public class BookTest {
	
	public static void main(String[] args) {
		
		System.out.println("*********************** 도서목록 **************************");
		
		Book b1 = new Book("21424", "Java Pro", "김하나", "Jane.kr", 15000, "");
		Book b2 = new Book("35355", "OOAD 분석,설계", "소나무", "Jane.kr", 30000, "");
		
		Magazine m1 = new Magazine("35535", "Java World", "편집부", "androidjava.com", 7000, 2013, 2, "");
		
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		System.out.println(m1.toString());
		

		
	}

}
