package javaFeaureVersionWise.java9;

interface Bank {
	double getBalance();

	void deposit(double amount);

	void withdraw(double amount);

	default void executeTxn(String type, double amount) {
		if (type.equalsIgnoreCase("deposit")) {
			deposit(amount);
			logTxn(type, amount);
		} else if (type.equalsIgnoreCase("withdraw") && checkSufficientBalance(amount)) {
			withdraw(amount);
			logTxn(type, amount);
		} else {
			System.out.println("Txn Failed...Insufficent Balance");
		}
	}

	private void logTxn(String type, double amount) {
		System.out.println("Txn Type:::" + type);
		System.out.println("Amount:::" + amount);
		System.out.println("Current Balance:::" + getBalance());
		System.out.println("*************************************");
	}
	
	private boolean checkSufficientBalance(double amount) {
		return getBalance() >=amount;
	}
}

class SavingAccount implements Bank {

	private double balance;

	public SavingAccount(double balance) {
		this.balance = balance;
	}

	@Override
	public double getBalance() {
		return this.balance;
	}

	@Override
	public void deposit(double amount) {
		this.balance += amount;
		System.out.println("Total balance:::" + this.balance);
	}

	@Override
	public void withdraw(double amount) {
		this.balance -= amount;

	}

}

public class PrivateMethodInInterface {
	public static void main(String[] args) {
		Bank bank = new SavingAccount(1000);
		bank.executeTxn("deposit", 100);
		bank.executeTxn("withdraw", 4000);

	}
}
