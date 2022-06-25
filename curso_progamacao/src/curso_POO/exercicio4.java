package curso_POO;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		CurrencyConverter x = new CurrencyConverter();
		
		System.out.println("Digite a cotaçao do dolar");
		x.dolar = sc.nextDouble();
		
		System.out.println("Digite a quantidade de dolares que deseja comprar");
		x.dolarbuy = sc.nextDouble();
		
		System.out.println(x);
		
		sc.close();
	}


}


