package rlowry3.design.patterns.creational.builder.test;

import static org.junit.Assert.*;

import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import rlowry3.design.patterns.creational.builder.Account;

public class AccountBuilderTest {

	
	private Account testAccount = null;
	
	@Before
	public void setUpAccount() {
		
		testAccount = new Account.AccountBuilder("RL's Account", 123456L, "R Lowry")
				.balance(1000.00)
				.accountType("Saving Account")
				.build();
		
	}
	
	@Test
	public void testAccountName() {
		
		String accountName = testAccount.getAccountName();
		
		assertTrue(accountName.equals("RL's Account"));
		
	}
	
	@Test
	public void testAccountNumber() {
		
		Long accountNumber = 123456L;
		
		assertEquals(accountNumber, testAccount.getAccountNumber());
		
	}
	
	@Test
	public void testAccountOwner() {
		
		String accountOwner = testAccount.getAccountOwner();
		
		assertTrue(accountOwner.equals("R Lowry"));
		
	}
	
	@Test
	public void testAccountBalance() {
		
		double balance = 1000.00;
		
		assertEquals(balance, testAccount.getBalance(), 0);
	}
	@Test
	public void testAccountType() {
		
		String accountType = testAccount.getAccountType();
		
		assertTrue(accountType.equals("Saving Account"));
		
	}


}
