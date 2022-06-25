package AulaCla2210;

import javax.swing.JOptionPane;

public class Pessoa {

	private String nome;
	private int idade;
	private Vacina dose1;
	private Vacina dose2;

	public void cadastra() {
		setNome(JOptionPane.showInputDialog("Nome"));
		setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade:")));
	}

	public void aplicaVacina() {
		int dose = Integer.parseInt(JOptionPane.showInputDialog("Qual dose? (1 ou 2)"));
		if (dose == 1) {
			dose1 = new Vacina();
			dose1.cadastra();
		}
		if (dose == 2) {
			dose2 = new Vacina();
			dose2.cadastra();
		}
	}

	public String toString() {
		return "nome=" + nome + ", idade=" + idade + "\ndose1=" + dose1 + "\ndose2=" + dose2;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Vacina getDose1() {
		return dose1;
	}

	public void setDose1(Vacina dose1) {
		this.dose1 = dose1;
	}

	public Vacina getDose2() {
		return dose2;
	}

	public void setDose2(Vacina dose2) {
		this.dose2 = dose2;
	}

}