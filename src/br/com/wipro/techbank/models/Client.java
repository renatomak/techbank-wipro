package br.com.wipro.techbank.models;

import java.io.Serializable;
import java.util.Objects;

public class Client implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String cpf;
    private String phoneNumber;
    private String email;
    public Client(String name, String cpf, String phoneNumber, String email) {
        this.name = name;
        this.cpf = cpf;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public Client(Long id, String name, String cpf, String phoneNumber, String email) {
        this(name, cpf, phoneNumber, email);
        this.id = id;
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
        return "======================= Cliente ==========================="+
                "\nNome: " + name +
                "\nCodigo: " + id +
                "\nCPF: " + cpf +
                "\nTelefone: " + phoneNumber +
                "\nE-mail: " + email +
                "\n===========================================================";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id.equals(client.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}


