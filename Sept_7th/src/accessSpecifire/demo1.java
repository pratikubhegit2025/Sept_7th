package accessSpecifire;

public class demo1 {

	//same class
    public String publicVar = "Public Variable";
    private String privateVar = "Private Variable";
    protected String protectedVar = "Protected Variable";
    String defaultVar = "Default Variable"; // no keyword
	
	public static void main(String[] args) {
		demo1 d =new demo1();
		d.callingVariables();
		
		
		
			
	}
	 public void callingVariables() {
	        System.out.println(publicVar);
	        System.out.println(privateVar);
	        System.out.println(protectedVar);
	        System.out.println(defaultVar);

	 }
	
	public class demo2{
		
	    protected String protectedVar1 = "Protected Variable";
		
	}

}
