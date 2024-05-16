package celio.edu.desafios01.controle_saques;

import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();

        double limiteRestante = limiteDiario;

        boolean loop = true;
        while (loop) {
            double valorSaque = scanner.nextDouble();

            if (valorSaque == 0) {
                loop = false;
                System.out.println("Transacoes encerradas.");
            } else if (valorSaque > limiteRestante) {
                loop = false;
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
            } else {
                limiteRestante -= valorSaque;
                System.out.println("Saque realizado. Limite restante: " + limiteRestante);
            }
        }
        scanner.close();
    }
}