package AulaCla2409;

import javax.swing.JOptionPane;

public class Ex01Vetor {

public static void main(String[] args) {
		
		String nomes[] = new String[5];
		int idades[] = new int[5];
		
		//CADASTRO
		for(int i=0; i<5; i++) {
			nomes[i] = JOptionPane.showInputDialog("Digite o nome "+(i+1));
			idades[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade de "+nomes[i]));
		}
		
		//INICIALIZAÇÃO DE VARIÁVEIS DE CONTROLE
		//VERIFICA O NOME DA PESSOA MAIS VELHA
		String nmMaisVelha = "";
		int idadeMaisVelha = -1;
		
		for(int i=0; i<5; i++) {
			if(idades[i] > idadeMaisVelha) {
				idadeMaisVelha = idades[i];
				nmMaisVelha = nomes[i];
			}
		}
		
		JOptionPane.showMessageDialog(null, "Pessoa mais velha:" + nmMaisVelha);
		
		//BUSCA POR UM NOME NO CADASTRO
		String nmBusca = JOptionPane.showInputDialog("Qual nome deseja buscar?");
		boolean achou = false;
		for(int i=0; i<5; i++) {
			if(nomes[i].equals(nmBusca)) {
				achou = true;
			}
		}
		
		if(achou ==true) {
			JOptionPane.showMessageDialog(null, nmBusca+" está cadastrado(a)");
		}else {
			JOptionPane.showMessageDialog(null, nmBusca+" não encontrado(a)");
		}
		
	}
}