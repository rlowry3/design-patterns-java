package rlowry3.design.patterns.creational.abstractfactory.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import rlowry3.design.patterns.creational.abstractfactory.ABCBank;
import rlowry3.design.patterns.creational.abstractfactory.Bank;
import rlowry3.design.patterns.creational.abstractfactory.BankFactory;
import rlowry3.design.patterns.creational.abstractfactory.XYZBank;

public class BankFactoryTest {

	@Test
	public void testABCBank() {
		BankFactory factory = new BankFactory();
		verifyBank(factory.getBank("ABCBANK"), ABCBank.class);

	}

	@Test
	public void testXYZBank() {
		BankFactory factory = new BankFactory();
		verifyBank(factory.getBank("XYZBANK"), XYZBank.class);
	}

	private void verifyBank(Bank bank, Class<?> clazz) {
		assertTrue("Must be of Bank Class:" + clazz.getName(), clazz.isInstance(bank));
	}

}
