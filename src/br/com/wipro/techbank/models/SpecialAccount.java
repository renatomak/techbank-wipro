package br.com.wipro.techbank.models;

public class SpecialAccount extends Account {

    private Double limit = 0.0;
    private Double usedLimit = 0.0;

    public SpecialAccount(Double balance, Client client, CreditCard creditCard, Double limit) {
        super(balance, client, creditCard);
        this.limit = limit;
    }

    public Double getLimit() {
        return limit;
    }

    public Double getUsedLimit() {
        return usedLimit;
    }

    public void setUsedLimit(Double usedLimit) {
        this.usedLimit = usedLimit;
    }

    @Override
    public void withDraw(Double value) {
        if (value <= this.getBalance()) {
            this.balance -= value;
            System.out.printf("Saldo Atual: R$ %.2f %n", this.getBalance());
            System.out.printf("Saque: R$ %.2f %n %n", value);
        } else if (value <= (this.getBalance() + this.getLimit())) {

            this.usedLimit = this.getBalance() - value;

            this.balance = this.usedLimit;

            double usedLimitToPrint = getUsedLimit() * (-1);

            System.out.printf("Saldo Atual: R$ %.2f %n", this.getBalance());
            System.out.printf("Limite Utilizado: R$ %.2f %n %n", usedLimitToPrint);

        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    @Override
    public void transfer(Double value, Account account) {
        if (value <= (this.getBalance() + this.getLimit())) {
            this.withDraw(value);
            account.deposit(value);
        }
    }

    @Override
    public String toString() {
        Double balanceAvailable = limit - usedLimit;
        return "Conta Especial \n" + super.toString() +
                "\nLimite Cheque especial: " + limit +
                "\nLimite disponivel: " + balanceAvailable;
    }
}
