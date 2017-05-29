package com.banking.Simple_Banking;

import java.util.Date;

public class Account implements AccountInterface {

	private int id;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated = new Date();

	private Account() {
		id = 0;
		balance = 0.0;
		annualInterestRate = 0.0;
	}

	private Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}

	private Account(int id, double balance, double newAnnualInterestRate) {
		this.id = id;
		this.balance = balance;
		annualInterestRate = newAnnualInterestRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		if (balance >= 0)
			this.balance = balance;
	}

	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public static void setAnnualInterestRate(double annualInterestRate) {
		Account.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}


	public void withdraw(double amount) {
		if (this.getBalance() > amount) {
			balance -= amount;
		}
	}
	
	public void deposit(double amount) {
		if (amount>0) {
			balance += amount;
		}
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + ", dateCreated=" + dateCreated + "]";
	}
}