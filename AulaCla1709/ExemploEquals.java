package AulaCla1709;

import javax.swing.JOptionPane;

public class ExemploEquals {

	public static void main(String[] args) {

		String a = JOptionPane.showInputDialog("Informe String a:");
		String b = JOptionPane.showInputDialog("Informe String b:");
		
		if (a.equalsIgnoreCase(b)) {
			System.out.println("Iguais");
		}else {
			System.out.println("Diferentes");
		}

	}

}
