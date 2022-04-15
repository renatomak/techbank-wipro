package br.com.wipro.techbank.models;

import java.util.Objects;

public class Client {

    private static Long length = 0L;
    private Long id;
    private String name;
    private String cpf;
    private String phoneNumber;
    private String email;

    public Client(String name, String cpf, String phoneNumber, String email) {
        length++;
        this.id = length;
        this.name = name;
        this.cpf = cpf;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getCpf() {
        return cpf;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setId(Long id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Cliente:  " + name +
                "\nCodigo: " + id +
                "\nCPF: " + cpf +
                "\nTelefone: " + phoneNumber +
                "\nE-mail: " + email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(id, client.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}


