package algoritimos;

//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro 
//casas decimais conforme exemplos.
//Fórmula da área: area = π . raio2
//Considere o valor de π = 3.14159
import java.util.Locale;
import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Double circ, soma;
		circ = sc.nextDouble();
		soma = Math.pow(circ, 2.0) * 3.14159;
		System.out.printf("%.4f", soma);
		sc.close();
	}

}
