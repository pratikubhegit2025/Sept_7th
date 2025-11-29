package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Set {

	public static void main(String[] args) {
		
		//set= 1. Duplicates are not allowed
		//2. single null value is allowed
		//3 order of instertion is not maintained 
		
	
		HashSet<String> set = new HashSet();
		set.add("Java");
		set.add("C++");
		set.add("Python");
		set.add("Java");
		set.add(null);
		set.add(null);
		
		System.out.println("======================Using for each loop==============");
		for(String s:set) {
			
			System.out.println(s);
		}
		System.out.println("======================Using for Iterator==============");
		
		Iterator<String> s1 = set.iterator();
		
	while(s1.hasNext()) {
		
		System.out.println(s1.next());
	}
	

	ArrayList ary = new ArrayList(set);
	
	System.out.println(ary);
	
	
	
	
	
	
	}

}
