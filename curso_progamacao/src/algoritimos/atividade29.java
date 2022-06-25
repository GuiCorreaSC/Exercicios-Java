package algoritimos;

import java.util.Locale;
import java.util.Scanner;

public class atividade29 {
	/*
	 * Fazer um programa para ler um número inteiro N e uma matriz quadrada de ordem
	 * N contendo números inteiros. Em seguida, mostrar a diagonal principal e a
	 * quantidade de valores negativos da matriz.
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int neg = 0;
		
		int n = sc.nextInt();

		int[][] mat = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
 
				mat[i][j] = sc.nextInt();

				if (mat[i][j] < 0) {
					neg++;
				}
			}
		}
		
		System.out.println("DIAGONAL PRINCIPAL:");
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
				System.out.printf(mat[i][j] + " ");
				}
			}
		}
		System.out.println();
		System.out.println("QUANTIDADE DE NEGATIVOS = " +neg);
		sc.close();
	}

}
