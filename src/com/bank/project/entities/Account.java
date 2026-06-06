package com.bank.project.entities;

import com.bank.project.exceptions.DomainException;

public class Account {

	private int Number;
	private String Holder;
	private double Balance;
	private double WithDrawLimit;

	public Account() {

	}

	public Account(int number, String holder, double balance, double withDrawLimit) throws DomainException {
		Number = number;
		Holder = holder;
		Deposit(balance);
		//Balance = balance;
		WithDrawLimit = withDrawLimit;
	}
	
	public void Deposit(double amount) throws DomainException { 
		if(amount < 0) {
			throw new DomainException("Valor do depósito não pode ser menor que 0");
		}
		else {
			Balance += amount; 
		}
	}
	
	

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append(String.format("%.2f", Balance));
		return s.toString();
	}

}
