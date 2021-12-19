package main;

import java.util.Scanner;

import dao.StudentDao;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StudentDao dao = new StudentDao();		
		
		// menu
		while(true) {
			
			System.out.println("1.�л����� �߰�");
			System.out.println("2.�л����� ����");
			System.out.println("3.�л����� �˻�");
			System.out.println("4.�л����� ����");			
			System.out.println("5.�л����� ��� ���");
			System.out.println("6.����");			
			
			System.out.print("�޴���ȣ�� �Է� >>");
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
				case 1:
					dao.insert();
					break;
				case 2:
					dao.delete();
					break;
				case 3:
					dao.select();
					break;
				case 4:
					dao.update();
					break;
				case 5:
					dao.alldata();
					break;
				case 6:
					System.exit(0);
					break;					
			
			}			
		}
	}
}

