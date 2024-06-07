# Conta Bancária com Construtor em POO

## Descrição
Você está desenvolvendo um programa simples em Java para representar uma conta bancária. Utilizando programação orientada a objetos (POO), você criará uma classe `ContaBancaria` com um construtor que permitirá a inicialização da conta com um saldo inicial.

## Entrada
* O programa solicitará ao usuário que informe o saldo inicial da conta.
* Em seguida, o programa solicitará ao usuário que realize transações de depósito e saque.

## Saída
* A classe `ContaBancaria` conterá métodos para realizar depósitos e saques, atualizando o saldo da conta.
* O saldo atual será exibido após cada transação.
* Se o valor do saque for maior que o saldo disponível na conta, imprima uma mensagem informando: **Saldo insuficiente. Saque não realizado.**

## Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.


Entrada	    | Saída
:-------:   | :-----:
50          | 
50          | Deposito feito. <br> Saldo atual: 100.0
100         | Saque feito. <br> Saldo atual: 0.0


Entrada	    | Saída
:-------:   | :-----:
90          | 
90          | Deposito feito. <br> Saldo atual: 180.0
12          | Saque feito. <br> Saldo atual: 168.0
