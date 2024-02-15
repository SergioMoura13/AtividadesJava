package Program;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number:");
		
		int n = sc.nextInt();
		int [][] mat = new int [n][n]; // sera a entrada n, ex: se for 3, será 3 linhas e 3 colunas
		
		for(int i=0; i<n; i++) { // percorre as linhas
			for(int j=0; j<n; j++) { // percorre as colunas
				mat[i][j] = sc.nextInt(); // digitar o valor da coluna e linha
			}
		}
		
		System.out.print("Main diagonal: ");
		for(int i=0; i<n; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		int count = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=0;j<n; j++) {
				if(mat[i][j] < 0 ) {
					count++;
				}
			}
		}
		
		System.out.println("Negative numbers: " + count);
			
		sc.close();
	}

}
