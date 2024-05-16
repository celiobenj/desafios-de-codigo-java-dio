package celio.edu.desafios01.operacoes_bancarias_v2;

import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;

        boolean loop = true;
        while (loop) {
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    double valorDepósito = scanner.nextDouble();
                    saldo += valorDepósito;
                    System.out.println("Saldo atual: " + saldo);
                    break;

                case 2:
                    double valorSaque = scanner.nextDouble();
                    if (valorSaque <= saldo) {
                        saldo -= valorSaque;
                        System.out.println("Saldo atual: " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;

                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;

                case 0:
                    loop = false;
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
