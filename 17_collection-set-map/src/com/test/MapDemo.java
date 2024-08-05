package com.test;
import java.util.Map;
import java.util.Map.Entry;
import java.util.*;

public class MapDemo {
	public static void main(String[] args) {
		System.out.println("Hash Map");
		Map<String,Integer> map = new HashMap<>();
		map.put("A", 100);
//		map.put("A",101);
		map.put("B", 100);
		map.put(null, 100);
		map.put("C", 102);
		
		System.out.println(map);
		
		map.putIfAbsent("A"	, 106);
		
		System.out.println(map);
		
		System.out.println("Map 1 by 1 reading");
		
		Set<Entry<String,Integer>> entries = map.entrySet();
		
		for(Entry<String,Integer> entry : entries)
			System.out.println(entry.getKey() + "-" + entry.getValue());
//			System.out.println(entry);
			
		
		
		System.out.println("LinkedHash Map");
		
		LinkedHashMap<String,Integer> map1 = new LinkedHashMap<>();
		
		map1.put("A", 100);
//		map.put("A",101);
		map1.put("B", 100);
		map1.put(null, 100);
		map1.put("C", 102);
		
		System.out.println(map1);
		
		map1.putIfAbsent("A", 106);
		
		System.out.println(map1);
		
		
		System.out.println("TreeMap");
		
		TreeMap<String,Integer> map2 =new TreeMap<>();
		
		map2.put("A", 100);
//		map2.put("A",101);
		map2.put("B", 100);
//		map2.put(null, 100);
		map2.put("C", 102);
		
		System.out.println(map2);
		
		map2.putIfAbsent("A", 106);
		
		System.out.println(map2);
		
		
	}

}
