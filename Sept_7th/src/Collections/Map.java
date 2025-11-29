package Collections;

import java.util.HashMap;

public class Map {

	public static void main(String[] args) {
		//1. Key and value
		//2 Keys should be unique and duplicate values are allowed
		
		
		
		//1- Mumabai
		//2 - Latur
		//3 -Mumbai

		java.util.Map<Integer, String> map = new HashMap();
		map.put(1,"Pune");
		map.put(2, "Mumbai");
		map.put(3, "Latur");
		map.put(4, "Nashik");
	System.out.println(map.size());
	System.out.println(map.keySet());
	System.out.println(map.values());
		 System.out.println( map.entrySet());
		
//		System.out.println(map.remove(1));
//		System.out.println( map.entrySet());
		
		for(int k :map.keySet()) {
			
			System.out.println(map.get(k));
			
		}
		
		
		
		
		
	}

}
