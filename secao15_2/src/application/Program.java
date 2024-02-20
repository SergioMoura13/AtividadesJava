package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<>();

		System.out.println("Enter the number of tax payers:");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Tax payer # " + i + " data: ");
			System.out.print(" Individual or Company (i/c) ? ");
			char c = sc.next().charAt(0);

			System.out.println("Name: ");
			String name = sc.next();
			System.out.println("Anual income: ");
			Double anual = sc.nextDouble();

			if (c == 'i') {
				System.out.println("Health expenditures: ");
				Double health = sc.nextDouble();
				list.add(new Individual(name, anual, health));
			} else if (c == 'c') {
				System.out.println("Number of employess:");
				int employees = sc.nextInt();
				list.add(new Company(name, anual, employees));
			}

		}
		
		double totalTaxes = 0.0;
		
		System.out.println("");
		System.out.println("TAXES PAID");
		for (TaxPayer tax : list) {
			 double taxAmount = tax.tax();
		        System.out.println(tax.getName() + ": " + taxAmount);
		        totalTaxes += taxAmount;
		}

		System.out.println("TOTAL TAXES: " + totalTaxes);

	}

}
