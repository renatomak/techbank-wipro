package br.com.wipro.techbank.models;

public abstract class Account {

    private Long number;
    private Double balance;
    private Client client;
    private String creditCard;

    public Account(Long number, Double balance, Client client, String creditCard) {
        this.number = number;
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

    public String getCreditCard() {
        return creditCard;
    }

    public void deposit(Double value){
        this.balance += value;
    }

    public abstract void withDraw(Double value);

    public abstract void transfer(Double value, Account account);
}
