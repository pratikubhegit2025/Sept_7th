package Abstraction;

public class Abstraction_Demo2 extends Abstraction_Demo1  {
	
@Override
	public void M3() {
	System.out.println("This Is Method M3");
	}
	 public void M4() {
		 System.out.println("This Is Method M4");
	 }
	 public void M5() {
		 System.out.println("This Is Method M5");
	 }
	 public void M6() {
		 System.out.println("This Is Method M6");
	 }
	
	
	public static void main(String[] args) {
		  
		Abstraction_Demo1 ab1 = new Abstraction_Demo2(); // dynamic binding \
		ab1.M1();
		ab1.M2();
		ab1.M3(); // concrete method
		ab1.M4();

		
		 Abstraction_Demo2 ab2 = new Abstraction_Demo2(); 
		 ab2.M1();
		 ab2.M3();
		 ab2.M4();
		
		
		
		
	}

}
