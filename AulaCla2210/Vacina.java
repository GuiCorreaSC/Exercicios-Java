package AulaCla2210;

import javax.swing.JOptionPane;

public class Vacina {

	private String marca;
	private String lote;
	private String validade;
	private String dataAplicacao;

	public void cadastra() {
		setMarca(JOptionPane.showInputDialog("Marca"));
		setLote(JOptionPane.showInputDialog("Lote"));
		setValidade(JOptionPane.showInputDialog("Validade"));
		setDataAplicacao(JOptionPane.showInputDialog("Date de aplicação"));
	}

	@Override
	public String toString() {
		return "marca=" + marca + ", lote=" + lote + ", validade=" + validade + ", dataAplicacao=" + dataAplicacao;
	}

	public String getMarca() {
		return marca.toUpperCase();
	}

	public void setMarca(String marca) {
		if (marca.length() < 2) {
			setMarca(JOptionPane.showInputDialog("Digite novamente. No mínimo 2 caracteres para a Marca"));
		} else {
			this.marca = marca;
		}
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}

	public String getDataAplicacao() {
		return dataAplicacao;
	}

	public void setDataAplicacao(String dataAplicacao) {
		this.dataAplicacao = dataAplicacao;
	}

}