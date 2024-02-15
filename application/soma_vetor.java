package application;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		System.out.println("How many numbers will you enter: ");
		int number = sc.nextInt();
		
		int[] n = new int [number];
		
		for(int i = 0; i < number ; i++) {
			System.out.println("Enter number: ");
			n[i] = sc.nextInt();
		}
		
		System.out.println("VALORES: ");
		
		int sum = 0;
		
		for(int i = 0; i < number ; i++) {	
			System.out.println(" " + n[i]);
			sum += n[i];
			
		}
		
		int soma = sum;
		
		System.out.println("Soma: " + soma );
		
		int media = soma/number;
		
		System.out.println("Media: " + media);
		
		
		
		
		

	}

}
