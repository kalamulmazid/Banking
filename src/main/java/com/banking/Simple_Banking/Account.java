package com.banking.Simple_Banking;

import java.util.Date;

/**
 * <h1>Class Name: Account</h1> Account class is the super class of all type of
 * Accounts. It implements AccountInterface.
 * <p>
 * @author MD KALAM-UL-MAZID
 * @version 1.0
 */
public class Account implements AccountInterface {

	private int id;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated = new Date();

	/**
	 * <h1>Constructor of Account Class</h1> Constructor that initialize variables with
	 * zero values
	 * <p>
	 * @param No Parameters
	 * @author MD KALAM-UL-MAZID
	 * @version 1.0
	 */
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
		if (amount > 0) {
			balance += amount;
		}
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + ", dateCreated=" + dateCreated + "]";
	}
}