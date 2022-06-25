
package algoritimos;
import javax.swing.JOptionPane;

public class atividade6 {

	public static void main(String[] args) {
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um numeor inteiro:"));
		
		if (x > 0) {
			JOptionPane.showMessageDialog(null, "Positivo!");
		} else {
			JOptionPane.showMessageDialog(null, "Negativo!");
		}
	}

}
