package algoritimos;


import java.util.Locale;

import javax.swing.JOptionPane;

public class atividade25 {

	/*1) Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela o maior número 
do vetor (supor não haver empates). Mostrar também a posição do maior elemento*/

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		int maiorp = 0;
		double maior = 0.0;
		int rept = Integer.parseInt(JOptionPane.showInputDialog("quantos numeros?"));
		double[] n = new double[rept];
		for (int i = 0; i < rept; i++) {
			n[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite os " +rept +" numeros:"));

		}
		for (int i = 0; i < rept; i++) {

			if (n[i] > maior) {
				maiorp = i;
				maior = n[i];
			}
		}
		JOptionPane.showMessageDialog(null,maior);
		JOptionPane.showMessageDialog(null,maiorp);

	}

}
