package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {

		List<Product> list = new ArrayList<>();

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of products: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.println("Common, used or imported (c/u/i)? ");
			char c = sc.next().charAt(0);
			System.out.println("Name: ");
			String name = sc.next();
			System.out.println("Price: ");
			double price = sc.nextDouble();

			if (c == 'i') {
				System.out.println("Customs fee: ");
				double customsFee = sc.nextDouble();

				Product product = new ImportedProduct(name, price, customsFee);
				list.add(product);

			} else if (c == 'u') {
				System.out.println("Manufacture date (DD/MM/YYYY): ");
				Date data = sdf.parse(sc.next());

				Product product = new UsedProduct(name, price, data);
				list.add(product);
			} else {

				Product product = new Product(name, price);
				list.add(product);

			}

		}

		System.out.println("");
		System.out.println("PRICE TAGS:");

		for (Product product : list) {
			System.out.println(product.priceTag());
		}
	}

}
