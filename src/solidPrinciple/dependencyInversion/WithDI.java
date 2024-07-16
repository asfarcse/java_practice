package solidPrinciple.dependencyInversion;

interface BankCard {
	void doTransaction(long amount);
}

class CreditCardd implements BankCard {

	@Override
	public void doTransaction(long amount) {
		System.out.println("payment using credit cardd...");
	}
	
}

class DebitCardd implements BankCard {

	@Override
	public void doTransaction(long amount) {
		System.out.println("payment using debit cardd...");
	}
	
}

public class WithDI {
	
	private BankCard bankCard;

	public WithDI(BankCard bankCard) {
		this.bankCard = bankCard;
	}
	
	public void doPurchaseSomething(long amount) {
		bankCard.doTransaction(amount);
	}
	
	public static void main(String[] args) {
		
		BankCard bankCardCredit = new CreditCardd();
		bankCardCredit.doTransaction(5000);
		
		BankCard bankCardDebit = new DebitCardd();
		bankCardDebit.doTransaction(5000);
		
	}
	
}
