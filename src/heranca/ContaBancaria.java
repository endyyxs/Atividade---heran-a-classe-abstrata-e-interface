package heranca;

public class ContaBancaria {
	protected String cliente;
	protected String numeroconta;
	protected double saldo;
	
	public ContaBancaria(String cliente, String numeroconta, double saldo) {
		this.cliente = cliente;
		this.numeroconta = numeroconta;
		this.saldo = saldo;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getNumeroconta() {
		return numeroconta;
	}

	public void setNumeroconta(String numeroconta) {
		this.numeroconta = numeroconta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void Sacar(double valor) {
		if(valor > 0 && valor <= saldo) {
			saldo -= valor;
			System.out.println("Saque de R$" + valor + " na conta " + numeroconta + " foi realizado com sucesso.");
		} else {
			System.out.println("O saldo é insuficiente ou valor é inválido.");
		}
	}
	
	public void Depositar(double valor) {
		saldo += valor;
		System.out.println("Depósito de R$" + valor + " na conta " + numeroconta + " realizado com sucesso.");
	}
	
	public String toString() {
        return "Cliente: " + cliente + ", Número da Conta: " + numeroconta + ", Saldo: R$" + saldo;
    }
}
