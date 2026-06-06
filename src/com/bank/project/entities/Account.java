package com.bank.project.entities;

public class Account {

	private int Number;
	private String Holder;
	private double Balance;
	private double WithDrawLimit;

	public Account() {

	}

	public Account(int number, String holder, double balance, double withDrawLimit) {
		Number = number;
		Holder = holder;
		Balance = balance;
		WithDrawLimit = withDrawLimit;
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append(String.format("%.2f", Balance));
		return s.toString();
	}

}
