package banco;

public class conta {

	private int num_conta;
	private String titular;
	private double saldo;

	public conta(int num_conta, String titular, double initialdeposit) {
		this.num_conta = num_conta;
		this.titular = titular;
		deposito(initialdeposit);
	}

	public conta(int num_conta, String titular) {
		this.num_conta = num_conta;
		this.titular = titular;
	}

	public double setsaque(Double saque) {
		return this.saldo -= saque;

	}

	public int getNum_conta() {
		return num_conta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

		
	public void deposito(double amount) {
			saldo += amount;
	}

	public void whitdraw(double amount) {
		saldo -= amount + 5.00;
	}

	public String toString() {
		return "Account data:\n" + "Account " + num_conta + " Holder: " + titular + ", Balance: $ " + saldo;
	}

}
