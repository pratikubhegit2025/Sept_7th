package Interfaces;

public interface RBIBANK {
	
	int mainbalence=20000;
	static int reducedbalence =100;
	final int addFund=2000;
	
	void debitCard();
	void creditCard();
	void TransferMoney();
	void loan();
	

}
