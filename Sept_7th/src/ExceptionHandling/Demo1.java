package ExceptionHandling;

public class Demo1 {

	public static void main(String[] args) {
		//Exceptions
		//1.CHECKED eXCEPTION- these are occured during compilation
		//2.Unchecked exception-  these are occured during run time
		// keywords = try,catch,throw,throws,finally
		System.out.println("Excecution Started");
		
		try {
		int a =10;
		int b= 0;
		int c = a/b;
		System.out.println(c);
		} 
		
		
		catch(ArithmeticException e) {
			
			System.out.println("Error : Division by zero is not allowed");
			
		}
		
		
		
		
		System.out.println("Execution Ended");
		
	}

}
