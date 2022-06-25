package algoritimos;

/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago*/
import java.util.Scanner;

public class atividade5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double vlr1, vlr2, soma;
		int num1 = sc.nextInt();
		vlr1 = sc.nextDouble();
		int num2 = sc.nextInt();
		vlr2 = sc.nextDouble();
		soma = (num1 * vlr1) + (num2 * vlr2);
		System.out.printf("VALOR A PAGAR: %.2f%n", soma);
		sc.close();
	}

}
