package rlowry3.design.patterns.creational.abstractfactory.test;

import static org.junit.Assert.*;

import org.junit.Test;

import rlowry3.design.patterns.creational.abstractfactory.Account;
import rlowry3.design.patterns.creational.abstractfactory.AccountFactory;
import rlowry3.design.patterns.creational.abstractfactory.CheckingAccount;
import rlowry3.design.patterns.creational.abstractfactory.SavingAccount;

public class AccountFactoryTest {

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
