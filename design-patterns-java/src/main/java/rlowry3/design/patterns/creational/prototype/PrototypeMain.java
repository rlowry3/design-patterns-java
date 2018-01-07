package rlowry3.design.patterns.creational.prototype;

public class PrototypeMain {

	public static void main(String[] args) {
		
		Account checkingAccount = (Account) AccountCache.accountCacheMap.get("CHECKING");
		checkingAccount.accountType();
		
		Account savingAccount = (Account) AccountCache.accountCacheMap.get("SAVING");
		savingAccount.accountType();	
		

	}

}
