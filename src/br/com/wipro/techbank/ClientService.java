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

    public void findById(Long id) {
        Client client = clients.stream().filter(item -> item.getId() == id).collect(Collectors.toList()).get(0);
        System.out.println(client);
    }
}
