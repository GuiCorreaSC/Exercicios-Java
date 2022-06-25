package guilherme_melo_correa;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PainelAcidentes {
	private static ArrayList<Rodovia> rodovias = new ArrayList<Rodovia>();
	private static ArrayList<Acidente> acidentes = new ArrayList<Acidente>();

	public static void main(String[] args) {
		String menu = "1 - Cadastrar rodovia\n" + "2 - Cadastrar acidentes\n"
				+ "3 - Listar acidentes - condutor embriagado\n"
				+ "4 - Listar rodovia com mais acidentes com vítimas fatais\n"
				+ "5 - Listar quantidade de acidentes por rodovia\n" + "6 - Sair";

		int opcao = 0;

		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

			switch (opcao) {
			case 1:
				Rodovia rodovia = new Rodovia();
				rodovia.cadastra();
				rodovias.add(rodovia);
				break;

			case 2:
				if (rodovias.size() == 0) {
					JOptionPane.showMessageDialog(null, "Você precisa cadastrar ao menos uma rodovia!");
				} else {
					int quantAcidentes = Integer
							.parseInt(JOptionPane.showInputDialog(null, "Quantos acidentes deseja cadastrar?"));

					for (int i = 1; i <= quantAcidentes; i++) {
						String nomeRodovias = "";

						for (Rodovia rod : rodovias) {
							nomeRodovias += " - " + rod.getNome();
						}

						Acidente acidente = new Acidente();
						String nomeRodovia = JOptionPane.showInputDialog(null,
								nomeRodovias + "\nDigite o nome da rodovia do acidente " + i);

						for (Rodovia r : rodovias) {
							if (r.getNome().equalsIgnoreCase(nomeRodovia)) {
								acidente.cadastra(nomeRodovia);
							}
						}

						acidentes.add(acidente);
					}
				}
				break;

			case 3:
				exibeAcidentesComCondutorEmbriagado();
				break;

			case 4:
				exibeRodoviaComMaisAcidentesComVitimasFatais();
				break;

			case 5:
				exibeQuantidadeAcidentesPorRodovia();
				break;

			default:
				opcao = 6;
				break;
			}
		} while (opcao != 6);
	}

	public static void exibeAcidentesComCondutorEmbriagado() {
		String acidentesComCondutorEmbriagado = "";

		for (Acidente acidente : acidentes) {
			if (acidente.isAlgumCondutorEmbriagado()) {
				acidentesComCondutorEmbriagado += acidente + "\n\n";

			}
			JOptionPane.showMessageDialog(null,acidentesComCondutorEmbriagado);
		}


	}

	public static void exibeRodoviaComMaisAcidentesComVitimasFatais() {
		// Verificar se existe rodovia e acidentes cadastrados

		String rodoviaMaisAcidentesVF = "";
		int quantAcidentes = 0;

		for (Rodovia rodovia : rodovias) {
			int quantAcidentesVF = 0;

			for (Acidente acidente : acidentes) {
				if (acidente.getRodovia() == rodovia.getNome() && acidente.getVitimasFatais() > 0) {
					quantAcidentesVF++;
				}
			}

			if (quantAcidentesVF > quantAcidentes) {
				rodoviaMaisAcidentesVF = rodovia.getNome();

				quantAcidentes = quantAcidentesVF;
			}
		}

		JOptionPane.showMessageDialog(null, "A rodovia " + rodoviaMaisAcidentesVF
				+ " teve mais acidentes com vítimas fatais, com " + quantAcidentes + " acidentes");
	}

	public static void exibeQuantidadeAcidentesPorRodovia() {
		ArrayList<String> nomeRodovias = new ArrayList<String>();
		ArrayList<Integer> quantAcidentesRodovias = new ArrayList<Integer>();

		for (int i = 0; i < rodovias.size(); i++) {
			String nomeRodovia = rodovias.get(i).getNome();

			for (Acidente acidente : acidentes) {
				if (nomeRodovia == acidente.getRodovia()) {
					if (nomeRodovias.contains(nomeRodovia)) {
						quantAcidentesRodovias.set(i, quantAcidentesRodovias.get(i) + 1);
					} else {
						nomeRodovias.add(nomeRodovia);
						quantAcidentesRodovias.add(1);
					}
				}
			}
		}

		String mensagem = "";

		for (int i = 0; i < nomeRodovias.size(); i++) {
			mensagem += "Rodovia " + nomeRodovias.get(i) + ": " + quantAcidentesRodovias.get(i) + "\n";
		}

		JOptionPane.showMessageDialog(null, mensagem);
	}
}
