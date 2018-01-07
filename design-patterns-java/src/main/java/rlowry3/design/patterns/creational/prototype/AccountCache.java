package rlowry3.design.patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class AccountCache {
	
	public static Map<String, Account> accountCacheMap = new HashMap<String, Account>();
	
	static {
		
		Account checkingAccount = new CheckingAccount();
		Account savingAccount = new SavingAccount();
		
		accountCacheMap.put("CHECKING", checkingAccount);
		accountCacheMap.put("SAVING", savingAccount);
	}
	

}
