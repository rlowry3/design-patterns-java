package rlowry3.design.patterns.creational.builder;

public class BuilderMain {

	public static void main(String[] args) {
		
		
		Account mySavingAccount = new Account.AccountBuilder("RL's Account", 123456L, "R Lowry")
									   		 .balance(1000.00)
											 .accountType("CHECKING")
											 .build();
		
		System.out.println(mySavingAccount.toString());

	}

}
