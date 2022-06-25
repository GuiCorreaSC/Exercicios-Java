package algoritimos;

import javax.swing.JOptionPane;

public class atividade7 {

	public static void main(String[] args) {
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para desobrir se é IMPAR/PAR :"));
		if (x % 2 == 0) {
			JOptionPane.showMessageDialog(null, "PAR");
		} else {
			JOptionPane.showMessageDialog(null, "IMPAR");
		}
	}

}
