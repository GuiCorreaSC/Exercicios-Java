package algoritimos;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class atividade28 {
/*6) Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Depois, mostrar na tela o nome 
da pessoa mais velha.*/
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		
		int qtdr = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de pessoas: "));

		String nomes[] = new String[qtdr];
		int idades[] = new int[qtdr];
		int maioridade = 0;
		String maisvelho = null;

		// CADASTRO
		for (int i = 1; i < qtdr; i++) {
			nomes[i] = JOptionPane.showInputDialog("Digite o nome " + (i));
			idades[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade de " + nomes[i]));
			if (maioridade < idades[i]) {		
				maioridade = idades[i];
				maisvelho = nomes[i];			
			}
		}
		System.out.println("Pessoa mais velha: " +maisvelho);
		
		sc.close();
	}

}

