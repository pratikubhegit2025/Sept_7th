package Logical;

public class reversString {

	public static void main(String[] args) {
		String a= "Automation";//9
		String rev="";
		
		int i = a.length()-1;
		
		while(i>=0) {
			
			
			rev +=a.charAt(i);
			i--;
			
		}
		
		System.out.println(rev);

	}

}
