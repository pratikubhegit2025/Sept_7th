package Logical;

public class Vowels {

	public static void main(String[] args) {
		// a e i o u
     String  word = "InDiA";// 3
    word= word.toLowerCase();
     int count = 0;
     
    		 for(int i =0; i  < word.length(); i++) {
    		 char ch = word.charAt(i);
    			 if (ch == 'a' || ch == 'e' || ch =='i' || ch =='o' || ch =='u') {
    			 System.out.println(ch);
    				 count++;
    			 }
    		 }
 
 System.out.println("total vowels : "+ count );	
		}

}
