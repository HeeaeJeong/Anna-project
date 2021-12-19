package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dto.StudentDto;

//�������� ����, ����
public class StudentDao {
	Scanner sc = new Scanner(System.in);

//	private StudentDto student[] = new StudentDto[20];	// ���� 20��	[0 ~ 2] -> [3 ~ 19] = null
//	private int count;
	
	private List<StudentDto> stlist;
	
	public StudentDao() {	
		/*
		count = 0;
				
		student[0] = new StudentDto(1001, "ȫ�浿", 171.1, 90, 85);
		student[1] = new StudentDto(1002, "������", 165.3, 100, 90);
		student[2] = new StudentDto(1003, "������", 182.6, 80, 95);
		
		count = 3;
		*/
		stlist = new ArrayList<StudentDto>();
		
		stlist.add(new StudentDto(1001, "ȫ�浿", 171.1, 90, 85));
		stlist.add(new StudentDto(1002, "������", 165.3, 100, 90));
		stlist.add(new StudentDto(1003, "������", 182.6, 80, 95));
		
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
				
	//	student[count] = new StudentDto(number, name, height, eng, math);
	//	count++;
		
		stlist.add(new StudentDto(number, name, height, eng, math));
		
	}
	public void delete() {	// ����
		System.out.print("������ �л��� = ");		
		String name = sc.next();
		
		int index = search(name);
		
		if(index == -1) {
			System.out.println("�����͸� ã�� �� �����ϴ�");
		}
		else {			
		//	System.out.println(student[index].getName() + "�� �����͸� �����Ͽ����ϴ�");
		//	student[index].remove();
			
			StudentDto dto = stlist.remove(index);
			System.out.println(dto.getName() + "�� �����͸� �����Ͽ����ϴ�");
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
		//	StudentDto dto = student[index];
		//	System.out.println(dto.toString());
			
			StudentDto dto = stlist.get(index);
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
			
		//	student[index].setEng(eng);
		//	student[index].setMath(math);
			
			StudentDto dto = stlist.get(index);
			dto.setEng(eng);
			dto.setMath(math);			
			
			System.out.println("�����͸� �����Ͽ����ϴ�");
		}
	}
	
	public int search(String name) {
		int index = -1;
		/*
		for (int i = 0; i < student.length; i++) {
			StudentDto dto = student[i];
			if(dto != null && !dto.getName().equals("")) {
				if(dto.getName().equals(name)) {
					index = i;
					break;
				}
			}
		}
		*/
		for (int i = 0; i < stlist.size(); i++) {
			StudentDto dto = stlist.get(i);
			if(name.equals(dto.getName())) {
				index = i;
				break;
			}
		}
		
		return index;
	}
	
	public void alldata() {
		/*
		for (int i = 0; i < student.length; i++) {
			StudentDto dto = student[i];
			if(dto != null && !dto.getName().equals("")) {
				System.out.println(dto.toString());
			}
		}*/
		
		for (StudentDto s : stlist) {
			System.out.println(s.toString());
		}
		
	}
	
}











