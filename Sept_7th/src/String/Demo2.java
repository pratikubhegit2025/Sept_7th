package String;

public class Demo2 {

	public static void main(String[] args) {
		String A ="I Love My County"; //n-1
		String B ="";
		String C="I Love my County";
		
		System.out.println("=========================To Upper Case =======================");
		String S1 = A.toUpperCase();
		System.out.println(S1);
		
		
		System.out.println("=========================To Lower Case =======================");
		String S2 = A.toLowerCase();
		System.out.println(S2);
		
		System.out.println("=========================Length =======================");
		int S3 = A.length();
		System.out.println(S3);
		
		System.out.println("=========================EQUALS =======================");
        System.out.println(A.equals(B));//true
    
        System.out.println(B.equals(C));// false
    
        System.out.println("=========================EQUALSIGNOR =======================");
    System.out.println(A.equalsIgnoreCase(C));
    
    System.out.println("=========================CONTAINS =======================");

    System.out.println( A.contains("mm"));
    
    
    System.out.println("=========================isEmpty =======================");
    
   System.out.println( A.isEmpty());
   System.out.println( B.isEmpty());
     
   System.out.println("=========================CharAt =======================");
   System.out.println("Character at 5th index is = "+ A.charAt(5));
   
	 System.out.println("=========================EndsWith =======================");
   
   System.out.println( A.endsWith("ty"));
   System.out.println("=========================StartsWith =======================");
   System.out.println( A.startsWith("ty"));
   
   System.out.println("=========================Substring =======================");
  
   System.out.println(A.substring(1,4));
   System.out.println("=========================lASTINDEXOF =======================");
   
   System.out.println("=========================test123 =======================");
System.out.println(A.lastIndexOf("C"));
	}


	
	
	
	
}
