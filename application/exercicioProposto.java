package application;

import java.util.Locale;
import java.util.Scanner;

import Program.Registro;

public class exercicioProposto {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("How many employess will be registred: ");
		int register = sc.nextInt();

		String[] name = new String[register];
		int[] id = new int[register];
		Double[] salary = new Double[register];

		Registro registro = new Registro();

		for (int i = 0; i < register; i++) {
			sc.nextLine();

			System.out.println("Name : ");
			name[i] = sc.nextLine();

			boolean idAlreadyExists;
			do { // tem que executar pelo menos uma vez pra validar o boolean
				idAlreadyExists = false;

				System.out.println("Id: ");
				id[i] = sc.nextInt();

				// Verificar se o ID já foi registrado antes
				for (int j = 0; j < i; j++) {
					if (id[i] == id[j]) {
						System.out.println("ID already exists. Please enter a different ID.");
						idAlreadyExists = true;
						break;
					}
				}

			} while (idAlreadyExists);

			System.out.println("Salary: ");
			salary[i] = sc.nextDouble();

		}

		// Mostrar informações antes do aumento de salário
		System.out.println("Employee Information before salary increase:");
		for (int i = 0; i < register; i++) {
			System.out.println("Name: " + name[i] + ", Id: " + id[i] + ", Salary: " + salary[i]);
		}

		// Aumento de salário
		System.out.println("\nEnter the ID of the employee you want to increase the salary: ");
		int searchId = sc.nextInt();

		for (int i = 0; i < register; i++) {
			if (id[i] == searchId) {
				System.out.println("Enter the amount to increase the salary for employee " + name[i] + ": ");
				double increase = sc.nextDouble();
				salary[i] += increase;
			}
		}
		
		// Mostrar informações após o aumento de salário
        System.out.println("\nEmployee Information after salary increase:");
        for (int i = 0; i < register; i++) {
            System.out.println("Name: " + name[i] + ", Id: " + id[i] + ", Salary: " + salary[i]);
        }

	}

}
