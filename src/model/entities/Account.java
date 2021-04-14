package model.entities;

import model.exception.DomainException;

public class Account {
	
	private int number;
	private String suporte;
	private double balance;
	private double withdrawLimit;
	
	public Account() {
	}
	
	public Account(int number, String suporte, double balance, double withdrawLimit) {
		this.number = number;
		this.suporte = suporte;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getSuporte() {
		return suporte;
	}
	
	public void setSuporte(String suporte) {
		this.suporte = suporte;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getWithdrawLimit() {
		return withdrawLimit;
	}
	
	public void setWithdrawLimit(double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	public void withdrawn (double amount) {
		if (balance == 0.0) {
			throw new DomainException("this account has no balance");
		}
		if (amount > withdrawLimit) {
			throw new DomainException("The amount exceeds withdraw limit");
		}
		balance -= amount;
	}
	
}
