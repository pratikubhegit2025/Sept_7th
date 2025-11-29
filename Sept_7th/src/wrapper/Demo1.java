package wrapper;

public class Demo1 {

	public static void main(String[] args) {
		
		
		
		
		
		
		String a= "42 matching Health Insurance Plans";
		String b= "42";
		int c = Integer.parseInt(b);
		System.out.println(c);
		
		
		
		//widening
	int d=42;
	double e = d;
	System.out.println(e);
		
		// narrowing
	
	
	double price= 99.99;
	short newprice= (short) price;
	System.out.println(newprice);
	
	
	
	String cost="444.99";
	double newcost= Double.parseDouble(cost);
	System.out.println(newcost);
	int nc= (int) newcost;
	System.out.println(nc);
	
	
	
	
	
		
	}

}
