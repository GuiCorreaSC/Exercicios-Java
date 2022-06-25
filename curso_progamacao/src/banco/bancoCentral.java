package banco;

import java.util.Locale;
import java.util.Scanner;

public class bancoCentral {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		conta x;
		System.out.println("Enter account number: ");
		int num_conta = sc.nextInt();
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.println("Is there na initial deposit (y/n)? ");
		char option_deposit = sc.next().charAt(0);
		double saldo = 0;
		
		if (option_deposit == 'y') {
				System.out.println("Enter initial deposit value: ");
				saldo = sc.nextDouble();
				x = new conta(num_conta, titular, saldo);
			   
			}else {
				x = new conta(num_conta, titular);
		}
		
		System.out.println();
		System.out.println(x.toString());
		
		System.out.println();
		System.out.println("Enter a deposit value: ");
		x.deposito(sc.nextDouble());
		System.out.println(x.toString());
		
		System.out.println("Enter a withdraw value: ");
		x.whitdraw(sc.nextDouble());
		System.out.println(x.toString());

		sc.close();
	}

}
