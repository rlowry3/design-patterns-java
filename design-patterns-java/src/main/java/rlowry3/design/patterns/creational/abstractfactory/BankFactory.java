package rlowry3.design.patterns.creational.abstractfactory;

public class BankFactory extends AbstractFactory {

	final String ABC_BANK = "ABCBANK";
	final String XYZ_BANK = "XYZBANK";

	@Override
	public Bank getBank(String bankType) {

		if (ABC_BANK.equals(bankType)) {
			return new ABCBank();
		}

		if (XYZ_BANK.equals(bankType)) {
			return new XYZBank();
		}

		return null;
	}

	@Override
	Account getAccount(String accountType) {
		return null;
	}

}
