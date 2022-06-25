package AulaCla1709;

import javax.swing.JOptionPane;

public class Exemplo2 {
	

public static void main(String[] args) {
		
		String menu = "1 - Adição\n"
				+ "2 - Subtração\n"
				+ "3 - Multiplicação\n"
				+ "4 - Divisão\n\n"
				+ "5 - Sair";
		
			int op = 0;
			
				
				 op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			double n1=0;
			double n2=0;
			switch (op) {
			case 1: 
				n1 = Double.parseDouble(JOptionPane.showInputDialog("N1"));
				n2 = Double.parseDouble(JOptionPane.showInputDialog("N2"));
				JOptionPane.showMessageDialog(null, (n1+n2));
				break;
			case 2: 
				n1 = Double.parseDouble(JOptionPane.showInputDialog("N1"));
				n2 = Double.parseDouble(JOptionPane.showInputDialog("N2"));
				JOptionPane.showMessageDialog(null, (n1 - n2));
				break;
			case 3: 
				n1 = Double.parseDouble(JOptionPane.showInputDialog("N1"));
				n2 = Double.parseDouble(JOptionPane.showInputDialog("N2"));
				JOptionPane.showMessageDialog(null, (n1 * n2));
				break;
			case 4: 
				n1 = Double.parseDouble(JOptionPane.showInputDialog("N1"));
				n2 = Double.parseDouble(JOptionPane.showInputDialog("N2"));
				JOptionPane.showMessageDialog(null, (n1 / n2));
				break;
			case 5: 
				JOptionPane.showMessageDialog(null, "Voce escolheu sair!");	
				break;
			default:
				JOptionPane.showMessageDialog(null, "Operação Inválida");	
				}
			}
	}
