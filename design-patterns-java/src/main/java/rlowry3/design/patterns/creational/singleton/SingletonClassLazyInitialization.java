package rlowry3.design.patterns.creational.singleton;

public class SingletonClassLazyInitialization {

	private static SingletonClassLazyInitialization instance = null;

	private SingletonClassLazyInitialization() {

	}

	public static SingletonClassLazyInitialization getInstance() {
		if (instance == null) {
			synchronized (SingletonClassLazyInitialization.class) {
				if (instance == null) {
					instance = new SingletonClassLazyInitialization();
				}
			}

		}
		return instance;
	}

}
