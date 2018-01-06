package rlowry3.design.patterns.creational.abstractfactory;

public class FactoryProducer {
	
	final static String BANK = "BANK";
	final static String ACCOUNT = "ACCOUNT";
	
	public static AbstractFactory getFactory(String factory) {
		
		if(BANK.equalsIgnoreCase(factory)){
			return new BankFactory();
		}
		if(ACCOUNT.equalsIgnoreCase(factory)) {
			return new AccountFactory();
		}
		
		return null;
	}
			

}
