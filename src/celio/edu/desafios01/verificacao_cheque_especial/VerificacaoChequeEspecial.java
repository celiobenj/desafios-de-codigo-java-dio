package celio.edu.desafios01.verificacao_cheque_especial;

import java.util.Scanner;

public class VerificacaoChequeEspecial { 

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 

        double saldo = scanner.nextDouble();
        double saque = scanner.nextDouble();
        double limiteChequeEspecial = 500;

        double diferença = saque - saldo;

        if (diferença <= 0) {
            System.out.println("Transacao realizada com sucesso.");
        } else if (diferença <= limiteChequeEspecial) {
            System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
        } else {
            System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
        }

        scanner.close(); 
    }
}