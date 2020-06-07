package com.danieljeon.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount();
		account1.deposit(30, "checking");
		account1.deposit(35.65, "savings");
		System.out.println(account1.getAccountNumber());
		System.out.println("The checking account balance is: $" + account1.getBalance("checking"));
		System.out.println("The savings account balance is: $" + account1.getBalance("savings"));
		System.out.println(account1.totalBalance);
		System.out.println(account1.accountCount);
		
		account2.deposit(50, "checking");
		account2.withdraw(20, "checking");
		System.out.println(account2.getAccountNumber());
		System.out.println("The checking account balance is: $" + account2.getBalance("checking"));
		System.out.println("The savings account balance is: $" + account2.getBalance("savings"));
		System.out.println(account2.totalBalance);
		System.out.println(account2.accountCount);
	}

}
