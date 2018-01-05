package rlowry3.design.patterns.creational.factory.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import rlowry3.design.patterns.creational.factory.Account;
import rlowry3.design.patterns.creational.factory.AccountFactory;
import rlowry3.design.patterns.creational.factory.CheckingAccount;
import rlowry3.design.patterns.creational.factory.SavingAccount;

public class FactoryTest {

	@Test
	public void testSavingAccount() {
		AccountFactory factory = new AccountFactory();
		verifyAccount(factory.getAccount("SAVING"), SavingAccount.class);

	}

	@Test
	public void testCheckingAccount() {
		AccountFactory factory = new AccountFactory();
		verifyAccount(factory.getAccount("CHECKING"), CheckingAccount.class);
	}

	private void verifyAccount(Account account, Class<?> clazz) {
		assertTrue("Must be of Account Class:" + clazz.getName(), clazz.isInstance(account));
	}

}
