package br.com.wipro.techbank.controllers;

import br.com.wipro.techbank.models.CheckingAccount;
import br.com.wipro.techbank.models.Client;
import br.com.wipro.techbank.models.CreditCard;
import br.com.wipro.techbank.services.CheckingAccountService;

import java.util.Scanner;

public class CheckingAccountController extends ManagerAbstract {
    private static CheckingAccountService checkingAccountService = new CheckingAccountService();

    @Override
    public void findById(Scanner scanner) {
        System.out.println("Informe o número da Conta Corrente: ");
        Long id = scanner.nextLong();
        checkingAccountService.findById(id);
    }

    @Override
    public void findAll() {
        checkingAccountService.findAll();
    }

    @Override
    public void delete(Scanner scanner) {
        System.out.println("Informe o número da Conta Corrente: ");
        Long id = scanner.nextLong();
        checkingAccountService.deleteById(id);
    }

//    @Override
//    public void save(Scanner scanner, Client client, CreditCard creditCard) {
//        System.out.println("Informe o valor do depósito inicial: ");
//        Double valueDeposit = scanner.nextDouble();
//
//        CheckingAccount checkingAccount = new CheckingAccount(valueDeposit, client, creditCard);
//        checkingAccountService.save(checkingAccount);
//    }
}
