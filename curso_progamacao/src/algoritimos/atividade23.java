package algoritimos;


import java.util.Locale;
import java.util.Scanner;
/*
 * Faça um programa que leia N números reais e armazene-os em um vetor. 
Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor
*/
public class atividade23 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int rept = sc.nextInt();
		double[] vet = new double[rept];
		
		double soma = 0.0;

		for (int i=0; i<rept; i++) {
			vet[i] = sc.nextDouble();
			soma = soma + vet[i];
		}

		
		for (int i=0; i<rept; i++) {
		System.out.printf(vet[i] +"  ");
		}
		System.out.println();
		System.out.printf("%.2f%n", soma);
		double media = soma/rept;
		System.out.printf("%.2f%n", media);
		
		sc.close();
	}

}