package AulaCla1709;

import javax.swing.JOptionPane;

public class Exemplo {

	public static void main(String[] args) {
		double totalDep = 0;
		double totalRet = 0;
		int n = Integer.parseInt(JOptionPane.showInputDialog("Quantas filas?"));
		for (int i = 0; i < n; i++) {
			int q = Integer.parseInt(JOptionPane.showInputDialog("Quantos clientes?"));
			for (int j = 0; j < q; j++) {
				char oper = JOptionPane.showInputDialog("Qual operação? (D/R)").toUpperCase().charAt(0);
				double vl = Double.parseDouble(JOptionPane.showInputDialog("Qual valor?"));
				if (oper == 'D') {
					totalDep = totalDep + vl;
				} else {
					totalRet = totalRet + vl;
				}
			}
		}
		JOptionPane.showMessageDialog(null, "Total de depósitos:" + totalDep + "\nTotal de retiradas:" + totalRet);
	}
}
