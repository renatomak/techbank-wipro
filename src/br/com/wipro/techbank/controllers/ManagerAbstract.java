package br.com.wipro.techbank.controllers;

import br.com.wipro.techbank.Utils;

import java.util.Scanner;

public class ManagerAbstract implements ManagerInterface {
    @Override
    public void manager(Scanner scan) {
        Byte choice = 0;

        do {
            System.out.println(Utils.subMenu);
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
        System.out.println("Implemente o método update");
    }

    @Override
    public void findById(Scanner scan) {
        System.out.println("Implemente o método findById");
    }

    @Override
    public void findAll() {
        System.out.println("Implemente o método findAll");
    }

    @Override
    public void delete(Scanner scan) {
        System.out.println("Implemente o método delete");
    }

    @Override
    public void save(Scanner scan) {
        System.out.println("Implemente o método save");
    }
}
