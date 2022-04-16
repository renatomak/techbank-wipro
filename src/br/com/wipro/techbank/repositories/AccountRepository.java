package br.com.wipro.techbank.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.wipro.techbank.models.Account;

public class AccountRepository {
    List<Account> accounts = new ArrayList<>();

    public Account save(Account account) {
        accounts.add(account);
        return account;
    }

    public Account findById(Long id) {
        if (id > accounts.size()) {
            return null;
        }
        try {
            return accounts.stream().filter(item -> item.getNumber() == id).collect(Collectors.toList()).get(0);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Tente novamente");
        }
        return accounts.get((int) (id-1));
    }

    public Boolean deleteById(Long id) {
        Account removeAccount = findById(id);
        int index = accounts.indexOf(removeAccount);

        if (index == -1) {
            return false;
        }

        Account account = accounts.remove(index);

        if (account != null) {
            return true;
        }
        return false;
    }

    public List<Account> findAll() {
        return accounts;
    }

    public Account update(Account account) {
        int index = accounts.indexOf(account);

        if (index == -1) {
            return null;
        }

        accounts.remove(index);
        accounts.add(account);

        return account;
    }

    public void withdraw(Long id, Double value) {
        Account account = findById(id);
        if (account != null) {
            account.withDraw(value);
            System.out.printf("Compra no de %.2f realizada!\n", value);
        } else {
            System.out.println("A conta informada não exite!");
        }
    }

    public void printStatement(Long id){
        Account account = findById(id);
        if (account != null) {
            account.printStatement();
        } else {
            System.out.println("A conta informada não exite!");
        }
    }

    public void deposit(Long id, Double value) {
        Account account = findById(id);
        if (account != null) {
            account.deposit(value);
            System.out.printf("Deposito no valor de %.2f realizado!\n", value);
        } else {
            System.out.println("A conta informada não exite!");
        }
    }
}
