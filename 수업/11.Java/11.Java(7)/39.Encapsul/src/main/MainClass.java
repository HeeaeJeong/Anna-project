package main;

import dto.MemberDto;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String Member[][] = {
				{ "ȫ�浿", "24", "123-4567", "�����", "��â" },
				{ "������", "19", "234-5678", "������", "����ģ"},
				{ "������", "22", "345-6789", "��õ��", "����" },
		};

		// ���̸� 3�� �غ�
		MemberDto member[] = new MemberDto[3];	// MemberDto member1, member2, member3;
		
		// ������ �� �ֵ��� �غ�
		for (int i = 0; i < member.length; i++) {
			member[i] = new MemberDto();
		}
		
		// �߰� == ����
		member[0].setName("ȫ�浿");
		member[0].setAge(24);
		member[0].setPhone("123-4567");
		member[0].setAddress("�����");
		member[0].setContent("��â");
		
		// �о���δ�
		System.out.println(member[0].getName());
		System.out.println(member[0].getAge());
		System.out.println(member[0].getPhone());
		System.out.println(member[0].getAddress());
		System.out.println(member[0].getContent());
		
		
		MemberDto dto = new MemberDto();
		dto.setName("ȫ�β�");
		dto.getName();
	}

}
