package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import dto.MyClass;
import dto.YouClass;

public class MainClass {
	public static void main(String[] args) {
		/*
		 * Collection : ����
		 * 
		 * List : ���
		 * 		  ArrayList
		 * 			�迭ó�� ����� �� �ִ� ���
		 * 			��������  0-0-0-0-0-0-0
		 * 			�˻� �ӵ��� ����ϴ�.
		 * 
		 * 		  LinkedList
		 * 			�߰�/������ ����.- ���ӿ��� ���̾���.
		
		 * */
/*		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		//	List<Integer> arrList = new ArrayList<Integer>();
		
		//�߰�
		arrList.add(111);  //[0]
		
		Integer in = new Integer(222);  //[1]
		arrList.add(in);
		
		arrList.add(new Integer(333));  //[2]
		
		int len = arrList.size();
		System.out.println("list�� ũ��:"+ len);
		
		System.out.println(arrList.get(0)); // 0��°�� 111��µ�.
		
		for(int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		
		for (Integer num : arrList) { //���� �ڵ�� ���� �ڵ尡 �ݺ� ����� ��.
			System.out.println(num);
		}
		
		//���ϴ� ��ġ�� �߰�
		arrList.add(1, 200); //1��°�� 200�� �־�� ��� ��ȣ.
		
		for(int i = 0; i < arrList.size(); i++) {//for�� ������ �ڵ������� �и�.(����� �����ϰ� ����)
			System.out.println(arrList.get(i));
		}
		
		//����
		Integer num = arrList.remove(2);
		System.out.println("������ ������:" + num);
		for (Integer n : arrList) {
			System.out.println(n);
		}
		System.out.println("list�� ũ��:" + arrList.size());
		
		//�˻� - �߿���.
		int index = arrList.indexOf(333);
		System.out.println(index);
		
		index = -1;
		for(int i = 0; i < arrList.size(); i++) {
			Integer val = arrList.get(i);
			if(val == 200) {
				index = i;
				break;
			}
		}
		System.out.println(index);
		
		//����
		Integer newValue = new Integer(100);// 111�� 100���� ����
		arrList.set(0, newValue);
		
		for (Integer n : arrList) { 
			System.out.println(n);
		}
		
*/		
		//ArrayList<String> slist
		//�߰�
		//����
		//�˻�
		//����
		
		List<MyClass> list = new ArrayList<MyClass>();
		
		// �߰� - 3��
		MyClass cls = new MyClass(1, "ȫ�浿", 171.1); //��� 1
		list.add(cls);
		
		cls = new MyClass(2, "������", 161.3); //��� 2
		list.add(cls);
		
		list.add(new MyClass(3, "ȫ�β�", 183.2)); //��� 3
		
		for (int i = 0; i < list.size(); i++) {
			MyClass my = list.get(i);
		//System.out.println(my.toString());
			my.toString();
		}		
/*		
		cls = new MyClass(4, "������", 178.5);
		list.add(2, cls);
		
		for (MyClass my : list) {
			my.toString();
		}
		*/
/*				
		// ���� - 1��
		MyClass removeDto = list.remove(3);
		removeDto.toString();
		
		for (MyClass my : list) {
			my.toString();
		}
		System.out.println();
		
		// �˻� - 1��
		String name = "������";
		
		int findIndex = -1;
		for (int i = 0; i < list.size(); i++) {
			MyClass my = list.get(i);
			if(name.equals(my.getName())) {
				findIndex = i;
				break;
			}
		}		
		list.get(findIndex).toString();
				
		// ���� - 1��
		MyClass obj = list.get(0);
		obj.setHeight(182.3);
		
		for (MyClass my : list) {
			my.toString();
		}
		
		MyClass mcls = new MyClass(5, "������", 169.5);		
		list.set(2, mcls);
		
		for (MyClass my : list) {
			my.toString();
		}
		
		
		List<Object> allObjlist = new ArrayList<Object>();
		allObjlist.add(new YouClass());
		allObjlist.add(new MyClass());
		*/
	}
	

}
