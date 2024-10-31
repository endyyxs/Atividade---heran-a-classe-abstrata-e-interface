package classeabstrata;

public class Caminhao extends Veiculo {

	public Caminhao(String placa, String marca, String modelo, int anofabricacao) {
		super(placa, marca, modelo, anofabricacao);
	}

	@Override
	public double calcularIPVA() {
		double valorestimado = 80000 - ((2024 - anofabricacao) * 2000);
		return valorestimado * 0.015;
	}

	@Override
	public void exibirdetalhes() {
		System.out.println("Caminhão: \nPlaca: " + getPlaca() + "\nMarca: " + getMarca() +
                "\nModelo: " + getModelo() + "\nAno: " + getAnofabricacao() +
                "\nIPVA: R$" + calcularIPVA() + "\n");
	}

}
