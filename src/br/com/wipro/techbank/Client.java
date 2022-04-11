package br.com.wipro.techbank;

public class Client {

    private Long id;
    private String name;
    private String cpf;
    private String phoneNumber;
    private String email;

    public Client(Long id, String name, String cpf, String phoneNumber, String email) {
        this.id = id;
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

}
