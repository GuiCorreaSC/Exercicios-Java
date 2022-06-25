
package algoritimos;
import javax.swing.JOptionPane;

public class atividade9 {

	public static void main(String[] args) {

		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora inicial: "));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora final: "));
		int r = 0;
		if (y > x) {
			r = y - x;
		}
		else {
			r = 24 - x + y;
		}
		JOptionPane.showInternalMessageDialog(null, "O Jogo durou: " +r +" horas!");
	}

}
