package AulaHelton2110;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		Integer op;
		String nome;
		Integer idade;
		
		String mensagem="Escolha a opção\n"+
						"-------------\n" +	
						"1- Cadastrar\n" +
						"2- Listar\n" +
						"3- Registrar Primeira Vacina\n"+
						"9- Sair";
		do{
			op=Integer.parseInt(JOptionPane.showInputDialog(mensagem));
			
			switch (op) {
				case 1: {//if (op==1)
					nome=JOptionPane.showInputDialog("Informe o Nome");
					idade=Integer.parseInt(JOptionPane.showInputDialog("Informe a Idade"));
					Pessoa p=new Pessoa (nome, idade);
					pessoas.add(p);
					break;
				}
				case 2:{//if (op==2)
					for(Pessoa p: pessoas) {			
						System.out.println(p.toString());
					}					
					break;
				}
				case 9:{//if (op==9)
					System.out.println("SAINDOOOOOOOOOOOOOOOOOOO");
					break;
				}
			default:
				System.out.println("OPÇÃO INEXISTENTE");			
				break;
			}			
						
		}while(op!=9);	
		
		
		
		
		
		
		//Pessoa p1=new Pessoa("JOAO", 20);
		//Pessoa p2=new Pessoa("MARIA", 25);
		//Pessoa p3=new Pessoa("ANA", 22);
		//Pessoa p4=new Pessoa("CARLOS", 23);
		//pessoas.add(p1);
		//pessoas.add(p2);
		//pessoas.add(p3);
		//pessoas.add(p4);
		
		

	}
}
