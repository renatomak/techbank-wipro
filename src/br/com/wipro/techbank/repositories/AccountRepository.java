package br.com.wipro.techbank.repositories;

import br.com.wipro.techbank.models.Account;
import br.com.wipro.techbank.models.CheckingAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AccountRepository {
    List<Account> accounts = new ArrayList<>();

    public void save(Account account) {
        accounts.add(account);
    }

    public Account findById(Long id) {
        return accounts.stream().filter(item -> item.getNumber() == id).collect(Collectors.toList()).get(0);
    }

    public List<Account> findAll() {
        return accounts;
    }

    public void delete(Long id) {

    }

    public Account update(Account account) {
        return account;
    }
}
