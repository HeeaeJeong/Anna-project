package main;

import cls.NameCard;
import cls.PrintNameCard;
import cls.PrintNamePhoneCard;

public class MainClass {
	public static void main(String[] args) {
		
		NameCard namecard = new NameCard("ȫ�浿", "123-4567", "hgd@naver.com");
		
		namecard.setPrintCard(new PrintNameCard());
		namecard.print();
		
		namecard.setPrintCard(new PrintNamePhoneCard());
		namecard.print();

	}
}