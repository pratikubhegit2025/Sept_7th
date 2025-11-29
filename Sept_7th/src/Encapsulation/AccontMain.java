package Encapsulation;

public class AccontMain {

	public static void main(String[] args) {
		
		AccointNo acc = new AccointNo();
		
		acc.setAccNo(1000);
		acc.setName("Pratik");
		acc.setAmount(4123.254);
		
		
		System.out.println(acc.getAccNo());
		System.out.println(acc.getName());
		System.out.println(acc.getAmount());
		
	}

}
