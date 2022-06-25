package guilherme_melo_correa;

import java.util.ArrayList;

import javax.swing.JOptionPane;

/*• Cadastrar Acidentes (com os respectivos veículos e seus condutores)
 * >Cadastrar rodovias: rodovia em que ocorreu o acidente.
 * Quantidade de vítimas fatais
 * >A lista de veículos envolvidos no acidente
 */

public class Acidente {
	  private String rodovia = "";
	  private int vitimasFatais = -1;
	  private ArrayList<Veiculo> veiculosEnvolvidos = new ArrayList<Veiculo>();

	  public void cadastra(String rodovia) {
	    setRodovia(rodovia);
	    setVitimasFatais(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de vitimas fatais")));

	    int quantVeiculos = Integer
	        .parseInt(JOptionPane.showInputDialog(null, "Quantos veículos se envolveram no acidente?"));

	    for (int i = 1; i <= quantVeiculos; i++) {
	      Veiculo veiculo = new Veiculo();
	      veiculo.cadastra(i);
	      veiculosEnvolvidos.add(veiculo);
	    }
	  }

	  public boolean isAlgumCondutorEmbriagado() {
	    for (Veiculo veiculo : veiculosEnvolvidos) {
	      if (veiculo.isCondutorEmbriagado()) {
	        return true;
	      }
	    }

	    return false;
	  }

	  public String getRodovia() {
	    return rodovia;
	  }

	  public void setRodovia(String rodovia) {
	    this.rodovia = rodovia;
	  }

	  public int getVitimasFatais() {
	    return vitimasFatais;
	  }

	  public void setVitimasFatais(int vitimasFatais) {
	    if (vitimasFatais < 0) {
	      JOptionPane.showMessageDialog(null, "Valor inválido");

	      setVitimasFatais(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade vitimas fatais")));

	      return;
	    }

	    this.vitimasFatais = vitimasFatais;
	  }

	  public ArrayList<Veiculo> getVeiculosEnvolvidos() {
	    return veiculosEnvolvidos;
	  }

	  public void setVeiculosEnvolvidos(ArrayList<Veiculo> veiculosEnvolvidos) {
	    this.veiculosEnvolvidos = veiculosEnvolvidos;
	  }

	  @Override
	  public String toString() {
	    return "[rodovia = " + rodovia + ", vitimasFatais = " + vitimasFatais + ", veiculosEnvolvidos = [\n    "
	        + veiculosEnvolvidos + "\n]";
	  }
	}
