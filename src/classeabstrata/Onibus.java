package classeabstrata;

public class Onibus extends Veiculo {

	public Onibus(String placa, String marca, String modelo, int anofabricacao) {
		super(placa, marca, modelo, anofabricacao);
	}

	@Override
	public double calcularIPVA() {
		double valorestimado = 50000 - ((2024 - anofabricacao) * 2000);
		return valorestimado * 0.02;
	}

	@Override
	public void exibirdetalhes() {
		System.out.println("Ônibus: \nPlaca: " + getPlaca() + "\nMarca: " + getMarca() +
                "\nModelo: " + getModelo() + "\nAno: " + getAnofabricacao() +
                "\nIPVA: R$" + calcularIPVA());
	}

}
