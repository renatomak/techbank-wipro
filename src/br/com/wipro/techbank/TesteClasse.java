package br.com.wipro.techbank;

import br.com.wipro.techbank.models.CheckingAccount;
import br.com.wipro.techbank.models.Client;

public class TesteClasse {
    public static void main(String[] args) {

        Client client = new Client("Junior", "1223163","13454646878","j@j.com");
        CheckingAccount checkingAccount = new CheckingAccount(500d,client,null);
        CheckingAccount checkingAccount2 = new CheckingAccount(300d,client,null);

        checkingAccount.withDraw(100d);
        checkingAccount.deposit(1000d);
        checkingAccount.transfer(300d, checkingAccount2);

        checkingAccount.printStatement();

    }

}
