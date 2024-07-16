package solidPrinciple.dependencyInversion;

class DebitCard {
	public void doTransaction(long amount) {
		System.out.println("payment using debit card...");
	}
}

class CreditCard {
	public void doTransaction(long amount) {
		System.out.println("payment using credit card...");
	}
}

public class WithoutDI {
	
	private DebitCard debitCard;

	public WithoutDI(DebitCard debitCard) {
		this.debitCard = debitCard;
	}
	
	public void purchaseSomething(long amount) {
		debitCard.doTransaction(amount);
	}
	
	public static void main(String[] args) {
		/**tightly couples with debit card or credit card*/
		WithoutDI obj = new WithoutDI(new DebitCard());
		obj.purchaseSomething(5000);
	}
	
}
