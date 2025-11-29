package array;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		//int arr=12;
		int arr1 []= {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};
		//System.out.println(arr);
//		System.out.println(arr1[2]);
//		System.out.println(arr1[1]);
//		System.out.println(arr1[3]);
//		
//	for(int i=0 ;i<arr1.length;i++) {
//			
//			System.out.println(arr1[i]);
//			
//		}
		
		
		for( int num:arr1) {	
			System.out.println(num);
		}
		
		
		
		
		
		
		
		
		
		//fixed size array
		
		
		int[] arr3 = new int[6]; //5,6,7,8,9
		arr3[0]=5;
		arr3[1]=6;
		arr3[2]=7;
		arr3[3]=8;
		arr3[4]=9;
		arr3[5]=10;
		
		System.out.println(arr3[5]);
		
		
	
		int a = arr1.length;
		 System.out.println("Size of arr1"+ a);
		 
		 
		 
		 
		 
		
		
		
		
		
		

	}

}
