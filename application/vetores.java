package application;

import java.util.Locale;
import java.util.Scanner;

public class vetores {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		
		
		System.out.println("Enter the quantity of people: ");
		 int peoples = sc.nextInt();
		
		 double[] height = new double[peoples]; //utilizando vetor
		 
		for(int i = 1; i <= peoples; i++) {
			System.out.println("Height people " + i + ":");
			height[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for(int i=0; i<peoples; i++) {
			sum += height[i];
		}
		
		double avg = sum / peoples;
		
		System.out.println("AVERAGE HEIGHT: " + avg);
		
		sc.close();

	}

}
