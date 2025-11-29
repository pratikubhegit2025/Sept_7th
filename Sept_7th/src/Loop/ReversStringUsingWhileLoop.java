package Loop;

public class ReversStringUsingWhileLoop {

	public static void main(String[] args) {
		
		String word= "INDIAISCOUNTRY";
		String revers = "";
		
		
		int i = word.length()-1;
		
		
		while(i>=0) {
			
			
			revers += word.charAt(i);
			i--;
			
		}
		 System.out.println(revers);
		
		
		
		

	}

}
