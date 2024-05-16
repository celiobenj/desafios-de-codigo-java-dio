package celio.edu.desafios01.operacoes_bancarias;

public class Conta {
    double saldo;

    void depositar (double valorDepósito){
        saldo += valorDepósito;
    }

    void sacar (double valorSaque){
        if (valorSaque <= saldo) {
            saldo -= valorSaque;
            this.saldoAtual();
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    void saldoAtual(){
        System.out.println("Saldo atual: " + saldo);
    }
}
