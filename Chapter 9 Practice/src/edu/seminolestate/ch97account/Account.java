package edu.seminolestate.ch97account;

public class Account {


	int id = 0;
	static int numberOfIds = 0;
	double balance = 0;
	static double annualInterestRate = 0;
	java.util.Date dateCreated;
	
	public Account() {
		id++;
		numberOfIds++;
		dateCreated = new java.util.Date();
	}
	
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		dateCreated = new java.util.Date();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public static void setAnnualInterestRate(double annualInterestRate) {
		Account.annualInterestRate = annualInterestRate;
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	public static double getMonthlyInterestRate() {
		return annualInterestRate/12;
	}
	
	public double getMonthlyinterest() {
		return balance * (getMonthlyInterestRate()/100);
	}
	
	public void withdraw (double withdraw) {
		balance = balance - Math.abs(withdraw);
	}

	public void deposit(double deposit) {
		balance = balance + deposit;
	}
	
	public static void main(String[] args) {
		Account acct = new Account(1122,2000);
		System.out.println("ID: " + acct.getId() + " balance: " + acct.getBalance());
		Account.setAnnualInterestRate(4.5);
		acct.withdraw(-2500);
		System.out.println("balance: " + acct.getBalance());
		acct.deposit(3000);
		System.out.println("balance: " + acct.getBalance());		
		System.out.println("ID: " + acct.getId() + " balance: " + acct.balance + " monthly interest: " + Account.getMonthlyInterestRate() + " date created: " + acct.getDateCreated());
	}
	
	
}
