package algoritimos;

import javax.swing.JOptionPane;

public class atividade14 {

	public static void main(String[] args) {
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		for (int i = 1; i <= x; i = i + 2) {

			System.out.println(i);
		}

	}

}
