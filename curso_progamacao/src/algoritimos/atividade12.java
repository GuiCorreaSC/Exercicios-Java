package algoritimos;

import javax.swing.JOptionPane;

public class atividade12 {

	public static void main(String[] args) {
		int senha = 0;
		senha = Integer.parseInt(JOptionPane.showInputDialog("Digite sua senha"));
		while (senha != 2002) {
			senha = Integer.parseInt(JOptionPane.showInputDialog("Senha invalida, tente novamente:"));
		}
		JOptionPane.showMessageDialog(null,"Acesso permitido");
	}

}
