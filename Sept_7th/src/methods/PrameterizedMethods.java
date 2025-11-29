package methods;

public class PrameterizedMethods {

	public static void abc (int a, int b , double d) {
	
	}
	
	
	public static void main(String[] args) {

		abc(100, 10, 22.32); //arguments	
		
	PrameterizedMethods p= new PrameterizedMethods();
		
		p.greetCustomer("Flipkart");
				
	}
	
	
    // method with parameter
    public void greetCustomer(String name) {
        System.out.println("Welcome, " + name + " to our E-Commerce Store!");
    }
    
    
    
    

   
	
	
	
	
	
	
	
	
	
	

}
