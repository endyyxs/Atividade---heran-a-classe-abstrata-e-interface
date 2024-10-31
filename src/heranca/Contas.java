package heranca;

import java.util.*;
import java.util.Scanner;

public class Contas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<ContaBancaria> contas = new ArrayList<>(); 
		
		ContaPoupanca contapoupanca = new ContaPoupanca("Alice", "AB4567", 1000, 300);
		ContaEspecial contaespecial = new ContaEspecial("Pedro", "C89405", 2500, 200);
		
		contas.add(contapoupanca);
        contas.add(contaespecial);
		
		int opcao;
		do {
			System.out.println("------------------------------");
			System.out.println("          B A N C O           ");
			System.out.println("------------------------------");
			System.out.println("\n");
			System.out.println("1. Mostrar daos da conta");
			System.out.println("2. Sacar");
			System.out.println("3. Depositar");
			System.out.println("4. Calcular novo saldo da Conta Poupança");
			System.out.println("5. Encerrar");
			System.out.println("\n");
			System.out.println("Escolha uma opção: ");
			opcao = sc.nextInt();
			
			switch(opcao) {
				case 1:
					for (ContaBancaria conta : contas) {
                        System.out.println(conta);
                    }
                    break;
				case 2:
					System.out.print("Número da conta: ");
                    String numerocontasaque = sc.next();
                    System.out.print("Valor do saque: ");
                    double valorsaque = sc.nextDouble();
                    for (ContaBancaria conta : contas) {
                        if (conta.getNumeroconta().equals(numerocontasaque)) {
                            conta.Sacar(valorsaque);
                            break;
                        }
                    }
                    break;
				case 3:
					System.out.print("Número da conta: ");
                    String numerocontadeposito = sc.next();
                    System.out.print("Valor do depósito: ");
                    double valordeposito = sc.nextDouble();
                    for (ContaBancaria conta : contas) {
                        if (conta.getNumeroconta().equals(numerocontadeposito)) {
                            conta.Depositar(valordeposito);
                            break;
                        }
                    }
                    break;
				case 4:
					System.out.print("Taxa de rendimento: ");
                    double taxarendimento = sc.nextDouble();
                    for (ContaBancaria conta : contas) {
                        if (conta instanceof ContaPoupanca) {
                            ((ContaPoupanca) conta).calcularNovoSaldo(taxarendimento);
                        }
                    }
                    break;
				case 5:	
					System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
			}
			
		} while(opcao != 5);
		
		
		sc.close();
	}

}
