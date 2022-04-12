package br.com.wipro.techbank;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ClientService {

    protected List<Client> clients = new ArrayList<>();

    public void save(Client client) {
        client.setId((long) clients.size()+1);
        clients.add(client);
    }

    public Client findById(Long id) {
        Client client = clients.stream().filter(item -> item.getId() == id).collect(Collectors.toList()).get(0);
        System.out.println(client);
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
    }

    public void update(Client client) {
        int index = clients.indexOf(client);

        if(index == -1) {
            System.out.printf("Cliente com ID %d não existe.\n", index);
        } else {
            clients.remove(index);
            clients.add(client);
        }
    }
}
