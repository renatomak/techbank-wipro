package br.com.wipro.techbank.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Account implements Serializable {

    private static Long number = 0L;
    protected Double balance;
    private Client client;
    private CreditCard creditCard;

    protected List<Operation> statement = new ArrayList<>();

    public Account(Double balance, Client client, CreditCard creditCard) {
        this.number++;
        this.balance = balance;
        this.client = client;
        this.creditCard = creditCard;
    }

    public Long getNumber() {
        return number;
    }

    public Double getBalance() {
        return balance;
    }

    public Client getClient() {
        return client;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void deposit(Double value) {
        this.balance += value;

        Operation opr = new Operation();
        opr.setDescription("   Deposito  ");
        opr.setValue(value);
        this.statement.add(opr);
    }

    public abstract void withDraw(Double value);

    public abstract void transfer(Double value, Account account);

    public void printStatement() {
        System.out.println("*************************** Extrato da Conta *****************************");
        System.out.println("|        Data       |          Operacao             |        Valor       |");
        System.out.println("**************************************************************************");

        System.out.println("Conta: " + this.getNumber());
        this.statement.forEach(opr -> System.out.println(opr));
        System.out.println("***************************** Fim do Extrato *****************************");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return balance.equals(account.balance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(balance);
    }

    @Override
    public String toString() {
        return "\nNumero: " + number +
                "\nSaldo: " + balance +
                "\n" + client.toString() +
                "\n" + creditCard.toString();
    }
}
