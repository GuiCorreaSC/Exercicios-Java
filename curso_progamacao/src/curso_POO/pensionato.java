package curso_POO;

import java.util.Locale;
import java.util.Scanner;

public class pensionato {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		student[] vect = new student[9];

		System.out.println("Quantidade de alunos: ");
		int qtd_alunos = sc.nextInt();

		for (int i = 1; i <= qtd_alunos; i++) {

			System.out.println();

			System.out.println("Rent #" + i);

			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("EMAIL: ");
			String email = sc.next();

			System.out.print("Room: ");
			int roominitial = sc.nextInt();
			vect[roominitial] = new student(name, email);
		}
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 1; i < 10; i++) {

			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);

			}
		}

		sc.close();
	}

}
