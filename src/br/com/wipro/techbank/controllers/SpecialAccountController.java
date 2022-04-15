package br.com.wipro.techbank.controllers;

import java.util.Scanner;

import br.com.wipro.techbank.models.Client;
import br.com.wipro.techbank.models.CreditCard;
import br.com.wipro.techbank.models.SpecialAccount;
import br.com.wipro.techbank.services.ClientService;
import br.com.wipro.techbank.services.CreditCardService;
import br.com.wipro.techbank.services.SpecialAccountService;

public class SpecialAccountController extends ManagerAbstract {

    private static SpecialAccountService specialAccounService = new SpecialAccountService();
//    private static ClientService clientService = new ClientService();
    
    private static ClientService clientService = ClientService.getInstance();
    
    private static CreditCardService creditCardService = new CreditCardService();

    @Override
    public void findById(Scanner scanner) {

        System.out.println("Informe o ID do cliente: ");
        Long id = scanner.nextLong();
        specialAccounService.findById(id);
    }

    @Override
    public void findAll() {
        specialAccounService.findAll();
    }

    @Override
    public void delete(Scanner scan) {
        System.out.println("Informe o ID do cliente: ");
        Long id = scan.nextLong();
        specialAccounService.deleteById(id);
    }

    public void save(Scanner scanner) {

        System.out.println("Informe o numero do cliente: ");
        Client client = clientService.findById(scanner.nextLong());

        System.out.println("Informe o valor do depo1sito inicial: ");
        Double valueDeposit = scanner.nextDouble();

        System.out.println("Informe o numero do Cartao de Credit: ");
        CreditCard creditCard = creditCardService.findById(scanner.nextLong());

        System.out.println("Informe o valor do limite para conta: ");
        Double limit = scanner.nextDouble();

        SpecialAccount specialAccount = new SpecialAccount(valueDeposit, client, creditCard,limit);
        specialAccounService.save(specialAccount);
    }
}
