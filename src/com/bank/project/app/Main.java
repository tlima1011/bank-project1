package com.bank.project.app;

import java.util.Locale;
import java.util.Scanner;

import com.bank.project.entities.Account;
import com.bank.project.exceptions.DomainException;

public class Main {

	public static void main(String[] args) throws DomainException, Exception {
		
		Locale.setDefault(Locale.US); 
		Scanner ler = new Scanner(System.in); 
		
		try {
			System.out.println("Enter account data" );
			System.out.print("Number: ");
			int number = ler.nextInt(); 
			ler.nextLine();
			System.out.print("Holder: ");
			String holder = ler.nextLine();  
			System.out.print("Initial balance: ");
			double balance = ler.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = ler.nextDouble();
			
			Account account = new Account(number, holder, balance, withdrawLimit);
			
			System.out.print("Enter amount for withdraw: ");
			double amount = ler.nextDouble(); 
			account.WithDraw(amount); 
			System.out.print(account);
			
			ler.close();
		}catch(DomainException e) {
			System.out.println("Withdraw error: "+ e.getMessage());
		}catch(java.util.InputMismatchException e) {
			System.out.println("Error: formato ilegal com string informada");
		}
	}
}
