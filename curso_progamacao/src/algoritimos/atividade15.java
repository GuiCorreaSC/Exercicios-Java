package algoritimos;

import javax.swing.JOptionPane;

public class atividade15 {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Quantas numeros deseja ?"));
		int x = 0, em = 0, fora = 0;
		for (int i = 1; i <= n; i++) {
			x = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));

			if (x >= 10 && x <= 20) {
				em = em + 1;
			} else if (x > 0) {
				fora = fora + 1;
			}

		}
		JOptionPane.showMessageDialog(null, +em + " em" + "\n" + fora + " fora");
	}

}
