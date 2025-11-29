package Abstraction;

public class HDFC extends RBIBANK {
	
	public static void main(String[] args) {
		
		RBIBANK bank = new HDFC();
		bank.creditCard();
		bank.debitCard();
		}
	
	
	
	@Override
	public void creditCard() {
		System.out.println("HDFC Credit Card");
		
	}

	@Override
	public void debitCard() {
		System.out.println("HDFC Debit Card");
		
	}

}
