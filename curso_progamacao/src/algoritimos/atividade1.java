package algoritimos;

/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.
 * 
public class atividade1 {

	public static void main(String[] args) {
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
		int r = x + y;
		JOptionPane.showMessageDialog(null, "Soma = "+ r);
	}
}
*/
import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A, B, soma;

		A = sc.nextInt();
		B = sc.nextInt();

		soma = A + B;

		System.out.println("SOMA = " + soma);

		sc.close();
	}
}