package br.com.wipro.techbank.controllers;

import br.com.wipro.techbank.Utils;
import br.com.wipro.techbank.models.CheckingAccount;
import br.com.wipro.techbank.models.Client;
import br.com.wipro.techbank.models.CreditCard;
import br.com.wipro.techbank.services.CheckingAccountService;
import br.com.wipro.techbank.services.ClientService;
import br.com.wipro.techbank.services.CreditCardService;

import java.util.Scanner;

public class CheckingAccountController extends ManagerAbstract {

    private static CheckingAccountService checkingAccountService = CheckingAccountService.getInstance();

    private static ClientService clientService = ClientService.getInstance();

    private static CreditCardService creditCardService = CreditCardService.getInstance();

    @Override
    public void findById(Scanner scanner) {
        System.out.println("Informe o número da conta corrente: ");
        Long id = scanner.nextLong();
        checkingAccountService.findById(id);
    }

    @Override
    public void findAll() {
        checkingAccountService.findAll();
    }

    @Override
    public void delete(Scanner scanner) {
        System.out.println("Informe o número da conta corrente: ");
        Long id = scanner.nextLong();
        checkingAccountService.deleteById(id);
    }

    public void save(Scanner scanner) {
        System.out.println("Informe o ID do cliente: ");
        Client client = clientService.findById(scanner.nextLong());

        System.out.println("Informe o ID do cartão de crédito: ");
        CreditCard creditCard = creditCardService.findById(scanner.nextLong());

        System.out.println("Informe o valor do depósito inicial: ");
        Double valueDeposit = scanner.nextDouble();

        CheckingAccount checkingAccount = new CheckingAccount(valueDeposit, client, creditCard);
        checkingAccountService.save(checkingAccount);
    }

    public void withdraw(Scanner scanner){
        System.out.println("Informe o ID da conta: ");
        Long id = scanner.nextLong();
        Utils.clearBuffer(scanner);

        System.out.println("Valor da compra: ");
        Double value = scanner.nextDouble();
        Utils.clearBuffer(scanner);

        checkingAccountService.withdraw(id, value);
    }
}
