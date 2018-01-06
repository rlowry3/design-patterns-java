package rlowry3.design.patterns.creational.abstractfactory.test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import rlowry3.design.patterns.creational.abstractfactory.ABCBank;
import rlowry3.design.patterns.creational.abstractfactory.Bank;


public class ABCBankTest {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	@Before
	public void setUpStream() {
		System.setOut(new PrintStream(outContent));
	}

	@Test
	public void accountTypeTest() {
		Bank abcBank = new ABCBank();
		abcBank.bankName();
		assertEquals("ABC Bank\r\n", outContent.toString());
	}

	@After
	public void cleanUpStream() {
		System.setOut(null);
	}

}