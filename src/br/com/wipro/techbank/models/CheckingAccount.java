package br.com.wipro.techbank.models;

public class CheckingAccount extends Account {

    public CheckingAccount(Double balance, Client client, CreditCard creditCard) {
        super(balance, client, creditCard);
    }

    @Override
    public void withDraw(Double value) {
        if (this.getBalance() <= 0d)
            System.out.println("Saldo insuficiente!");
        else this.withDraw(value);
    }

    @Override
    public void transfer(Double value, Account account) {
        if (this.getBalance() <= 0d)
            System.out.println("Saldo insuficiente!");
        else {
            this.withDraw(value);
            account.deposit(value);
        }
    }

    @Override
    public String toString() {
        return "Conta Corrente \n" + super.toString();
    }
}
