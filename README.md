# Projeto techBANK

Nosso grupo � composto por:
* Ant�nio Carlos Andrade (Junior)
* Ederson Rafael Nonnemacher
* Renato Marques da Silva

O projeto Java proposto pela Wipro e Gama Academy consiste em criar um sistema banc�rio,
que nomeamos de techBANK, onde este conforme escopo deve possuir uma classe gerencia conta, a classe conta,
sendo essa abstrata, portanto n�o podendo ser instanciada, classes conta corrente e conta especial,
que herdam as fun��es e atributos da classe conta, sendo que a classe conta especial possui a mais a
propriedade de limite, onde o cliente pode efetuar um saque e/ou transfer�ncia se
utilizando deste limite, o que n�o ocorre na classe conta corrente, onde o cliente somente
pode efetuar saques e/ou transfer�ncias com o valor que consta em saldo na conta, optamos tamb�m
por criar uma classe cliente, pois em conversa definimos que cada conta banc�ria necessita de um cliente.
Al�m disso, deve possuir um cart�o de cr�dito associado a alguma das contas.
A classe gerencia conta, � a nossa classe main, respons�vel por gerenciar as opera��es do menu, direcionando
as fun��es para determinadas classes conforme escolha do usu�rio.

Abaixo uma descri��o das fun��es de cada classe:

* Fun��es cliente: Adicionar/excluir/mostrar todos/mostrar por ID/atualizar dados
* Fun��es cart�o de cr�dito: Adicionar/excluir/mostrar todos/mostrar por ID
* Fun��es conta corrente: Adicionar/excluir/mostrar todos/mostrar por ID/efetuar dep�sito/efetuar saque
* Fun��es conta especial: Adicionar e definir limite/excluir/mostrar todos/mostrar por ID/efetuar dep�sito/efetuar saque

Inserimos tamb�m a fun��o de extrato de opera��es, onde a cada opera��o realizada como saque, dep�sito, transfer�ncia,
� registrada no extrato, podendo o usu�rio consultar este extrato a qualquer momento, verificando na impress�o
a data da opera��o, o tipo da opera��o, e o valor da mesma.


#### Abaixo diagrama UML e use case do projeto.

![DIAGRAMA UML](../../../../../Desktop/Wipro Bootcamp/Projeto/Classe UML.jpeg)

![USE CASE](../../../../../Desktop/Wipro Bootcamp/Projeto/Diagrama de caso de uso.jpeg)