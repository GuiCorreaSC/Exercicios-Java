package algoritimos;

import java.util.Locale;

public class atividade31 {

	public static void main(String[] args) {
//		Locale.setDefault(Locale.US);
		
		String product1 = "Computer";
		String product2 = "Office desk";

		int age = 30;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.printf("Products:%n" + product1 + ", which price is $ ");
		System.out.printf("%.2f%n", price1);
		System.out.printf(product2 + ", which price is $ " );
		System.out.printf("%.2f%n", price2);
		System.out.println("Record: " + age + " years old, code " + code
				+ " and gender: " + gender);
		System.out.printf("Measue with eight decimal places: %.6f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);	
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);

	}

}
