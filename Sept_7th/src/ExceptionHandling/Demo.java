package ExceptionHandling;

public class Demo {

	public static void main(String[] args) {
		String [] cart = {"watch", "mobile", "veggies"};
		try {
	System.out.println(cart[5]);
}
		catch(ArrayIndexOutOfBoundsException e) {
			
		System.out.println("invalid index");	
		}
		
		System.out.println(cart[1]);
	}
	

	}
