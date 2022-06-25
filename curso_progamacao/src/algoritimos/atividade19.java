package algoritimos;

import javax.swing.JOptionPane;

public class atividade19 {

	public static void main(String[] args) {
		int n = 0;
		do {
			n = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero que deseja ver a sequencia: "));
			
			for (int i= 1; i <= n ;i++) {
				System.out.printf(i +" ");
			}
		}while (n != 0);
		

	}

}
