package Interfaces;

public class BOM implements BrazilBank, RBIBANK,USBANK{

	public static void main(String[] args) {
		
		BOM b = new BOM();
		b.bikeloan();
		b.carloan();
		b.creditCard();
		b.debitCard();
		b.homeloan();
		b.loan();
		b.TransferMoney();
		b.mutualFund();
	}

	@Override
	public void mutualFund() {

 System.out.println("BOM - Mutual Fund");
	}

	@Override
	public void homeloan() {
		
		 System.out.println("BOM - Home Loan");
	}

	@Override
	public void debitCard() {
		// TODO Auto-generated method stub
		 System.out.println("BOM -Debit card");
	}

	@Override
	public void creditCard() {
		// TODO Auto-generated method stub
		 System.out.println("BOM - Credit card");
	}

	@Override
	public void TransferMoney() {
		 System.out.println("BOM - Transfer money");
		
	}

	@Override
	public void loan() {
		 System.out.println("BOM - loan");
	}

	@Override
	public void bikeloan() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void carloan() {
		 System.out.println("BOM - carLoan");
	}

}
