package algoritimos;

import java.util.Locale;
import java.util.Scanner;

public class atividade26 {
	/*
	 * 2) Faça um programa que leia N números inteiros e armazene-os em um vetor. Em
	 * seguida, mostre na tela: - todos os números pares - a quantidade de números
	 * pares
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int par = 0;

		System.out.println("quantos numeros?");
		int rept = sc.nextInt();

		double[] n = new double[rept];

		for (int i = 0; i < rept; i++) {
			n[i] = sc.nextDouble();
			if (n[1] % 2 == 0) {
				
			}

		}
		for (int i = 0; i < rept; i++) {
			if (n[i] % 2 == 0) {
				par++;
				System.out.printf(n[i] +" ");
			}
		}
		System.out.println();
	//	System.out.println(n[] % 2);
		System.out.println(par);
		sc.close();
		
	}

}
