package AulaCla2409;

import javax.swing.JOptionPane;

public class Exp02VetorCorrigido {

	public static void main(String[] args) {
		String nomes[] = new String[100];
		String telefones[] = new String[100];
		int qtd = 0;
		String menu = "1 - Cadastrar\n" + "2 - Buscar por nome\n" + "3 - Buscar por telefone\n" + "4 - Listar todos\n\n"
				+ "5 - Sair";

		int op = 0;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			if (op == 1) {
				nomes[qtd] = JOptionPane.showInputDialog("Digite o nome");
				telefones[qtd] = JOptionPane.showInputDialog("Digite o telefone");
				qtd++;
			}
			if (op == 2) {
				String busca = JOptionPane.showInputDialog("Qual nome deseja localizar?");
				boolean achou = false;
				int pos = -1;
				for (int i = 0; i < qtd; i++) {
					if (busca.equals(nomes[i])) {
						achou = true;
						pos = i;
					}
				}
				if (achou == true) {
					JOptionPane.showMessageDialog(null, nomes[pos] + "- " + telefones[pos]);
				} else {
					JOptionPane.showMessageDialog(null, "Contato não cadastrado");

				}
			}

			if (op == 3) {
				String busca = JOptionPane.showInputDialog("Qual telefone deseja localizar?");
				boolean achou = false;
				int pos = -1;
				for (int i = 0; i < qtd; i++) {
					if (busca.equals(telefones[i])) {
						achou = true;
						pos = i;
					}
				}
				if (achou == true) {
					JOptionPane.showMessageDialog(null, nomes[pos] + "- " + telefones[pos]);
				} else {
					JOptionPane.showMessageDialog(null, "Contato não cadastrado");

				}
			}

			if (op == 4) {
				String reg = "****Registros cadastrados*****\n\n";
				for (int i = 0; i < qtd; i++) {
					reg += nomes[i] + " - " + telefones[i] + "\n";
				}
				JOptionPane.showMessageDialog(null, reg);
			}
		} while (op != 5);

	}
}