package classeabstrata;

public abstract class Veiculo {
	private String placa;
	private String marca;
	private String modelo;
	protected int anofabricacao;
	
	public Veiculo(String placa, String marca, String modelo, int anofabricacao) {
		super();
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.anofabricacao = anofabricacao;
	}

	public String getPlaca() {
		return placa;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getAnofabricacao() {
		return anofabricacao;
	}

	public abstract double calcularIPVA();
	
	public abstract void exibirdetalhes();
	
	
}
