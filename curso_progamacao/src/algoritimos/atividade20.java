package algoritimos;

import java.util.Locale;
import java.util.Scanner;

public class atividade20 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int soma = 0;
		int m = 0;
		int n = 0;
		do {
			m = sc.nextInt();
			n = sc.nextInt();

			if (m >= n) {
				for (int i = n; i >= m; i++) {
					soma = n + i;
					System.out.printf(i + " " + "Soma=" + soma);
				}
			} else {
				for (int i = m; i >= n; i++) {
					soma = m + i;
					System.out.printf(i + " " + "Soma=" + soma);
				}
			}

		} while (m != 0 || n != 0);

		sc.close();
	}
}