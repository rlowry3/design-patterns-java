package rlowry3.design.patterns.creational.prototype.test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import rlowry3.design.patterns.creational.prototype.Account;
import rlowry3.design.patterns.creational.prototype.SavingAccount;

public class SavingAccountTest {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	@Before
	public void setUpStream() {
		System.setOut(new PrintStream(outContent));
	}

	@Test
	public void accountTypeTest() {
		Account savingAccount = new SavingAccount();
		savingAccount.accountType();
		assertEquals("Saving Account\r\n", outContent.toString());
	}

	@After
	public void cleanUpStream() {
		System.setOut(null);
	}

}
