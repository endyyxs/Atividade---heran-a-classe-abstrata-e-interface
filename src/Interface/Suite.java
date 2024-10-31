package Interface;

public class Suite implements Acomodacao, ServicoAdicional {
	private static final double diaria = 350.0;
    private static final double cafedamanha = 20.0;
    private static final double limpezaextra = 30.0;
	private int dias;
    private int numeropessoas;

	public Suite(int dias, int numeropessoas) {
		this.dias = dias;
		this.numeropessoas = numeropessoas;
	}

	@Override
	public double calcularservico() {
		return (cafedamanha * numeropessoas * dias) + (limpezaextra * dias);
	}

	@Override
	public double calculardiaria() {
		return diaria * dias;
	}

	@Override
	public void exibirdetalhes(int dias) {
		double custoDiaria = calculardiaria();
        double custoServico = calcularservico();
        double custoTotal = custoDiaria + custoServico;
        System.out.println("Suíte:");
        System.out.println("Diária: R$" + diaria);
        System.out.println("Dias: " + dias);
        System.out.println("Pessoas: " + numeropessoas);
        System.out.println("Custo Total: R$" + custoTotal);
	}

}