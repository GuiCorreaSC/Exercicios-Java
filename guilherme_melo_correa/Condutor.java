package guilherme_melo_correa;

import javax.swing.JOptionPane;

/*Todos os condutores possuem nome, idade e sexo. Também é armazenado se o mesmo estava ou não embriagado.*/
public class Condutor {
	private String nome = "";
	private int idade = -1;
	private char sexo = ' ';
	private boolean embriagado = false;

	public void cadastra() {
		setNome((JOptionPane.showInputDialog(null, "Digite o nome do condutor")));
		setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade do condutor " + getNome())));
		setSexo(JOptionPane.showInputDialog(null, "Digite o sexo do condutor " + getNome() + " (M/F)").toUpperCase()
				.charAt(0));
		setEmbriagado(
				(JOptionPane.showInputDialog(null, "O condutor " + getNome() + " estava embriagado? (1/0)").charAt(0)));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() < 3) {
			JOptionPane.showMessageDialog(null, "O nome deve conter ao menos 3 caracteres!");

			setNome((JOptionPane.showInputDialog(null, "Digite o nome do condutor")));

			return;
		}

		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idade <= 0) {
			JOptionPane.showMessageDialog(null, "A idade deve ser maior que 0!");

			setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade do condutor " + getNome())));

			return;
		}

		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		if (sexo != 'F' && sexo != 'M') {
			JOptionPane.showMessageDialog(null, "O sexo só aceita os valores 'M' ou 'F'!");

			setSexo(JOptionPane.showInputDialog(null, "Digite o sexo do condutor " + getNome() + " (M/F)").toUpperCase()
					.charAt(0));

			return;
		}

		this.sexo = sexo;
	}

	public boolean isEmbriagado() {
		return embriagado;
	}

	public void setEmbriagado(char embriagado) {
		if (embriagado != '1' && embriagado != '0') {
			JOptionPane.showMessageDialog(null,
					"Digite '1' para informar que o condutor estava embriagado, senão digite '0'!");

			setEmbriagado((JOptionPane.showInputDialog(null, "O condutor " + getNome() + " estava embriagado? (1/0)")
					.charAt(0)));

			return;
		}

		if (embriagado == '1') {
			this.embriagado = true;
		}

		this.embriagado = false;
	}

	@Override
	public String toString() {
		return "{ nome = " + nome + ", embriagado = " + embriagado + ", idade =" + idade + ", sexo =" + sexo + " }";
	}
}
