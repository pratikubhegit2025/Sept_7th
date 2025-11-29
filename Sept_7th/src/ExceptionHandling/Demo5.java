package ExceptionHandling;

public class Demo5 {

	public static void main(String[] args) {
		
		
		int age =15;
		
		
		
		if (age <18) {
			
			
			throw new ArithmeticException("Not eligible for vote");
		}
		
		else { // / by 0 
			
			System.out.println("Eligible for vote");
		}
			
		

	}

}
