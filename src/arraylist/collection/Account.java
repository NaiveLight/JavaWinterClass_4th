package arraylist.collection;

public class Account {
	
	private String accountNumber;
	private String accountName;
	private double balance;
	
	public Account(String accountNumber, String accountName, double balance){
		this.accountNumber = accountNumber;
		this.accountName = accountName;		
		this.balance = balance;
	}
	
	public void deposite(int money){
		
		if (money <= 0){
			System.out.println("not enough money");
			return;
		}		
		balance += money;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String toString(){
		return accountName + "´ÔÀÇ °èÁÂ¹øÈ£´Â " + accountNumber + "ÀÌ¸ç, ³²Àº µ·Àº " + balance + "ÀÔ´Ï´Ù.";	
	}
	
}
