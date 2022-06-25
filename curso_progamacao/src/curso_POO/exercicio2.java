package curso_POO;

import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		employee x = new employee();
		
		x.name = sc.next();
		x.grossSalary = sc.nextDouble();
		x.tax = sc.nextDouble();
		
		System.out.println(x);
		
		System.out.println("Which percentage to increase salary?");
		x.increaseSalary = sc.nextDouble();
		
		System.out.println("Updated data: Joao Silva $ " +x.newSalary());
		
		
		sc.close();
	}

}