package br.com.wipro.techbank.service;

import br.com.wipro.techbank.model.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ClientService {

    protected List<Client> clients = new ArrayList<>();

    public void save(Client client) {
        Long index = clients.size() + 1L;
        client.setId(index);
        clients.add(client);

        if(index == clients.size()) {
            System.out.println("Cliente adicionado com sucesso.\n");
        } else {
            System.out.println("Cliente não foi adicionado.\n");
        }
    }

    public Client findById(Long id) {
        if (id >= clients.size()){
            System.out.printf("Cliente com ID %d não foi encontrado. \n", id);
            return null;
        }

        Client client = clients.stream().filter(item -> item.getId() == id).collect(Collectors.toList()).get(0);

        System.out.println(client + "\n\n\n\n");

        return client;
    }

    public void deleteById(Long id) {
        Client removeClient = findById(id);
        int index = clients.indexOf(removeClient);

        Client client = clients.remove(index);

        if(client != null) {
            System.out.printf("Cliente com ID %d foi removido com sucesso!\n", id);
        } else {
            System.out.printf("Erro ao tentar remover o cliente com ID %d.\n", id);
        }

    }

    public void findAll() {
        clients.forEach(item -> System.out.println(item));
        System.out.println("\n");
    }

    public Client update(Client client) {
        int index = clients.indexOf(client);

        if(index == -1) {
            System.out.printf("Cliente com ID %d não existe.\n", index);
            return  null;
        }

        clients.remove(index);
        clients.add(client);

        return  client;
    }
}
