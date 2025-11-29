package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class List {

	public static void main(String[] args) {
		// Collections = Collection is a group of objects
		// List -ex.class room - ArrayList, LinkedList, vector// 
		//Set- HashSet,LinkedHashset,Treeset
		//Map- HashMAp,linkedhashmap treemap
	
		//List
		//1. list is an interface
		//2. list is extended by collection interface
		//3. it is index based 
		//4. duplicates are allowed
		//5. size is not fixed 
		System.out.println("ReadingLIST");
		
		ArrayList cart = new ArrayList();//      {0,1,2,3,4,5}
		cart.add(null);
		cart.add(null);
		cart.add(null);
		cart.add("Java");
		cart.add('a');
		cart.add("123");
		cart.add("Java");
		cart.add("123");
		cart.add("Java");
		
		System.out.println("======================Using for each loop==============");
		for(Object c :cart) {
			
			System.out.println(c);
		}
		
		// USING ITERATOR
		
		//Iterator<Object> itr = cart.iterator();
		
		System.out.println("======================Using for iterator==============");
		
		Iterator itr = cart.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
			
		
	}

}
