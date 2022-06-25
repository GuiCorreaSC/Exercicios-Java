package curso_POO;

import java.util.Locale;
import java.util.Scanner;


public class exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		aluno x = new aluno();
		x.nome = sc.next();
		x.s1 = sc.nextDouble();
		x.s2 = sc.nextDouble();
		x.s3 = sc.nextDouble();
		
		if (x.soma() >= 60.00) {
			System.out.println("FINAL GRADE = " +x.soma() +"\n" +"PASS");
		} else {
			System.out.println("FINAL GRADE = " +x.soma() +"\n" 
					+"FAILED\n"
					+"MISSING " +(60.00-x.soma()) +" POINTS");
		}
		
		
		sc.close();
	}

}