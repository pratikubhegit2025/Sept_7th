package Polymorphism;

public class OverRidding extends animal {
	 @Override
	 void animal() {
		 System.out.println("Animal");
	 }
	
	
	
	
	public static void main(String[] args) {
		OverRidding a = new OverRidding();
		a.animal();
	}
	
	

}
