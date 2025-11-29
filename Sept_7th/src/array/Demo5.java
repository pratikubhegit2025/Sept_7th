package array;

public class Demo5 {

	public static void main(String[] args) {
		Object obj[] = new Object[7];// hetrogenius 
		
		obj[0]=10;
		obj[1]='q';
		obj[2]="Auto";
		obj[3]=22.33;
		obj[4]=12364478954547l;
		obj[5]=2222.333333d;
		obj[6]=129;
		
		for(Object o:obj) {
			System.out.println("value of object array "+o);
		}
		
		
		
		
	}

}
