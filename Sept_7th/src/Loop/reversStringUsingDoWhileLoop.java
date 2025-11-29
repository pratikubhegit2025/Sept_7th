package Loop;

public class reversStringUsingDoWhileLoop {

	public static void main(String[] args) {
		String word= "INDIAISCOUNTRY";
	//	String a[]= {};
		String revers = "";
		int i = word.length()-1;
		
		
		do {
			
			revers += word.charAt(i);
			i--;
			
			
		}while(i>=0);
			
		 System.out.println(revers);
	}
	

}
