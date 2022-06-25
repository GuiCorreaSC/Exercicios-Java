package AulaCla2210;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class SMSTubarao {

	private static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

	public static void main(String[] args) {
		String menuPrincipal = "1 - Cadastrar Pessoa\n" + "2 - Aplicar Vacina\n" + "3 - Relatórios\n" + "4 - Sair";
		String menuRelatorios = "1 - Pessoas que não se vacinaram\n" + "2 - Pessoas apenas com a primeira dose\n"
				+ "3 - Pessoas com as duas doses\n" + "4 - Pessoas que se vacinaram com uma marca\n" + "5 - voltar";
		int op = 0;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menuPrincipal));
			if (op == 1)
				cadastraPessoa();
			if (op == 2)
				aplicaVacina();
			if (op == 3) {
				int op2 = 0;
				do {
					op2 = Integer.parseInt(JOptionPane.showInputDialog(menuRelatorios));
					if (op2 == 1)
						exibePessoasPorDose(0);
					if (op2 == 2)
						exibePessoasPorDose(1);
					if (op2 == 3)
						exibePessoasPorDose(2);
					if (op2 == 4)
						exibePessoasPorMarca();
				} while (op2 != 5);
			}
		} while (op != 4);
	}

	private static void cadastraPessoa() {
		Pessoa p = new Pessoa();
		p.cadastra();
		pessoas.add(p);
	}

	private static void aplicaVacina() {
		String nome = JOptionPane.showInputDialog("Nome da pessoa que vai aplicar a vacina");
		for (Pessoa p : pessoas) {
			if (p.getNome().equalsIgnoreCase(nome)) {
				p.aplicaVacina();
			}
		}
	}

	/*
	 * OPÇÃO DE MÉTODOS SEPARADOS O objetivo é somente mostrar outra forma mais
	 * didática porém mais verbosa Preferir usar um único método
	 * 
	 * private static void exibePessoasSemVacinas() { String ret = ""; for (Pessoa p
	 * : pessoas) { if(p.getDose1()==null && p.getDose2() == null) ret +=
	 * p.getNome()+"\n"; } JOptionPane.showMessageDialog(null, ret); }
	 * 
	 * private static void exibePessoasComDose1() { String ret = ""; for (Pessoa p :
	 * pessoas) { if(p.getDose1()!=null && p.getDose2() == null) ret +=
	 * p.getNome()+"\n"; } JOptionPane.showMessageDialog(null, ret); }
	 * 
	 * private static void exibePessoasCom2Doses() { String ret = ""; for (Pessoa p
	 * : pessoas) { if(p.getDose1()!=null && p.getDose2() != null) ret +=
	 * p.getNome()+"\n"; } JOptionPane.showMessageDialog(null, ret); }
	 */

	private static void exibePessoasPorDose(int qt) {
		String ret = "";
		for (Pessoa p : pessoas) {

			if (qt == 0) {
				if (p.getDose1() == null && p.getDose2() == null)
					ret += p.getNome() + "\n";
			}

			if (qt == 1) {
				if (p.getDose1() != null && p.getDose2() == null)
					ret += p.getNome() + "\n";
			}

			if (qt == 2) {
				if (p.getDose1() != null && p.getDose2() != null)
					ret += p.getNome() + "\n";
			}

		}

		JOptionPane.showMessageDialog(null, ret);
	}

	private static void exibePessoasPorMarca() {
		String ret = "";
		String marcaBuscar = JOptionPane.showInputDialog("Qual marca?");
		for (Pessoa p : pessoas) {
			if ((p.getDose1() != null && p.getDose1().getMarca().equalsIgnoreCase(marcaBuscar))
					|| (p.getDose2() != null && p.getDose2().getMarca().equalsIgnoreCase(marcaBuscar))) {

				ret += p.getNome() + "\n";
			}
		}
		JOptionPane.showMessageDialog(null, ret);
	}

}