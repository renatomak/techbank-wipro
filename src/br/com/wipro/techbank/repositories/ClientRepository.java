package br.com.wipro.techbank.repositories;

import br.com.wipro.techbank.models.Client;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ClientRepository {
    private List<Client> clients = new ArrayList<>();
    private static final String path = "./data-client/clients.csv";

    public ClientRepository() {
        readerDataClient();
    }

    private void writerDataClient(Client client) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            bw.write(client.toString());
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void readerDataClient() {
        try (BufferedReader bw = new BufferedReader(new FileReader(path))){
            String line = bw.readLine();

            while (line != null) {
                String[] attributs = line.split(",");
                Client client = new Client(Long.parseLong(attributs[0]), attributs[1], attributs[2], attributs[3], attributs[4]);
                clients.add(client);
                line = bw.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public Client save(Client client) {
        clients.add(client);
        writerDataClient(client);

        return client;
    }

    public Client findById(Long id) {
        System.out.println("ID: " + id + "length: " + clients.size());
        if (id >= clients.size()) {
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
        int index = clients.indexOf(client);

        if (index == -1) {
            return null;
        }

        clients.remove(index);
        clients.add(client);

        return client;
    }
}
