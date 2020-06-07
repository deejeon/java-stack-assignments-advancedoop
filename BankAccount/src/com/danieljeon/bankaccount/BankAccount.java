package com.danieljeon.bankaccount;

import java.util.ArrayList;
import java.util.Random;

public class BankAccount {
	
	// member variables
	private String accountNumber;
	private double checkingBalance = 0;
	private double savingsBalance = 0;
	
	// class static variables
	public static int accountCount = 0;
	public static double totalBalance = 0;
	
	// constructor
	public BankAccount() {
		this.accountNumber = this.generateAccountNumber();
		accountCount++;
	}
	
	// member methods
	private String generateAccountNumber() {
		ArrayList<String> digits = new ArrayList<String>();
		digits.add("0");
		digits.add("1");
		digits.add("2");
		digits.add("3");
		digits.add("4");
		digits.add("5");
		digits.add("6");
		digits.add("7");
		digits.add("8");
		digits.add("9");
		Random r = new Random();
		String generatedAccountNumber = "".concat(digits.get(r.nextInt(10))).concat(digits.get(r.nextInt(10))).concat(digits.get(r.nextInt(10))).concat(digits.get(r.nextInt(10))).concat(digits.get(r.nextInt(10))).concat(digits.get(r.nextInt(10))).concat(digits.get(r.nextInt(10))).concat(digits.get(r.nextInt(10))).concat(digits.get(r.nextInt(10))).concat(digits.get(r.nextInt(10)));
		return generatedAccountNumber;
	}
	
	public double getBalance(String accountType) {
		if (accountType == "checking") {
			return this.getCheckingBalance();
		}
		else if (accountType == "savings") {
			return this.getSavingsBalance();
		}
		else return 0;
	}
	
	public BankAccount deposit(double amount, String accountType) {
		if (accountType == "checking") {
			this.checkingBalance += amount;
		}
		else if (accountType == "savings") {
			this.savingsBalance += amount;
		}
		else return this;
		totalBalance += amount;
		return this;
	}
	
	public BankAccount withdraw(double amount, String accountType) {
		if (accountType == "checking") {
			if (this.checkingBalance < amount) {
				System.out.println("Insufficient funds.");
				return this;
			}
			else {
				this.checkingBalance -= amount;
			}
		}
		else if (accountType == "savings") {
			if (this.savingsBalance < amount) {
				System.out.println("Insufficient funds.");
				return this;
			}
			else {
				this.savingsBalance -= amount;

			}
		}
		else return this;
		totalBalance -= amount;
		return this;
	}
	
	public double totalAmount() {
		return totalBalance;
	}
	
	
	// getters and setters
	public String getAccountNumber() {
		return accountNumber;
	}
	private void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getCheckingBalance() {
		return checkingBalance;
	}
	private void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}
	public double getSavingsBalance() {
		return savingsBalance;
	}
	private void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	
	
}
