# Descrição
Você está desenvolvendo um programa simples em Java para manter um registro de transações bancárias. Cada transação é armazenada em uma lista.

# Entrada
* O programa solicitará ao usuário que informe o saldo inicial da conta.
* Em seguida, o programa solicitará a quantidade total de transações que o cliente deseja realizar.

    **Entrada de Transações:**
* Para cada transação, o programa solicitará ao usuário:
    * O tipo de transação: Digite 'D' para depósito ou 'S' para saque.
    * O valor da transação.

# Saída
* Utilizando listas (ArrayList ou LinkedList), o programa armazenará cada transação, que incluirá um tipo (Depósito ou Saque) e um valor.
* Ao final das transações, o programa exibirá o saldo final da conta e a lista de transações.
 

# Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.


Entrada	    | Saída
:-------:    | :-----
2500        | 
2           | 
d           | 
100         | 
s           | 
500         | 
<br>        | Saldo: 2100.0 <br> Transacoes: <br> 1. Deposito de 100.0 <br> 2. Saque de 500.0

Entrada	    | Saída
:-------:   | :-----:
900         |
1           |
s           |
100         |
<br>        | Saldo: 800.0 <br> Transacoes: <br> 1. Saque de 100.0

Entrada	    | Saída
:-------:   | :-----:
0           |
0           |
<br>        | Saldo: 0.0 <br> Transacoes: