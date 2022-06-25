package algoritimos;

import java.util.Locale;
import java.util.Scanner;

public class atividade30 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tamanho da matriz: linhas e depois as colunas");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] x = new int [m][n];
		
		System.out.println("Digite os dados da matriz: ");
		System.out.println();
		for (int i = 0 ; i <x.length ; i++) {
			for (int j = 0 ; j < x[i].length ; j++) {
				x[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		System.out.println("Digite um numero da matriz");
		
		int y = sc.nextInt();
		
		for (int i = 0 ; i < x.length ; i++) {
			for (int j = 0 ; j < x[i].length ; j++) {
				if (x[i][j] == y) {
					System.out.println("Position " +i+","+j +":");
					if (j > 0) {
						System.out.println("Left: "+x[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " +x[i-1][j]);
					}
					if (j > x[i].length-1 ) {
						System.out.println("Right: " +x[i][j+1]);
					}
					if (i < x.length-1) {
					System.out.println("Down: " +x[i+1][j]);
					}
				}	
			}
		}
		
		
		
		
		sc.close();
	}

}
