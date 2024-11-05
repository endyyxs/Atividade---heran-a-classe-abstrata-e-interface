package Interface;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de dias: ");
        int dias = sc.nextInt();

        System.out.print("Digite o número de pessoas: ");
        int numPessoas = sc.nextInt();

        System.out.println("---------------------------------");
        System.out.println("   Detalhes das Acomodações   ");
        System.out.println("---------------------------------");
        QuartoSimples quartoSimples = new QuartoSimples(dias, numPessoas);
        quartoSimples.exibirdetalhes(dias);
        System.out.println("\n");

        QuartoDuplo quartoDuplo = new QuartoDuplo(dias, numPessoas);
        quartoDuplo.exibirdetalhes(dias);
        System.out.println("\n");

        Suite suite = new Suite(dias, numPessoas);
        suite.exibirdetalhes(dias);
        
        System.out.println("---------------------------------");

        sc.close();
	}

}
