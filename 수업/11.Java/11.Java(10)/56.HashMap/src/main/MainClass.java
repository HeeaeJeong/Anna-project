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
			ArrayList : 검색, 대입
			
			LinkedList : 실시간 추가/삭제 처리가 빠르다
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
			Map : 	사전
				HashMap
						key:value -> 한쌍(pair)
						"사과":"apple"
						key값으로 관리한다.
						key값은 중복을 사용할 수 없다
						Tree 구조
				
				TreeMap		
						HashMap + sorting		
		*/
		
	//	HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		Map<Integer, String> hMap = new HashMap<Integer, String>();
	
		// 추가
		hMap.put(111, "백십일");
		hMap.put(222, "이백이십이");
		hMap.put(333, "삼백삼십삼");
		
		String value = hMap.get(333);
		System.out.println(value);
		
		// iterator : 반복자(주소) -> 포인터
		Iterator<Integer> it = hMap.keySet().iterator();
		
		while(it.hasNext()) {
			Integer k = it.next();
			System.out.println(k);
			
			String v = hMap.get(k);
			System.out.println(v);
		}
				
		// 삭제
		value = hMap.remove(222);
		System.out.println("삭제된 데이터:"+ value);
		
		it = hMap.keySet().iterator();
		while(it.hasNext()) {
			String v = hMap.get(it.next());
			System.out.println(v);
		}
		
		System.out.println(hMap.size());
		
		// 검색(= key으로만 검색)
		boolean b = hMap.containsKey(111);
		if(b == true) {
			String v = hMap.get(333);
			System.out.println(v);
		}
		// 수정
		hMap.replace(111, "백 + 십 + 일");
		System.out.println(hMap.get(111));
		
		hMap.put(111, "100 + 10 +1");
		System.out.println(hMap.get(111));
		
		
		//Tree Map
		//Sorting -> key값으로 함.
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("pear", "배");
		map.put("apple", "사과");
		map.put("grape", "포도");
		map.put("banana", "바나나");
		map.put("orange", "오렌지");
		
		Iterator<String> it1 = map.keySet().iterator();
		while(it1.hasNext()) {
			String k = it1.next();
			String v = map.get(k);
			System.out.println("key:"+ k + "value:"+ v);
			
		}
		System.out.println();
		
		//TreeMap
		//오름차순으로 변함->iterator로 변경하니 sorting됨
		
		TreeMap<String, String> tmap = new TreeMap<String, String>(map);
		//오름
		//Iterator<String> it2 = tmap.keySet().iterator();
		
		//내림차순으로 변함->iterator로 변경하니 sorting됨
		//내림
		Iterator<String> it2 = tmap.descendingKeySet().iterator();
		while(it2.hasNext()) {
			String k = it2.next();
			String v = tmap.get(k);
			System.out.println("key:"+ k + "value:"+ v);
			
		}

	}
}







