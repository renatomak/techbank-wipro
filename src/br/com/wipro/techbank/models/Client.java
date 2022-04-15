package br.com.wipro.techbank.models;

import java.util.Objects;

public class Client {

    private Long numero;
    private String name;
    private String cpf;
    private String phoneNumber;
    private String email;

    public Client(Long id, String name, String cpf, String phoneNumber, String email) {
        this.numero = id;
        this.name = name;
        this.cpf = cpf;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Client(String name, String cpf, String phoneNumber, String email) {
        this.name = name;
        this.cpf = cpf;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Long getId() {
        return numero;
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
        this.numero = id;
    }

    @Override
    public String toString() {
        return "Cliente:  " + name +
                "\nCodigo: " + numero +
                "\nCPF: " + cpf +
                "\nTelefone: " + phoneNumber +
                "\nE-mail: " + email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(numero, client.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }
}
