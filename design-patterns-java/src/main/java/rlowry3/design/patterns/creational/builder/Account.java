package rlowry3.design.patterns.creational.builder;

public class Account {

	private final String accountName;
	private final Long accountNumber;
	private final String accountOwner;
	private double balance;
	private String accountType;

	private Account(AccountBuilder accountBuilder) {
		super();
		this.accountName = accountBuilder.accountName;
		this.accountNumber = accountBuilder.accountNumber;
		this.accountOwner = accountBuilder.accountOwner;
		this.balance = accountBuilder.balance;
		this.accountType = accountBuilder.accountType;

	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountName() {
		return accountName;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public String getAccountOwner() {
		return accountOwner;
	}

	public static class AccountBuilder {

		private final String accountName;
		private final Long accountNumber;
		private final String accountOwner;
		private double balance;
		private String accountType;

		public AccountBuilder(String accountName, Long accountNumber, String accountOwner) {
			super();
			this.accountName = accountName;
			this.accountNumber = accountNumber;
			this.accountOwner = accountOwner;
		}
		
		public AccountBuilder balance(double balance) {
			this.balance = balance;
			return this;
			
		}
		
		public AccountBuilder accountType(String accountType) {
			this.accountType = accountType;
			return this;
			
		}
		
		public Account build() {
			Account userAccount = new Account(this);
			return userAccount;
		}
		

	}

	@Override
	public String toString() {
		return "Account [accountName=" + accountName + ", accountNumber=" + accountNumber + ", accountOwner="
				+ accountOwner + ", balance=" + balance + ", accountType=" + accountType + "]";
	}
	
	

}
