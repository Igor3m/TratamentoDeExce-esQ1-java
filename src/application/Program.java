package application;

import java.util.Scanner;

import model.entities.Account;
import model.exception.DomainException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int numero = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String titular = sc.nextLine();
			System.out.print("Initial balance: ");
			double saldoInicial = sc.nextDouble();
			System.out.print("Withdraw limit:");
			double limiteSaque = sc.nextDouble();
			Account conta = new Account(numero, titular, saldoInicial, limiteSaque);
			
			System.out.print("Enter amount for withdraw: ");
			double valorSaque = sc.nextDouble();
			conta.withdrawn(valorSaque);
			
			System.out.println("New balance: " + conta.getBalance());
		}
		catch(DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		
		sc.close();
	}

}
