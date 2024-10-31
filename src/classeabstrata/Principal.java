package classeabstrata;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(new Carro("ABC-1234", "Toyota", "Corolla", 2020));
        veiculos.add(new Caminhao("XYZ-5678", "Volvo", "FH", 2018));
        veiculos.add(new Onibus("DEF-9101", "Mercedes", "OF-1721", 2015));
        
        System.out.println("---------------------------");
        for (Veiculo veiculo : veiculos) {
            veiculo.exibirdetalhes();
            System.out.println("---------------------------");
        }
	}

}
