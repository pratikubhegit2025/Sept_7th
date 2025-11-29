package Loop;

public class ReversString {

	public static void main(String[] args) {
		//Automation
		//noitamotuA
		
		
		String orignalString = "Automation";//n-1
		String ReversString= "";
		
		
		for(int i=orignalString.length()-1; i>=0; i--) {
			
			ReversString += orignalString.charAt(i);
	
			
		}
		System.out.println("orignal String :" +orignalString);
		
		System.out.println("revers string :"+ ReversString);
		
		
	}

}
