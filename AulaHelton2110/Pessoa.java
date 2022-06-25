package AulaHelton2110;


public class Pessoa {
	private String nome;
	private Integer idade;
	
	public Pessoa() {
		super();
	}
	public Pessoa(String nome, Integer idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	@Override
	public String toString() {
		return "Dados da Pessoa Cadastrada [nome=" + nome + ", idade=" + idade + "]";
	}	
}