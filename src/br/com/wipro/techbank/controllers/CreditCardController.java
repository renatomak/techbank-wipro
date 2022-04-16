package br.com.wipro.techbank.controllers;

import br.com.wipro.techbank.models.CreditCard;
import br.com.wipro.techbank.services.CreditCardService;

import java.util.Date;
import java.util.Scanner;

public class CreditCardController extends ManagerAbstract {

    private static CreditCardService creditCardService = CreditCardService.getInstance();

    @Override
    public void findAll() {
        creditCardService.findAll();
    }

    @Override
    public void delete(Scanner scanner) {
        System.out.println("Informe o ID do cart�o de cr�dito: ");
        Long id = scanner.nextLong();
        creditCardService.deleteById(id);
    }

    @Override
    public void findById(Scanner scanner) {
        System.out.println("Informe o ID do cart�o de cr�dito: ");
        Long id = scanner.nextLong();
        creditCardService.findById(id);
    }

    @Override
    public void save(Scanner scanner) {
        System.out.println("Limite: ");
        Double limit = scanner.nextDouble();

        String number = generateNumbers(16);

        Date date = new Date();

        Short securityCode = Short.valueOf(generateNumbers(3));

        CreditCard creditCard = new CreditCard(number, date, securityCode, limit);
        creditCardService.save(creditCard);
    }

    public String generateNumbers(int limit) {
        String number = "";
        for (int index = 0; index < limit; index++) {
            int random = (int) (Math.random() * 10);
            if (index % 4 == 0 && index > 0) {
                number += " ";
            }
            number += random;
        }
        return number;
    }
}
