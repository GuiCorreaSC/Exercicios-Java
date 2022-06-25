package algoritimos;


import javax.swing.JOptionPane;

//  1.Álcool 2.Gasolina 3.Diesel 4.Fim).
public class atividade13 {

	public static void main(String[] args) {
		int gas = 0, alc = 0, die = 0;
		int x = Integer.parseInt(JOptionPane.showInputDialog("1.Álcool 2.Gasolina 3.Diesel 4.Fim"+"\nDigite um numero :"));

		while (x != 4)
		{
			x = Integer.parseInt(JOptionPane.showInputDialog("1.Álcool 2.Gasolina 3.Diesel 4.Fim"+"\nDigite um numero :"));
			if (x == 1) {
				alc = alc + 1;
			} else if (x == 2) {
				gas = gas + 1;
			} else if (x == 3) {
				die = die + 1;
			}

		}
		JOptionPane.showMessageDialog(null, "Alcool =" + alc + "\nGasolina =" + gas + "\nDiesel =" + die);
	}

}
