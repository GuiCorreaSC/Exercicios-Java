package algoritimos;


import java.util.Locale;

import javax.swing.JOptionPane;

public class atividade18 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int posicao = 0;
		int maiorn = 0;	
		int maiorp = 0;	
		int qtdn = 0;
		
		int numero = 0;
		
		while(qtdn <= 11){
		//for (int i = 0; i < 10; i++); {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
			posicao++;
			qtdn++;
			if (numero > maiorn) {
				maiorn = numero;
				maiorp = posicao;
		}
		}
		//}
		System.out.println("O maior numero digitado foi: " +maiorn +"\nPosiçao: " +maiorp);
		
	}

}
