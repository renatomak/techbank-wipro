# Projeto techBANK

Nosso grupo é composto por:
* Antônio Carlos Andrade (Junior)
* Ederson Rafael Nonnemacher
* Renato Marques da Silva

O projeto Java proposto pela Wipro e Gama Academy consiste em criar um sistema bancário,
que nomeamos de techBANK, onde este conforme escopo deve possuir uma classe gerencia conta, a classe conta,
sendo essa abstrata, portanto não podendo ser instanciada, classes conta corrente e conta especial,
que herdam as funções e atributos da classe conta, sendo que a classe conta especial possui a mais a
propriedade de limite, onde o cliente pode efetuar um saque e/ou transferência se
utilizando deste limite, o que não ocorre na classe conta corrente, onde o cliente somente
pode efetuar saques e/ou transferências com o valor que consta em saldo na conta, optamos também
por criar uma classe cliente, pois em conversa definimos que cada conta bancária necessita de um cliente.
Além disso, deve possuir um cartão de crédito associado a alguma das contas.
A classe gerencia conta, é a nossa classe main, responsável por gerenciar as operações do menu, direcionando
as funções para determinadas classes conforme escolha do usuário.

Abaixo uma descrição das funções de cada classe:

* Funções cliente: Adicionar/excluir/mostrar todos/mostrar por ID/atualizar dados
* Funções cartão de crédito: Adicionar/excluir/mostrar todos/mostrar por ID
* Funções conta corrente: Adicionar/excluir/mostrar todos/mostrar por ID/efetuar depósito/efetuar saque
* Funções conta especial: Adicionar e definir limite/excluir/mostrar todos/mostrar por ID/efetuar depósito/efetuar saque

Inserimos também a função de extrato de operações, onde a cada operação realizada como saque, depósito, transferência,
é registrada no extrato, podendo o usuário consultar este extrato a qualquer momento, verificando na impressão
a data da operação, o tipo da operação, e o valor da mesma.


#### Abaixo diagrama UML e use case do projeto.

![DIAGRAMA UML](../../../../../Desktop/Wipro Bootcamp/Projeto/Classe UML.jpeg)

![USE CASE](../../../../../Desktop/Wipro Bootcamp/Projeto/Diagrama de caso de uso.jpeg)