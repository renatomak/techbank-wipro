package br.com.wipro.techbank.controllers;

import br.com.wipro.techbank.Utils;

import java.util.Scanner;

import static br.com.wipro.techbank.controllers.OriginType.*;

public class ManagerAbstract implements ManagerInterface {
    @Override
    public void manager(Scanner scan, OriginType type) {
        Byte choice = 0;

        do {
            if (type == CREDIT_CARD) {
                System.out.println(Utils.subMenuCreditCard);
            } else if (type == CHECKING_ACCOUNT || type == SPECIAL_ACCOUNT) {
                System.out.println(Utils.subMenuAccounts);
            }
            else {
                System.out.println(Utils.subMenu);
            }

            choice = scan.nextByte();
            Utils.clearBuffer(scan);
            switch (choice) {
                case 1:
                    save(scan);
                    break;
                case 2:
                    delete(scan);
                    break;
                case 3:
                    findAll();
                    break;
                case 4:
                    findById(scan);
                    break;
                case 5:
                    update(scan);
                    break;
                case 6:
                    withdraw(scan);
                    break;
                case 7:
                    deposit(scan);
                    break;
                case 8:
                    printStatement(scan);
                    break;
                default:
                    if (choice != 0) {
                        System.out.println("Opção inválida! Você vai retornar ao menu anterior.");
                    }
                    choice = 0;
            }
        } while (choice != 0);
    }

    @Override
    public void update(Scanner scan) {
    }

    @Override
    public void findById(Scanner scan) {
    }

    @Override
    public void findAll() {
    }

    @Override
    public void delete(Scanner scan) {
    }

    @Override
    public void save(Scanner scan) {
    }

    public void withdraw(Scanner scan){

    }

    public void printStatement(Scanner scanner) {

    }

    public void deposit(Scanner scanner){

    }
}
