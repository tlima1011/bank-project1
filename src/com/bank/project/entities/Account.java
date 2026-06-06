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
		//WithDrawLimit = withDrawLimit; 
		ValidateWithDrawLimit(withDrawLimit);
	}
	
	public void Deposit(double amount) throws DomainException { 
		if(amount <= 0) {
			throw new DomainException("Valor do depósito não pode ser menor ou igual a 0");
		}
		else {
			Balance += amount; 
		}
	}
	
	public void ValidateWithDrawLimit(double wd) throws DomainException{
		if(wd <= 0) {
			throw new DomainException("Valor de Limite não pode ser menor ou igual a 0");
		}
		else {
			WithDrawLimit = wd; 
		}
	}
	
	public void WithDraw(double a) throws DomainException{
		if(a > WithDrawLimit || a < 0) {
			throw new DomainException("The amount exceeds withdraw limit or minus 0");
		}
		else if(a > Balance) {
			throw new DomainException("Not enough balance");
		}
		else {
			Balance -= a; 
		}
	}
	
	
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append(String.format("%.2f", Balance));
		return s.toString();
	}

}
