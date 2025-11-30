package Logical;

public class removeWhiteSpaces {

	public static void main(String[] args) {
		String a = "Automation Testing";
		String b = "    Automation     "; // 9
		String c = "AUTO Mation";
        String result="";
		String e = b.trim();
		System.out.println(b.length());
		System.out.println(e);
		System.out.println(e.length());
		
		
		
		for(char as :a.toCharArray()) {
			if(as !=' ') {
				
				result+=as;
			}
			
			
		}
		System.out.println(result);
		
		
		
		
	}

}
