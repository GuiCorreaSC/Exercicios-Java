/*Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por 
hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas 
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
