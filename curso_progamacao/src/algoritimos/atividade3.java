package algoritimos;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, d, soma;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		soma = ((a * b) - (c * d));
		System.out.println("DIFERENÇA = " + soma);
		sc.close();
	}

}
