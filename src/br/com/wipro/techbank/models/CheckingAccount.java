package br.com.wipro.techbank.models;

public class CheckingAccount extends Account {

    public CheckingAccount(Double balance, Client client, CreditCard creditCard) {
        super(balance, client, creditCard);
    }

    @Override
    public void withDraw(Double value) {
        if (value <= this.getBalance()) {
            this.balance -= value;
            System.out.printf("Saldo Atual: R$ %.2f %n", this.getBalance());
            System.out.printf("Saque: R$ %.2f %n %n", value);

            Operation opr = new Operation();
            opr.setDescription("    Saque    ");
            opr.setValue(value);
            this.statement.add(opr);

        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    @Override
    public void transfer(Double value, Account account) {
        if (this.getBalance() <= 0d)
            System.out.println("Saldo insuficiente!");
        else {
            this.withDraw(value);
            account.deposit(value);

            Operation opr = new Operation();
            opr.setDescription("Transferencia");
            opr.setValue(value);
            this.statement.add(opr);
        }
    }

    @Override
    public String toString() {
        return "Conta Corrente \n" + super.toString();
    }
}
