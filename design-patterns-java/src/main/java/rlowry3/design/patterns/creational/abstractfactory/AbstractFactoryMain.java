package rlowry3.design.patterns.creational.abstractfactory;

public class AbstractFactoryMain {

	public static void main(String[] args) {
		
		AbstractFactory bankFactory = new BankFactory();
		
		Bank abcBank = bankFactory.getBank("ABCBANK");
		abcBank.bankName();
		
		Bank xyzBank = bankFactory.getBank("XYZBANK");
		xyzBank.bankName();
		
				
		AbstractFactory accountFactory = new AccountFactory();
		
		Account savingAccount = accountFactory.getAccount("SAVING");
		savingAccount.accountType();
		
		Account checkingAccount = accountFactory.getAccount("CHECKING");
		checkingAccount.accountType();
		

	}

}
