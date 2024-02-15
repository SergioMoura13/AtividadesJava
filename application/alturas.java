package application;

import java.util.Locale;
import java.util.Scanner;

import Program.Pessoa;
import Program.Product;

public class alturas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		
		System.out.println("Enter the quantity peoples: ");
		int peoples = sc.nextInt();
		Double sum =  0.0 , sum2 =  0.0;
		Pessoa[] pessoa = new Pessoa[peoples];
		
		for (int i = 0; i < peoples; i++) {
			sc.nextLine();
			
			System.out.println("-----------------------\n");
			
			System.out.println("Name : ");
			String name = sc.nextLine();

			System.out.println("Age: ");
			int age = sc.nextInt();
			
			System.out.println("Height: ");
			Double height = sc.nextDouble();
			
			System.out.println("-----------------------\n");
			
			pessoa [i] = new Pessoa (name, age, height);
		}
		
		int menores = 0;
		
		for(int i = 0; i < peoples; i++) {
			sum += pessoa[i].getAge();
			if(sum < 16) {
				menores++;
			}
		}
		
		for(int i = 0; i < peoples; i++) {
			sum2 += pessoa[i].getHight();
		}
		
		Double alturaMedia = sum2 / peoples;
		double percentualMenores = ((double) menores / peoples) * 100;
		
		System.out.println("Altura Media: " + alturaMedia);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n ", percentualMenores);
		
		
		

	}

}
