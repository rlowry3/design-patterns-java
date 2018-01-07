package rlowry3.design.patterns.creational.singleton.test;

import org.junit.Assert;
import org.junit.Test;

import rlowry3.design.patterns.creational.singleton.SingletonClassEagerInitialization;

public class SingletonClassEagerInitializationTest {

	@Test
	public void testSingletonClassEagerInitialization() {

		SingletonClassEagerInitialization instance1 = SingletonClassEagerInitialization.getInstance();
		SingletonClassEagerInitialization instance2 = SingletonClassEagerInitialization.getInstance();

		Assert.assertSame("Singleton Instance 1 should match Singleton Instance 2", instance1, instance2);

	}

}
