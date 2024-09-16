package bank;

public class Bank {
	private double balance;
	
	Bank(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void checkBalance() {
		System.out.println("Your current balance is R$ " + getBalance());
	}
	
	public void receiveValue(double value) {
		if (value > 0) 
			balance += value;
		else
			System.out.println("Invalid operation");
		System.out.println("Balance updated R$ " + balance);
	}
	
	public void transferValue(double value) {
		if (value > 0 && value <= balance) 
			balance -= value;
		else
			System.out.println("Invalid operation");
		System.out.println("Balance updated R$ " + balance);
	}
}
