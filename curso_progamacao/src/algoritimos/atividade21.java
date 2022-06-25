package algoritimos;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;
/*Nao finalizada
 * */
public class atividade21 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de repet"));
		int x = 0;
		int y = 0;
		int soma = 0;
		for (int i = 1; i <= n; i++) {
			x = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero inicial"));
			y = Integer
					.parseInt(JOptionPane.showInputDialog("Digite a quantidade de numeros impares do numero anterior"));

			int qtdr = 1;
			
			if (x % 2 == 0) {
				
				for (int i2 = x + 1; i2 <= 1000; i2++) {
					while (qtdr <= y) {
					soma = soma + i2;
//					System.out.printf(i2 +" ");
					qtdr++;
					}
				}
			} else {
				for (int i3 = x; i3 <= 1000; i3++) {
					while (qtdr <= y) {
					soma = soma + i3;
//					System.out.printf(i3 +" ");
					qtdr++;
					}
				}
			}
			System.out.println(soma);
		}

		sc.close();
	}

}