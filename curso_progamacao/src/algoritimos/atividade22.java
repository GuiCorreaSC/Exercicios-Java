package algoritimos;


import java.util.Locale;
import java.util.Scanner;

public class atividade22 {
/*
 * Faça um programa que leia N números inteiros e armazene-os 
em um vetor. Em seguida, mostrar na tela todos os números 
negativos lidos.*/
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("quantos numeros?");
		int rept = sc.nextInt();
		int[] n = new int[rept];
		for (int i = 0; i < rept ; i++) {
			n[i] = sc.nextInt();

		}
		for (int i = 0; i < rept ; i++) {
			if (n[i] < 0) {
				System.out.println(n[i]);
			}
		}

		sc.close();
	}

}