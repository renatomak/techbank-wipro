package br.com.wipro.techbank.controllers;

import br.com.wipro.techbank.Utils;
import br.com.wipro.techbank.models.Client;
import br.com.wipro.techbank.services.ClientService;

import java.util.Scanner;

public class ClientController extends ManagerAbstract {
    private static ClientService clientService = ClientService.getInstance();

    @Override
    public void update(Scanner scanner) {
        System.out.println("ID: ");
        Long id = scanner.nextLong();
        Utils.clearBuffer(scanner);

        System.out.println("Nome: ");
        String name = scanner.nextLine();

        System.out.println("CPF: ");
        String cpf = scanner.nextLine();

        System.out.println("Telefone: ");
        String phone = scanner.nextLine();

        System.out.println("Email: ");
        String email = scanner.nextLine();

        Client client = new Client(id, name, cpf, phone, email);

        clientService.update(client);
    }

    @Override
    public void findAll() {
        clientService.findAll();
    }

    @Override
    public void delete(Scanner scanner) {
        System.out.println("Informe o ID do cliente: ");
        Long id = scanner.nextLong();
        clientService.deleteById(id);
    }

    @Override
    public void findById(Scanner scanner) {
        System.out.println("Informe o ID do cliente: ");
        Long id = scanner.nextLong();
        clientService.findById(id);
    }

    @Override
    public void save(Scanner scanner) {
        System.out.println("Nome: ");
        String name = scanner.nextLine();

        System.out.println("CPF: ");
        String cpf = scanner.nextLine();

        System.out.println("Telefone: ");
        String phone = scanner.nextLine();

        System.out.println("Email: ");
        String email = scanner.nextLine();

        Client client = new Client(name, cpf, phone, email);
        // Client client = new Client("Renato Maques", "123456789", "6299999999",
        // "renato@gmail.com");
        // clientService.save(client);
        // client = new Client("Monica", "123456123", "629999888", "monica@gmail.com");
        // clientService.save(client);
        // client = new Client("Ines", "144456789", "6299977799", "ines@gmail.com");

        clientService.save(client);
    }
}
