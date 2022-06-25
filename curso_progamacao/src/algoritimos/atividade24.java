package algoritimos;


import java.util.Locale;

import javax.swing.JOptionPane;

public class atividade24 {

	/*
	 * Fazer um programa para ler um número N, depois nome (apenas uma palavra sem
	 * espaços), idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
	 * tela a altura média das pessoas, e mostrar também a porcentagem de pessoas
	 * com menos de 16 anos
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		int qtdr = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de pessoas: "));

		String nomes[] = new String[qtdr];
		int idades[] = new int[qtdr];
		double alturas[] = new double[qtdr];
		double altmedia = 0.0;
		double menor = 0.0;
		// CADASTRO
		for (int i = 0; i < qtdr; i++) {
			nomes[i] = JOptionPane.showInputDialog("Digite o nome " + (i + 1));
			idades[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade de " + nomes[i]));
			alturas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura de " + nomes[i]));
			altmedia = altmedia + alturas[i];
			if (idades[i] < 16) {
				menor++;
			}
		}
		altmedia = altmedia / qtdr;
		menor = menor / qtdr * 100;
		JOptionPane.showMessageDialog(null, "Altura média: " + altmedia);
		JOptionPane.showMessageDialog(null, "Pessoas com menos de 16 anos: " + menor + "%");

	}
}