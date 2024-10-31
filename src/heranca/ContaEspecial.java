package heranca;

public class ContaEspecial extends ContaBancaria{
	private double limite;

	public ContaEspecial(String cliente, String numeroconta, double saldo, double limite) {
		super(cliente, numeroconta, saldo);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	@Override
	public void Sacar(double valor) {
		if(valor > 0 && (saldo + limite) >= valor) {
			saldo -= valor;
			System.out.println("Saque de R$" + valor + " na conta " + getNumeroconta() + " foi realizado com sucesso.");
		} else {
			System.out.println("O saldo é insuficiente ou valor é inválido.");
		}
	}
}
