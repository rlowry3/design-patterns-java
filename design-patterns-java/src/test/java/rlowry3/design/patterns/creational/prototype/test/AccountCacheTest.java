package rlowry3.design.patterns.creational.prototype.test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import rlowry3.design.patterns.creational.prototype.SavingAccount;
import rlowry3.design.patterns.creational.prototype.CheckingAccount;
import rlowry3.design.patterns.creational.prototype.Account;
import rlowry3.design.patterns.creational.prototype.AccountCache;

public class AccountCacheTest {

	@Test
	public void testAccountCacheCheckingAccount() {

		Account checkingAccount = (Account) AccountCache.accountCacheMap.get("CHECKING").clone();

		verifyAccount(checkingAccount, CheckingAccount.class);

	}

	@Test
	public void testAccountCacheSavingAccount() {

		Account savingAccount = (Account) AccountCache.accountCacheMap.get("SAVING").clone();

		verifyAccount(savingAccount, SavingAccount.class);

	}

	@Test
	public void testCheckingCloneNotSame() {

		Account checkingAccount = (Account) AccountCache.accountCacheMap.get("CHECKING").clone();

		assertNotNull(checkingAccount);

		assertNotEquals(checkingAccount, AccountCache.accountCacheMap.get("CHECKING"));

	}

	@Test
	public void testSavingCloneNotSame() {

		Account savingAccount = (Account) AccountCache.accountCacheMap.get("SAVING").clone();

		assertNotNull(savingAccount);

		assertNotEquals(savingAccount, AccountCache.accountCacheMap.get("SAVING"));

	}

	private void verifyAccount(Account account, Class<?> clazz) {
		assertTrue("Must be of Account Class:" + clazz.getName(), clazz.isInstance(account));
	}

}
