package algoritimos;

import javax.swing.JOptionPane;

public class atividade8 {

	public static void main(String[] args) {

		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));
		if (x % y == 0 || y % x == 0) {
			JOptionPane.showMessageDialog(null, "S�o multiplos!");
		} else {
			JOptionPane.showMessageDialog(null, "N�o sao multiplos!");
		}
	}

}
