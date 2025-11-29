package ExceptionHandling;

public class Demo2 {

	public static void main(String[] args) {
		int [] number= {10,20,30};//0,1,2
		System.out.println("code started");
		
		//3
		try {
		System.out.println(number[3]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Invalid index");
	
		}
		
		System.out.println("code ended");

	}

}
