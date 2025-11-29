package ScannerClass;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("Enter Name");
		 String name = sc.nextLine();
		System.out.println("Enter age");
		 int age = sc.nextInt();
		 
		 System.out.println("Enter Salary");
		 double salary = sc.nextDouble();
		
		
		System.out.println("Age : "+ age); // your age: 28
		System.out.println("Name : "+ name);
		System.out.println("Salary : "+ salary);
		 
		
		
		
		
		
		
	}

}
