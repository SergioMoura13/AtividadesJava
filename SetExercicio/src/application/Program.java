package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> cursoA = new HashSet<>();
		Set<Integer> cursoB = new HashSet<>();
		Set<Integer> cursoC = new HashSet<>();
		
		System.out.print("How many students for course A: ");
		int a = sc.nextInt();
		
		for(int i = 0; i < a; i++) {
			System.out.println("Enter id: ");
			int number = sc.nextInt();
			cursoA.add(number);
		}
		
		System.out.print("How many students for course B: ");
		int b = sc.nextInt();
		
		for(int i = 0; i < b; i++) {
			System.out.println("Enter id: ");
			int number = sc.nextInt();
			cursoA.add(number);
		}
		
		System.out.print("How many students for course C: ");
		int c = sc.nextInt();
		
		for(int i = 0; i < c; i++) {
			
			System.out.println("Enter id: ");
			int number = sc.nextInt();
			cursoA.add(number);
			
		}
		
		Set<Integer> totalAlunos = new HashSet<>();
		totalAlunos.addAll(cursoA);
		totalAlunos.addAll(cursoB);
		
		System.out.print("Total Students: " + totalAlunos.size());
		

	}

}
