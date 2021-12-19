package dao;

import java.util.Scanner;

import dto.StudentDto;

//�������� ����, ����
public class StudentDao {
	Scanner sc = new Scanner(System.in);

	private StudentDto student[] = new StudentDto[20];	// ���� 20��	[0 ~ 2] -> [3 ~ 19] = null
	private int count;
	
	public StudentDao() {		
		count = 0;
				
		student[0] = new StudentDto(1001, "ȫ�浿", 171.1, 90, 85);
		student[1] = new StudentDto(1002, "������", 165.3, 100, 90);
		student[2] = new StudentDto(1003, "������", 182.6, 80, 95);
		
		count = 3;
	}
	
	// CRUD
	public void insert() {	// �߰�
		System.out.print("��ȣ = ");
		int number = sc.nextInt();
		
		System.out.print("�̸� = ");
		String name = sc.next();
		
		System.out.print("���� = ");
		double height = sc.nextDouble();
		
		System.out.print("���� = ");
		int eng = sc.nextInt();
		
		System.out.print("���� = ");
		int math = sc.nextInt();
		
		student[count] = new StudentDto(number, name, height, eng, math);
		count++;		
	}
	public void delete() {	// ����
		System.out.print("������ �л��� = ");		
		String name = sc.next();
		
		int index = search(name);
		
		if(index == -1) {
			System.out.println("�����͸� ã�� �� �����ϴ�");
		}
		else {
			/*
			student[index].setNumber(0);
			student[index].setName("");
			student[index].setHeight(0.0);
			student[index].setEng(0);
			student[index].setMath(0);
			*/
			System.out.println(student[index].getName() + "�� �����͸� �����Ͽ����ϴ�");
			student[index].remove();			
		}		
		
	}
	public void select() {	// �˻��� �Ŀ� ���
		System.out.print("�˻��� �л��� = ");
		String name = sc.next();
		
		// ã��
		/*
		int index = -1;
		for (int i = 0; i < student.length; i++) {
			StudentDto dto = student[i];
			if(dto != null && !dto.getName().equals("")) {
				if(dto.getName().equals(name)) {
					index = i;
					break;
				}
			}
		}*/
		int index = search(name);
		
		// ���
		if(index == -1) {
			System.out.println("�����͸� ã�� �� �����ϴ�");
		}else {
			StudentDto dto = student[index];
			System.out.println(dto.toString());
		}		
	}
	
	public void update() {	// ����
		System.out.print("������ �л��� = ");		
		String name = sc.next();
		
		int index = search(name);
		
		if(index == -1) {
			System.out.println("�����͸� ã�� �� �����ϴ�");
		}
		else {
			System.out.print("���� ���� = ");
			int eng = sc.nextInt();
			
			System.out.print("���� ���� = ");
			int math = sc.nextInt();
			
			student[index].setEng(eng);
			student[index].setMath(math);
			System.out.println("�����͸� �����Ͽ����ϴ�");
		}
	}
	
	public int search(String name) {
		int index = -1;
		for (int i = 0; i < student.length; i++) {
			StudentDto dto = student[i];
			if(dto != null && !dto.getName().equals("")) {
				if(dto.getName().equals(name)) {
					index = i;
					break;
				}
			}
		}
		
		return index;
	}
	
	public void alldata() {
		for (int i = 0; i < student.length; i++) {
			StudentDto dto = student[i];
			if(dto != null && !dto.getName().equals("")) {
				System.out.println(dto.toString());
			}
		}
	}
	
}







