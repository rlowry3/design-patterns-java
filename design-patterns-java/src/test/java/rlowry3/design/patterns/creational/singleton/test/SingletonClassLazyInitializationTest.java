package rlowry3.design.patterns.creational.singleton.test;

import org.junit.Assert;
import org.junit.Test;

import rlowry3.design.patterns.creational.singleton.SingletonClassLazyInitialization;

public class SingletonClassLazyInitializationTest {

	@Test
	public void testSingletonClassLazyInitialization() {
		
		SingletonClassLazyInitialization instance1 = SingletonClassLazyInitialization.getInstance();
		SingletonClassLazyInitialization instance2 = SingletonClassLazyInitialization.getInstance();
		
		Assert.assertSame("Singleton Instance 1 should match Singleton Instance 2", instance1, instance2);
		
	}

}
