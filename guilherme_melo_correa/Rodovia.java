package guilherme_melo_correa;

import javax.swing.JOptionPane;

public class Rodovia {
	  private String nome = "";
	  private Double kmTotal = 0.0;

	  public void cadastra() {
	    setNome(JOptionPane.showInputDialog(null, "Digite o nome da rodovia"));
	    setKmTotal(Double
	        .parseDouble(JOptionPane.showInputDialog(null, "Digite a distância total da rodovia " + getNome() + " (km)")));
	  }

	  public String getNome() {
	    return nome;
	  }

	  public void setNome(String nome) {
	    if (nome.length() < 3) {
	      JOptionPane.showMessageDialog(null, "O nome deve conter ao menos 3 caracteres!");

	      setNome(JOptionPane.showInputDialog(null, "Digite o nome da rodovia"));

	      return;
	    }

	    this.nome = nome;
	  }

	  public Double getKmTotal() {
	    return kmTotal;
	  }

	  public void setKmTotal(Double kmTotal) {
	    if (kmTotal <= 0) {
	      JOptionPane.showMessageDialog(null, "A quilometragem deve ser maior que 0!");

	      setKmTotal(Double.parseDouble(
	          JOptionPane.showInputDialog(null, "Digite a distância total da rodovia " + getNome() + " (km)")));

	      return;
	    }

	    this.kmTotal = kmTotal;
	  }

	  @Override
	  public String toString() {
	    return "Rodovia [kmTotal=" + kmTotal + ", nome=" + nome + "]";
	  }
	}
