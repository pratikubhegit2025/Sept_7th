package Logical;

public class prime {

	public static void main(String[] args) {
		int a =29;// 2,3,7/19/11/29/13/17/23
		boolean isprime=true;
		
		if(a <=0 ) isprime=false;
		
		
		for(int i=2; i<=Math.sqrt(a);i++ )
		{
		
			if(a% i==0)
				
				
			{
				
				isprime=false;
				break;
				
				
			}
			
			
			
		}
		System.out.println(isprime?"Prime":"not prime");
	}

}
