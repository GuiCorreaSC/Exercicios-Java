package algoritimos;

import javax.swing.JOptionPane;

public class atividade10 {

	public static void main(String[] args) {
		double cod1 = 4.00; // cahcorro quente
		double cod2 = 4.50; // x salada
		double cod3 = 5.00; // x bacon
		double cod4 = 2.00; // torrada
		double cod5 = 1.50; // x salada
		double total = 0;
		int lanche = Integer
				.parseInt(JOptionPane.showInputDialog("Digite o codigo do lanche: \n" + "1 - Cahorro Quente\n"
						+ "2 - X-Salada\n" + "3 - X-Bacon\n" + "4 - Torrada simples\n" + "5 - Refrigerante"));
		int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade: "));
		if (lanche == 1) {
			total = cod1 * qtd;
		} else if (lanche == 2) {
			total = cod2 * qtd;
		} else if (lanche == 3) {
			total = cod3 * qtd;
		} else if (lanche == 4) {
			total = cod4 * qtd;
		} else if (lanche == 5) {
			total = cod5 * qtd;
		} else {
			total = 0;
		}
		JOptionPane.showMessageDialog(null, "Total: R$ " + total);

	}

}
