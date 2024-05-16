package celio.edu.desafios01.operacoes_bancarias;

import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta();

        boolean loop = true;
        while (loop) {
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    double valorDepósito = scanner.nextDouble();
                    conta.depositar(valorDepósito);
                    conta.saldoAtual();
                    break;
                
                case 2:
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                
                case 3:
                    conta.saldoAtual();
                    break;
                
                case 0:
                    loop = false;
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
