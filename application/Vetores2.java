package application;

import java.util.Locale;
import java.util.Scanner;

import Program.Product;

public class Vetores2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Enter the quantity of products: ");
		int products = sc.nextInt();

		Product[] vect = new Product[products];

		for (int i = 0; i < products; i++) {
			sc.nextLine();

			System.out.println("Enter name of product: ");
			String name = sc.nextLine();

			System.out.println("Enter price of product: ");
			Double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}

		double sum = 0.0;
		for (int i = 0; i < products; i++) {
			sum += vect[i].getPrice(); // estamos acessando o vetor na posição i e o preço da mesma
		}

		double avg = sum / products;
		
		System.out.printf("AVERAGE PRICE: " + avg);

	}

}
