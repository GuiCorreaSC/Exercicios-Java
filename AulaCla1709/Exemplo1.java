package AulaCla1709;

import javax.swing.JOptionPane;

public class Exemplo1 {

//	EXEMPLO COM FOR
//	public static void main(String[] args) {
//		int qt = Integer.parseInt(JOptionPane.showInputDialog("Qt de números?"));
//		int soma = 0;
//		for(int i=0; i<qt; i++) {
//			soma = soma + Integer.parseInt(JOptionPane.showInputDialog("Valor int"));
//		}
//		JOptionPane.showMessageDialog(null, soma);
//	}

//	EXEMPLO COM ENQUANTO
	public static void main(String[] args) {
		char continua = 'S';
		int soma = 0;
		while(continua == 'S') {
			soma = soma + Integer.parseInt(JOptionPane.showInputDialog("Valor int"));
			continua = JOptionPane.showInputDialog("Mais número?(S/N)").toUpperCase().charAt(0);
		}
		JOptionPane.showMessageDialog(null, soma);
	}
}