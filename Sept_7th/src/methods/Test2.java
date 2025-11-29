package methods;

public class Test2 {
	
	
	public static void main(String[] args) {
		demo2(); // calling method from same class 
	    // 1. public- that can be accesible throughout the project 
		//2. Private- can be use in same class only
		// 3. Protected 4. Default 
		//demo100();
		
	    //1 variables
		//2. methods
		//3 classes
		
		demo1();
		demo1();
		
	Test3.demo12();

	}
	
	public static void demo1() {
		
		int a = 10;
		int b = 100;
		int sum= a+b;
		int mul= a*b;
		System.out.println(mul);
		System.out.println(sum);
		
		//System.out.println("This is static method 1");
		
	}
	
	
public static void demo2() {
		
		System.out.println("This is static method 2");
	
		
	}

private static void demo100() {
	
	System.out.println("This is static method 100");

	
}


}
