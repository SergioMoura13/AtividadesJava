package services;

import java.util.Locale;
import java.util.Scanner;

import DomainException.BusinessException;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe os dados da conta");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		System.out.print("Titular: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Saldo Inicial: ");
		Double balance = sc.nextDouble();
		System.out.print("Limite de saque: ");
		Double limit = sc.nextDouble();

		Account acc = new Account(number, holder, balance, limit);

		System.out.print("Informe a quantia para sacar: ");
		Double amount = sc.nextDouble();

		try {
			acc.withdraw(amount);
			System.out.println("Novo Saldo: " + acc.getBalance());
		} 
		catch (BusinessException e) {
			System.out.println(e.getMessage());
		}

		sc.close();

	}

}
