package br.com.wipro.techbank;

import java.math.BigDecimal;

public abstract class Account {

    private Long number;
    private BigDecimal balance;
    private Client client;
    private String creditCard;

    public Account(Long number, BigDecimal balance, Client client, String creditCard) {
        this.number = number;
        this.balance = balance;
        this.client = client;
        this.creditCard = creditCard;
    }

    public Long getNumber() {
        return number;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public Client getClient() {
        return client;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void deposit(BigDecimal value){
        this.balance = this.balance.add(value);
    }

    public abstract void withDraw(BigDecimal value);

    public abstract void transfer(BigDecimal value);
}
