package br.com.wipro.techbank.services;

import br.com.wipro.techbank.models.Client;
import br.com.wipro.techbank.repositories.ClientRepository;

import java.util.List;

public class ClientService {

    private static ClientService instance = new ClientService();

    private ClientRepository repository = new ClientRepository();

    private ClientService() {
        super();
    }

    public static ClientService getInstance() {
        return instance;
    }

    public void save(Client client) {
        Client result = repository.save(client);

        if (result != null) {
            System.out.println("Cliente adicionado com sucesso.\n");
        } else {
            System.out.println("Cliente nao foi adicionado.\n");
        }
    }

    public Client findById(Long id) {
        Client client = repository.findById(id);

        if (client == null) {
            System.out.printf("Cliente com ID %d nao foi encontrado. \n", id);
        } else {
            System.out.println(client + "\n\n\n\n");
        }

        System.err.println("ID CLiente: " + client.getId());
        return client;
    }

    public void deleteById(Long id) {
        Boolean result = repository.deleteById(id);

        if (result) {
            System.out.printf("Cliente com ID %d foi removido com sucesso!\n", id);
        } else {
            System.out.printf("Erro ao tentar remover o cliente com ID %d.\n", id);
        }

    }

    public void findAll() {
        List<Client> clientList = repository.findAll();

        clientList.forEach(item -> System.out.println("Cliente: " + item.getName() + ", Codigo: " + item.getId() +
                ", CPF: " + item.getCpf() + ", Telefone: " + item.getPhoneNumber() + ", E-mail: " + item.getEmail()));

        System.out.println("\n");
    }

    public Client update(Client client) {
        Client result = repository.update(client);

        if (result == null) {
            System.out.printf("Cliente com ID %d nao existe.\n", client.getId());
            return null;
        }
        return result;
    }
}