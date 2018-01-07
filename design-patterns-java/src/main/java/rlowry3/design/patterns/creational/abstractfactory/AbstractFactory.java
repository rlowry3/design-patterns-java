package rlowry3.design.patterns.creational.abstractfactory;

public abstract class AbstractFactory {
	
	abstract Bank getBank(String bankType);
	abstract Account getAccount(String accountType);

}
