package array;

public class Demo6 {

	public static void main(String[] args) {
		Object Obj [][] = new Object[3][3];
		
		Obj[0][0]='A';
		Obj[0][1]='B';
		Obj[0][2]='C';
		
		Obj[1][0]='D';
		Obj[1][1]='E';
		Obj[1][2]='F';
				
		Obj[2][0]='G';
		Obj[2][1]='H';
		Obj[2][2]='I';
		
		for(int row=0;row<Obj.length;row++) {
			 for(int col=0;col<=Obj[2].length-1;col++)
			 {
				 
				 System.out.println(Obj[row][col]+" ");
			 }
			
			System.out.println();
			
	
		}
		
		

	}

}
