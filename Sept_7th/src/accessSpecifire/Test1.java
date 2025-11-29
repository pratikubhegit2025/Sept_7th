package accessSpecifire;

public class Test1 {

	
	
	
	
}


class DebitCard {
    // PRIVATE → Only inside DebitCard
    private int pin = 1234;

    // DEFAULT → Only inside same package (bank system)
    String bankName = "ABC Bank";

    // PROTECTED → Accessible to subclasses (VisaCard, MasterCard)
    protected String cardType = "Rupay";

    // PUBLIC → Anyone can access (ATM, POS, etc.)
    public long cardNumber = 9876543210123456L;

    // private method
    private boolean validatePin(int enteredPin) {
        return pin == enteredPin;
    }
    
    
    public boolean withdrawMoney(int enteredPin, int amount) {
        if (validatePin(enteredPin)) {
            System.out.println("Transaction Approved. Withdrawn: " + amount);
            return true;
        } else {
            System.out.println(" Invalid PIN. Transaction Declined.");
            return false;
        }
    }
}


