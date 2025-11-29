package ExceptionHandling;

public class Demo3 {

	public static void main(String[] args) {
	 String name ="Pune";//0,1,2,3
	 System.out.println(name.charAt(1));
	 try {
	 System.out.println(name.charAt(5));
	 }
	 catch (StringIndexOutOfBoundsException e) {
		 
		 
		 System.out.println("Invalid string index");
	 }
	 
	 System.out.println(name.charAt(2));
	}

}
