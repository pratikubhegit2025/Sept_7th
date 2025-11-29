package String;

public class demo1 {
    
	
	
	String A= "abc"; // global, class level, instance 
	
	
	public static void main(String[] args) {
		
		
		
		String A="Automation";
		
		String ab = new String ("ABC"); // decleration 
		 System.out.println(A); // print statement 
		System.out.println(ab);
		
		
		
		String S1= "Pune";
		String S2 = "Mumbai";
		String S3 = new String ("Pune");
		String S4 = new String ("Mumbai");// get
		
		
		System.out.println(S1.equals(S4)); // false
		System.out.println(S1.equals(S3)); // true // concate operation using string class 
		
		
		
		System.out.println(S1==S4); 
		
		
		String S5= "Hello"; 
		String S6 ="World"; // Helloworld //
		
		System.out.println(S5+S6);
		
	System.out.println(	S6.concat(S5).concat(S1).concat(S2));
		
		
	}

}
