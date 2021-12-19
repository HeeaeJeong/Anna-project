package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dto.StudentDto;

//데이터의 접근, 관리
public class StudentDao {
	Scanner sc = new Scanner(System.in);

//	private StudentDto student[] = new StudentDto[20];	// 변수 20개	[0 ~ 2] -> [3 ~ 19] = null
//	private int count;
	
	private List<StudentDto> stlist;
	
	public StudentDao() {	
		/*
		count = 0;
				
		student[0] = new StudentDto(1001, "홍길동", 171.1, 90, 85);
		student[1] = new StudentDto(1002, "성춘향", 165.3, 100, 90);
		student[2] = new StudentDto(1003, "일지매", 182.6, 80, 95);
		
		count = 3;
		*/
		stlist = new ArrayList<StudentDto>();
		
		stlist.add(new StudentDto(1001, "홍길동", 171.1, 90, 85));
		stlist.add(new StudentDto(1002, "성춘향", 165.3, 100, 90));
		stlist.add(new StudentDto(1003, "일지매", 182.6, 80, 95));
		
	}
	
	// CRUD
	public void insert() {	// 추가
		System.out.print("번호 = ");
		int number = sc.nextInt();
		
		System.out.print("이름 = ");
		String name = sc.next();
		
		System.out.print("신장 = ");
		double height = sc.nextDouble();
		
		System.out.print("영어 = ");
		int eng = sc.nextInt();
		
		System.out.print("수학 = ");
		int math = sc.nextInt();
				
	//	student[count] = new StudentDto(number, name, height, eng, math);
	//	count++;
		
		stlist.add(new StudentDto(number, name, height, eng, math));
		
	}
	public void delete() {	// 삭제
		System.out.print("삭제할 학생명 = ");		
		String name = sc.next();
		
		int index = search(name);
		
		if(index == -1) {
			System.out.println("데이터를 찾을 수 없습니다");
		}
		else {			
		//	System.out.println(student[index].getName() + "의 데이터를 삭제하였습니다");
		//	student[index].remove();
			
			StudentDto dto = stlist.remove(index);
			System.out.println(dto.getName() + "의 데이터를 삭제하였습니다");
		}		
		
	}
	public void select() {	// 검색한 후에 출력
		System.out.print("검색할 학생명 = ");
		String name = sc.next();
		
		// 찾기
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
		
		// 출력
		if(index == -1) {
			System.out.println("데이터를 찾을 수 없습니다");
		}else {
		//	StudentDto dto = student[index];
		//	System.out.println(dto.toString());
			
			StudentDto dto = stlist.get(index);
			System.out.println(dto.toString());
		}		
	}
	
	public void update() {	// 수정
		System.out.print("수정할 학생명 = ");		
		String name = sc.next();
		
		int index = search(name);
		
		if(index == -1) {
			System.out.println("데이터를 찾을 수 없습니다");
		}
		else {
			System.out.print("영어 점수 = ");
			int eng = sc.nextInt();
			
			System.out.print("수학 점수 = ");
			int math = sc.nextInt();
			
		//	student[index].setEng(eng);
		//	student[index].setMath(math);
			
			StudentDto dto = stlist.get(index);
			dto.setEng(eng);
			dto.setMath(math);			
			
			System.out.println("데이터를 수정하였습니다");
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











