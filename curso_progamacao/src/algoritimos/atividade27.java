package algoritimos;

import java.util.Locale;
import java.util.Scanner;


public class atividade27 {
/*3) Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um terceiro vetor C onde 
cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima o vetor C gerado*/
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int elementos = sc.nextInt();
		int a[] = new int[elementos];
		int b[] = new int[elementos];
		int c[] = new int[elementos];
		
		for(int i = 0; i < elementos ; i++) {
			System.out.println("vetor a:" );
			a[i] = sc.nextInt();
			System.out.println("vetor b:" );
			b[i] = sc.nextInt();		
			c[i] = a[i] + b[i];
		}
		for(int i = 0; i < elementos ; i++) {
			System.out.printf(c[i] +" ");
		}
		sc.close();
	}

}