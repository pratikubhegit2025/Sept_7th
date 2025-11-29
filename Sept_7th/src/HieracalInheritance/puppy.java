package HieracalInheritance;

public class puppy extends dog {

	
	public void weeep() 
	{
		
		System.out.println("weeping");
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		
		dog b = new dog();
		b.eating();
		b.bark();
		puppy p = new puppy();
		
		p.weeep();
		
		
	}
}
