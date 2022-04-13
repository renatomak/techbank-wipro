package br.com.wipro.techbank.services;

import br.com.wipro.techbank.models.CheckingAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CheckingAccountService {

    protected List<CheckingAccount> checkingAccounts = new ArrayList<>();

    public void save(CheckingAccount checkingAccount) {
        Long number = checkingAccount.getNumber();
        CheckingAccount existAccount = findById(number);

        if (existAccount != null) {
            System.out.printf("Não foi possivel cadastra a conta com número %d", number);
        } else {
            System.out.println("CheckingAccounte adicionado com sucesso.\n");
            checkingAccounts.add(checkingAccount);
        }
    }

    public CheckingAccount findById(Long number) {
        CheckingAccount checkingAccount = checkingAccounts.stream().filter(item -> item.getNumber() == number).collect(Collectors.toList()).get(0);

        if(checkingAccount == null) {
            System.out.printf("Conta com o número %d não foi encontrada.", number);
            return null;
        }

        System.out.println(checkingAccount + "\n\n\n\n");

        return checkingAccount;
    }

    public void deleteById(Long number) {
        CheckingAccount removeCheckingAccount = findById(number);
        int index = checkingAccounts.indexOf(removeCheckingAccount);

        CheckingAccount checkingAccount = checkingAccounts.remove(index);

        if(checkingAccount != null) {
            System.out.printf("CheckingAccounte com ID %d foi removido com sucesso!\n", number);
        } else {
            System.out.printf("Erro ao tentar remover o checkingAccounte com ID %d.\n", number);
        }

    }

    public void findAll() {
        checkingAccounts.forEach(item -> System.out.println(item));
        System.out.println("\n");
    }

    public CheckingAccount update(CheckingAccount checkingAccount) {
        int index = checkingAccounts.indexOf(checkingAccount);

        if(index == -1) {
            System.out.printf("CheckingAccounte com ID %d não existe.\n", index);
            return  null;
        }

        checkingAccounts.remove(index);
        checkingAccounts.add(checkingAccount);

        return  checkingAccount;
    }
}
