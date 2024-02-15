package Program;

import java.util.Scanner;

public class exercicioPropostoMatriz {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor de Linhas: ");
		int i = sc.nextInt();
		System.out.println("Digite o valor de Colunas: ");
		int j = sc.nextInt();

		int[][] mat = new int[i][j];
		int count = 0;

		for (int linha = 0; linha < i; linha++) { // percorre as linhas
			for (int coluna = 0; coluna < j; coluna++) { // percorre as colunas
				System.out.println("Digite o valor para a posição [" + linha + "][" + coluna + "]: ");
				mat[linha][coluna] = sc.nextInt(); // digitar o valor da coluna e linha

			}
		}

		System.out.println("Números digitados na matriz:");
		for (int linha = 0; linha < i; linha++) {
			for (int coluna = 0; coluna < j; coluna++) {
				System.out.print(mat[linha][coluna] + " ");
			}

			System.out.println();

		}
		
		System.out.println("Digite um numero que esteja presente na matriz: ");
		int number = sc.nextInt();
		
		for(int linha = 0; linha < i; linha++) {
			for(int coluna = 0; coluna < j; coluna++) {
				if(mat[linha][coluna] == number) {
					System.out.println("Número " + number + " encontrado na posição [" + linha + "][" + coluna + "]");
					
					if (linha - 1 >= 0) {
		                System.out.println("Valor acima: " + mat[linha - 1][coluna]);
		            }
		            if (linha + 1 < i) {
		                System.out.println("Valor abaixo: " + mat[linha + 1][coluna]);
		            }
		            if (coluna - 1 >= 0) {
		                System.out.println("Valor à esquerda: " + mat[linha][coluna - 1]);
		            }
		            if (coluna + 1 < j) {
		                System.out.println("Valor à direita: " + mat[linha][coluna + 1]);
		            }
					
				}
			}
		}
		sc.close();
	}
}
