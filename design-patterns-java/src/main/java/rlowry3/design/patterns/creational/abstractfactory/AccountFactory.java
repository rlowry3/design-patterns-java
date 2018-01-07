package rlowry3.design.patterns.creational.abstractfactory;

public class AccountFactory extends AbstractFactory {

	final String CHECKING_ACCOUNT = "CHECKING";
	final String SAVING_ACCOUNT = "SAVING";

	@Override
	Bank getBank(String bankType) {

		return null;
	}

	@Override
	public Account getAccount(String accountType) {

		if (CHECKING_ACCOUNT.equals(accountType)) {
			return new CheckingAccount();
		}
		if (SAVING_ACCOUNT.equals(accountType)) {
			return new SavingAccount();
		}

		return null;
	}

}
