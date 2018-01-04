package rlowry3.design.patterns.creational.factory;

public class AccountFactory {

	final String CHECKING_ACCOUNT = "CHECKING";
	final String SAVING_ACCCOUNT = "SAVING";

	public Account getAccount(String accountType) {

		if (CHECKING_ACCOUNT.equals(accountType)) {
			return new CheckingAccount();
		}
		if (SAVING_ACCCOUNT.equals(accountType)) {
			return new SavingAccount();
		}
		return null;
	}

}
