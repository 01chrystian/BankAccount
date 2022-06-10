package entities;

public class Account {
	private int accountNumber;
	public String cardHolderName;
	private double balance;

	public Account() {
	}

	public Account(int accountNumber, String cardHolderName) {
		this.accountNumber = accountNumber;
		this.cardHolderName = cardHolderName;

	}

	public Account(int accountNumber, String cardHolderName, double balance) {
		this.accountNumber = accountNumber;
		this.cardHolderName = cardHolderName;
		this.balance = balance;
	}

	public String Print() {
		return "Account data: \n" + "Account " + accountNumber + ", " + "Holder: " + cardHolderName + ", "
				+ "Balance: $ " + String.format("%.2f", balance)+"\n";
	}
	public String Print1() {
		return "Update data: \n" + "Account " + accountNumber + ", " + "Holder: " + cardHolderName + ", "
				+ "Balance: $ " + String.format("%.2f", balance)+"\n";
	}

	public int getaccountNumber() {
		return accountNumber;
	}

	public void setcardHolder(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public String getcardHolder() {
		return cardHolderName;
	}

	public void setAddBalance(double addBalance) {
		balance += addBalance;
	}

	public double getRemoveBalance(double removeDeposit) {
		return balance = (balance - removeDeposit) - 5;
	}
}
