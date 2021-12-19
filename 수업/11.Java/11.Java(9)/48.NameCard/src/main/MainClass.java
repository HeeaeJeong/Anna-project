package main;

import cls.NameCard;
import cls.PrintNameCard;
import cls.PrintNamePhoneCard;

public class MainClass {
	public static void main(String[] args) {
		
		NameCard namecard = new NameCard("ȫ�浿", "123-4567", "hgd@naver.com");
		
		PrintNameCard pnc = new PrintNameCard();
		namecard.setPrintNameCard( pnc );
		namecard.print();
		
		PrintNamePhoneCard pnpc = new PrintNamePhoneCard();
		namecard.setPrintNamePhoneCard( pnpc );
		namecard.printPhone();
		
	}
}
