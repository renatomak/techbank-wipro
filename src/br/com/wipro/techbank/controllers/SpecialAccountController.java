package br.com.wipro.techbank.controllers;

import java.util.Scanner;

import br.com.wipro.techbank.Utils;
import br.com.wipro.techbank.models.Client;
import br.com.wipro.techbank.models.CreditCard;
import br.com.wipro.techbank.models.SpecialAccount;
import br.com.wipro.techbank.services.ClientService;
import br.com.wipro.techbank.services.CreditCardService;
import br.com.wipro.techbank.services.SpecialAccountService;

public class SpecialAccountController extends ManagerAbstract {

    private static SpecialAccountService specialAccounService = SpecialAccountService.getInstance();

    private static ClientService clientService = ClientService.getInstance();

    private static CreditCardService creditCardService = CreditCardService.getInstance();

    @Override
    public void findById(Scanner scanner) {

        System.out.println("Informe o ID do Conta: ");
        Long id = scanner.nextLong();
        Utils.clearBuffer(scanner);
        specialAccounService.findById(id);
    }

    @Override
    public void findAll() {
        specialAccounService.findAll();
    }

    @Override
    public void delete(Scanner scan) {
        System.out.println("Informe o ID do Conta: ");
        Long id = scan.nextLong();
        specialAccounService.deleteById(id);
    }

    public void save(Scanner scanner) {
        System.out.println("Informe o ID do cliente: ");
        Client client = clientService.findById(scanner.nextLong());
        Utils.clearBuffer(scanner);

        System.out.println("Informe o valor do depósito inicial: ");
        Double valueDeposit = scanner.nextDouble();
        Utils.clearBuffer(scanner);

        System.out.println("Informe o ID do Cartão de crédito: ");
        CreditCard creditCard = creditCardService.findById(scanner.nextLong());

        System.out.println("Informe o valor do limite para a conta: ");
        Double limit = scanner.nextDouble();
        Utils.clearBuffer(scanner);

        SpecialAccount specialAccount = new SpecialAccount(valueDeposit, client, creditCard, limit);
        specialAccounService.save(specialAccount);
    }
    public void withdraw(Scanner scanner){
        System.out.println("Informe o ID da conta: ");
        Long id = scanner.nextLong();
        Utils.clearBuffer(scanner);

        System.out.println("Valor da saque: ");
        Double value = scanner.nextDouble();
        Utils.clearBuffer(scanner);

        specialAccounService.withdraw(id, value);
    }

    public void printStatement(Scanner scanner) {
        System.out.println("Informe o ID da conta: ");
        Long id = scanner.nextLong();
        Utils.clearBuffer(scanner);

        specialAccounService.printStatement(id);

    }

    public void deposit(Scanner scanner) {
        System.out.println("Informe o ID da conta: ");
        Long id = scanner.nextLong();
        Utils.clearBuffer(scanner);

        System.out.println("Valor do depósito: ");
        Double value = scanner.nextDouble();
        Utils.clearBuffer(scanner);

        specialAccounService.deposit(id, value);
    }
}
