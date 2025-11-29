package ExceptionHandling;

public class Demo6 {

	public static void main(String[] args) {
		   
		
		
		try {
			
			int a = 10/2;
			System.out.println("Code Started");
	
		}
		catch (ArithmeticException e) {
			
			System.out.println("Invalid operation");
		}
		
		finally {
		System.out.println("Code Ended");
		}
		
		
		
		
		// final- Keyword, modifire - use To used to restrict varial,method,class
		// Finally - Keyword - block - used in exception handling, always execute in any conditions
		 
		
	}

}
