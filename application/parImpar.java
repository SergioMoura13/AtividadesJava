package application;

import java.util.Locale;
import java.util.Scanner;

public class parImpar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		 
		
		System.out.println("how many numbers will you enter: ");
		int number = sc.nextInt();
		
		double[] n = new double [number];
		
		while(number > 10) {
			System.out.println("Number exceeded");
			System.out.println("how many numbers will you enter: ");
			number = sc.nextInt();
		}
		
		for(int i = 0; i < number; i++) {
			int c = 1;
			System.out.println("Enter of number " + c + ":");
			n[i] = sc.nextDouble();
		}
		
		
		
		for(int i = 0; i< number; i++) {
			if(n[i] < 0) {
				System.out.println("Numbers Negatives:");
				System.out.printf("%.2f\n ", n[i]);
			}
		}
		
		
			sc.close();
		

	}

}
