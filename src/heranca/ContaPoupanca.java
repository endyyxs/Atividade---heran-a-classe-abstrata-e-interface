package heranca;

public class ContaPoupanca extends ContaBancaria {
	private int diarendimento;

	public ContaPoupanca(String cliente, String numeroconta, double saldo, int diarendimento) {
		super(cliente, numeroconta, saldo);
		this.diarendimento = diarendimento;
	}

	public int getDiarendimento() {
		return diarendimento;
	}

	public void setDiarendimento(int diarendimento) {
		this.diarendimento = diarendimento;
	}
	
	public void calcularNovoSaldo (double taxarendimento) {
		if(taxarendimento > 0) {
			saldo += saldo * (taxarendimento/100);
			System.out.println("Novo saldo após o rendimento: R$" + saldo);
		} else {
			System.out.println("Taxa de rendimento inválida!");
		}
	}
}
