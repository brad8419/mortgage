package com.mercury.demand.persistence.model;

public class CalculationResult {
	private int year;
	private int month;
	private double payment;
	private double extraPayment;
	private double totalPayment;
	private double balance;
	
	public CalculationResult(){}
	
	public CalculationResult(int year, int month, double payment, double extraPayment, double totalPayment, double balance){
		this.year= year;
		this.month= month;
		this.payment= payment;
		this.extraPayment= extraPayment;
		this.totalPayment= totalPayment;
		this.balance= balance;
		}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public double getPayment() {
		return payment;
	}

	public void setPayment(double payment) {
		this.payment = payment;
	}

	public double getExtraPayment() {
		return extraPayment;
	}

	public void setExtraPayment(double extraPayment) {
		this.extraPayment = extraPayment;
	}

	public double getTotalPayment() {
		return totalPayment;
	}

	public void setTotalPayment(double totalPayment) {
		this.totalPayment = totalPayment;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
