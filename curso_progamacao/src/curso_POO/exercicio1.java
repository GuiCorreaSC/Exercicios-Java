package curso_POO;

import java.util.Locale;
import java.util.Scanner;


public class exercicio1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		rectangle x = new rectangle();
		
		System.out.println("Enter rectangle width and height: ");

		x.width = sc.nextDouble();
		x.height = sc.nextDouble();
		
		System.out.println(x);
		sc.close();
	}

}