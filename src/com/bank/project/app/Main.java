package com.bank.project.app;

import java.util.Locale;
import java.util.Scanner;

import com.bank.project.entities.Account;
import com.bank.project.exceptions.DomainException;

public class Main {

	public static void main(String[] args) throws DomainException {
		
		Locale.setDefault(Locale.US); 
		Scanner ler = new Scanner(System.in); 
		
		try {
			System.out.println("Enter account data" );
			System.out.print("Number: ");
			//8021
			int number = ler.nextInt(); 
			ler.nextLine();
			System.out.print("Holder: ");
			String holder = ler.nextLine();  
			//Bob Brown
			System.out.print("Initial balance: ");
			double balance = ler.nextDouble();
			//500.00
			System.out.print("Withdraw limit: ");
			double withdrawLimit = ler.nextDouble();
			//300.00 
			//Enter amount for withdraw: 100.00
			Account account = new Account(number, holder, balance, withdrawLimit);
			System.out.print("Enter amount for withdraw: ");
			double amount = ler.nextDouble(); 
			account.WithDraw(amount); 
			System.out.print("New balance: " + account);
			
			// 400.00	
			ler.close();
		}catch(DomainException e) {
			System.out.println("Withdraw error: "+ e.getMessage());
		}
	}
}
