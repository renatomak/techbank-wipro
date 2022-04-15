package br.com.wipro.techbank.models;

import java.io.Serializable;
import java.util.Objects;

public abstract class Account implements Serializable {

    private static Long number = 0L;
    protected Double balance;
    private Client client;
    private CreditCard creditCard;

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
    }

    public abstract void withDraw(Double value);

    public abstract void transfer(Double value, Account account);

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
