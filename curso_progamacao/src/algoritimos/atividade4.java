/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
decimais.*/
package algoritimos;



import java.util.Scanner;

public class atividade4 {

	public static void main(String[] args) {

		double fun, hrs, slr, soma;
		
		Scanner sc = new Scanner(System.in);
		fun = sc.nextDouble();
		hrs = sc.nextDouble();
		slr = sc.nextDouble();
		soma = hrs * slr;
		System.out.println("NUMBER: "+fun);
	    System.out.printf("SALARY = U$ %.2f%n", soma);		sc.close();
	}

}
