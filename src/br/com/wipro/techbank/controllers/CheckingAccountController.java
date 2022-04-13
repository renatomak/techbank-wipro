package br.com.wipro.techbank.controllers;

import br.com.wipro.techbank.services.CheckingAccountService;

import java.util.Scanner;

public class CheckingAccountController extends ManagerAbstract{
    private static CheckingAccountService checkingAccountService = new CheckingAccountService();

    @Override
    public void update(Scanner scan) {
        System.out.println("Falta implementar o método UPDATE em Conta Corrente");
    }

    @Override
    public void findById(Scanner scanner) {
        System.out.println("Informe o Número do Conta Corrente: ");
        Long id = scanner.nextLong();
        checkingAccountService.findById(id);
    }

    @Override
    public void findAll() {
        checkingAccountService.findAll();
    }

    @Override
    public void delete(Scanner scanner) {
        System.out.println("Informe o Número do Conta Corrente: ");
        Long id = scanner.nextLong();
        checkingAccountService.deleteById(id);
    }

    @Override
    public void save(Scanner scan) {
        System.out.println("Falta implementar o método SAVE  em Conta Corrente");
    }
}
