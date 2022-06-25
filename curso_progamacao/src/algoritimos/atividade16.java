package algoritimos;

import javax.swing.JOptionPane;

public class atividade16 {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		int conta = 0;
		int p1 = n- 1; 
		for (int i = p1; i >= 1; i--) {
			conta = conta+(n * i);
		}
		JOptionPane.showMessageDialog(null, conta);

	}

}
