# Registro de Transações Bancárias com Stream API

## Descrição
Você está aprimorando o programa anterior e agora deseja utilizar a Stream API do Java para processar as transações bancárias de forma mais eficiente.

## Entrada
* O programa solicitará ao usuário que informe o saldo inicial da conta.
* Em seguida, o programa solicitará a quantidade total de transações que o cliente deseja realizar.

    **Entrada de Transações:**
* Para cada transação, o programa solicitará ao usuário:
    * O tipo de transação: Digite 'D' para depósito ou 'S' para saque.
    * O valor da transação.

## Saída
* Utilizando a Stream API, o programa armazenará cada transação, que incluirá um tipo (Depósito ou Saque) e um valor.
* Ao final das transações, o programa exibirá o saldo final da conta e a lista de transações.
 

## Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.


Entrada	    | Saída
:-------:   | :-----
100         | 
2           | 
d           | 
10          | 
s           | 
20          | 
<br>        | Saldo: 90.0 <br> Transacoes: <br> d de 10.0 <br> s de 20.0

Entrada	    | Saída
:-------:   | :-----:
5000        |
1           |
d           |
500         |
<br>        | Saldo: 5500.0 <br> Transacoes: <br> d de 500.0
