package rlowry3.design.patterns.creational.factory;

public class AccountFactoryMain {

	public static void main(String[] args) {
		
		AccountFactory factory = new AccountFactory();
		
		Account savingAccount = factory.getAccount("SAVING");
		savingAccount.accountType();
		
		Account checkingAccount = factory.getAccount("CHECKING");
		checkingAccount.accountType();
		

	}

}
