/*correçao
 * import java.util.Locale;
import java.util.Scanner;

public class uri1037 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double numero = sc.nextDouble();
		
		if (numero < 0.0 || numero > 100.0) {
			System.out.println("Fora de intervalo");
		}
		else if (numero <= 25.0) {
			System.out.println("Intervalo [0,25]");
		}
		else if (numero <= 50.0) {
			System.out.println("Intervalo (25,50]");
		}
		else if (numero <= 75.0) {
			System.out.println("Intervalo (50,75]");
		}		
		else {
			System.out.println("Intervalo (75,100]");
		}
		
		sc.close();
	}
}*/
package algoritimos;

import javax.swing.JOptionPane;

public class Atividade11 {

	public static void main(String[] args) {
		String intervalo = null;
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		if (x >= 0 && x <= 25 ) {
			intervalo = "(0,25)";
		} 
		else if (x >= 25 && x <= 50) {
			intervalo = "(25,50)";
		}	
		else if (x >= 50 && x <= 75) {
				intervalo = "(50,75)";
		}
	   else if (x >= 75 && x <= 100) {
					intervalo = "(75,100)";
		} 
		else {
			JOptionPane.showMessageDialog(null, "Fora do intervalo");
		}
		JOptionPane.showMessageDialog(null, "Intervalo " +intervalo );
	}

}

