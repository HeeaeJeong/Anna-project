package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class MainClass {
	public static void main(String[] args) {
		 /*
			ArrayList : �˻�, ����
			
			LinkedList : �ǽð� �߰�/���� ó���� ������
		*/	
		
		/*
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("Tigers");
		list.add(new String("Lions"));
		list.add("Giants");
		
		for (String s : list) {
			System.out.println(s);
		}
		
		list.addFirst("Bears");	//= list.add(0, "Bears");
		
		ArrayList<String> alist = new ArrayList<String>( list );
		
		for (String str : alist) {
			System.out.println(str);
		}		
		System.out.println(list.get(0));
		
		String ss = "twins";
		list.set(2, ss);
		
		for (String str : list) {
			System.out.println(str);
		}
		*/
		
		/*
			Map : 	����
				HashMap
						key:value -> �ѽ�(pair)
						"���":"apple"
						key������ �����Ѵ�.
						key���� �ߺ��� ����� �� ����
						Tree ����
				
				TreeMap		
						HashMap + sorting		
		*/
		
	//	HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		Map<Integer, String> hMap = new HashMap<Integer, String>();
	
		// �߰�
		hMap.put(111, "�����");
		hMap.put(222, "�̹��̽���");
		hMap.put(333, "����ʻ�");
		
		String value = hMap.get(333);
		System.out.println(value);
		
		// iterator : �ݺ���(�ּ�) -> ������
		Iterator<Integer> it = hMap.keySet().iterator();
		
		while(it.hasNext()) {
			Integer k = it.next();
			System.out.println(k);
			
			String v = hMap.get(k);
			System.out.println(v);
		}
				
		// ����
		value = hMap.remove(222);
		System.out.println("������ ������:"+ value);
		
		it = hMap.keySet().iterator();
		while(it.hasNext()) {
			String v = hMap.get(it.next());
			System.out.println(v);
		}
		
		System.out.println(hMap.size());
		
		// �˻�(= key���θ� �˻�)
		boolean b = hMap.containsKey(111);
		if(b == true) {
			String v = hMap.get(333);
			System.out.println(v);
		}
		// ����
		hMap.replace(111, "�� + �� + ��");
		System.out.println(hMap.get(111));
		
		hMap.put(111, "100 + 10 +1");
		System.out.println(hMap.get(111));
		
		
		//Tree Map
		//Sorting -> key������ ��.
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("pear", "��");
		map.put("apple", "���");
		map.put("grape", "����");
		map.put("banana", "�ٳ���");
		map.put("orange", "������");
		
		Iterator<String> it1 = map.keySet().iterator();
		while(it1.hasNext()) {
			String k = it1.next();
			String v = map.get(k);
			System.out.println("key:"+ k + "value:"+ v);
			
		}
		System.out.println();
		
		//TreeMap
		//������������ ����->iterator�� �����ϴ� sorting��
		
		TreeMap<String, String> tmap = new TreeMap<String, String>(map);
		//����
		//Iterator<String> it2 = tmap.keySet().iterator();
		
		//������������ ����->iterator�� �����ϴ� sorting��
		//����
		Iterator<String> it2 = tmap.descendingKeySet().iterator();
		while(it2.hasNext()) {
			String k = it2.next();
			String v = tmap.get(k);
			System.out.println("key:"+ k + "value:"+ v);
			
		}

	}
}







