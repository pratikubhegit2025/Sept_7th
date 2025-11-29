package methods;

public class ReturnTypeMethods {
	
    public double calculateDiscount(int price, float percent) {
        return price - (price * percent / 100);
    }

    public static void main(String[] args) {
    	ReturnTypeMethods obj = new ReturnTypeMethods();
        double finalPrice = obj.calculateDiscount(1000, 10); // returns 900
        System.out.println("Final Price after discount: " + finalPrice);
        
        
        ReturnTypeMethods obj2 = new ReturnTypeMethods();
        int mul = obj2.abc(100, 100);
        System.out.println(mul);
        
        
        //===============================================
        
        
        ReturnTypeMethods obj1 = new ReturnTypeMethods();
        obj.confirmOrder(101);  // no return, just prints
       
    }
    
  
    // method with void return type
    public void confirmOrder(int orderId) {
        System.out.println("Order " + orderId + " confirmed successfully!");
        // return "Success"; ❌ ERROR - cannot return a value from void method
    }
    
    public int abc(int a, int b) {
		return a*b;
    	
    	
    	
    	
    	
    	
    	
    	
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}



