package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities_enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		
		Client client = new Client();
		Order order = new Order();
		//Product product = new Product();
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter cliente data: ");
		System.out.println("Name: ");
		client.setName(sc.next());
		System.out.println("Email: ");
		client.setEmail(sc.next());
		System.out.println("Birth date: ");
		client.setBirthDate(sdf.parse(sc.next()));
		System.out.println("");
		
		order.setClient(client);
		
		System.out.println("Enter order data: ");
		OrderStatus order1 = OrderStatus.DELIVERED;
		System.out.println("Status: " + order1);
		order.setStatus(order1);
		
		System.out.println("How many items to this order?");
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			
			System.out.println("Enter #" + i + " item data");
            System.out.println("Product name: ");
            String productName = sc.next();
            System.out.println("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.println("Quantity: ");
            int quantity = sc.nextInt();

            
            Product product = new Product(productName, productPrice);
            OrderItem item = new OrderItem(quantity, product.getPrice(), product);
            order.addItem(item);;
		}
		
		System.out.println(order);
		
	}

}
