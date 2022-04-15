package br.com.wipro.techbank.repositories;

import br.com.wipro.techbank.models.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ClientRepository {
    private static List<Client> clients = new ArrayList<>();

    private static Long length = 0L;

    public Client save(Client client) {
        this.length++;
        client.setId(length);
        clients.add(client);

        if (clients.size() != length) {
            return null;
        }

        return client;
    }

    public Client findById(Long id) {
        if (id > clients.size()) {
            return null;
        }
        return clients.stream().filter(item -> item.getId() == id).collect(Collectors.toList()).get(0);
    }

    public Boolean deleteById(Long id) {
        Client removeClient = findById(id);
        int index = clients.indexOf(removeClient);

        if (index == -1) {
            return false;
        }

        Client client = clients.remove(index);

        if (client != null) {
            return true;
        }
        return false;
    }

    public List<Client> findAll() {
        return clients;
    }

    public Client update(Client client) {
        System.out.println("CLIENTE: " + client);
        int index = clients.indexOf(client);
        System.out.println("INDEX: " + index);
        if (index == -1) {
            return null;
        }

        clients.remove(index);
        clients.add(client);

        return client;
    }
}
