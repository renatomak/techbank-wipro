package br.com.wipro.techbank;

import br.com.wipro.techbank.model.Client;
import br.com.wipro.techbank.service.ClientService;


import java.util.Locale;
import java.util.Scanner;

public class ManageAccounts {
    static ClientService clinetService = new ClientService();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        Byte choice = 0;

        do {
            System.out.println(Utils.menu);
            choice = scan.nextByte();
            clearBuffer(scan);

            if(choice == 1 ) {
                manageClients(scan);
            } else if(choice == 2) {
                manageSpecialAccount(scan);
            } else {
                System.out.println("ENTROU NO ELSE");
            }

        } while (choice != 0);


        scan.close();
    }
    private static void manageClients(Scanner scan) {
        Byte choiceClient = 0;

        do {
            System.out.println(Utils.subMenu);
            choiceClient = scan.nextByte();
            clearBuffer(scan);
            switch (choiceClient) {
                // Adicionar
                case 1:
                    saveClient(scan);
                    break;

                // Excluir
                case 2:
                    deleteClient(scan);
                    break;

                // Mostrar todos
                case 3:
                    findAllClients();
                    break;

                // Mostrar por ID
                case 4:
                    findByIdClient(scan);
                    break;

                // Atualizar
                case 5:
                    updateClient(scan);
                    break;
                default:
                    System.out.println("Opção inválida! Você vai retornar ao menu anterior.");
                    choiceClient = 0;
            }
        } while (choiceClient != 0);
    }

    private static void manageCheckingAccount(Scanner scan) {
        Byte choiceCheckingAccount = 0;

        do {
            System.out.println(Utils.subMenu);
            choiceCheckingAccount = scan.nextByte();
            clearBuffer(scan);
            switch (choiceCheckingAccount) {
                // Adicionar
                case 1:
                    saveCheckingAccount(scan);
                    break;

                // Excluir
                case 2:
                    deleteCheckingAccount(scan);
                    break;

                // Mostrar todos
                case 3:
                    findAllCheckingAccount();
                    break;

                // Mostrar por ID
                case 4:
                    findByIdCheckingAccount(scan);
                    break;

                // Atualizar
                case 5:
                    updateCheckingAccount(scan);
                    break;
                default:
            }
        } while (choiceCheckingAccount != 0);
    }

    private static void manageSpecialAccount(Scanner scan) {
        System.out.println(Utils.subMenuAccounts);
        Byte choiceAccount = scan.nextByte();
        if(choiceAccount == 1){
            manageCheckingAccount(scan);
        } else if (choiceAccount == 2){
            System.out.println("ENTROU NO ELSE IF");
            Byte choiceSpecialAccount = 0;

            do {
                System.out.println(Utils.subMenu);
                choiceSpecialAccount = scan.nextByte();
                clearBuffer(scan);
                switch (choiceSpecialAccount) {
                    // Adicionar
                    case 1:
                        saveSpecialAccount(scan);
                        break;

                    // Excluir
                    case 2:
                        deleteSpecialAccount(scan);
                        break;

                    // Mostrar todos
                    case 3:
                        findAllSpecialAccount();
                        break;

                    // Mostrar por ID
                    case 4:
                        findByIdSpecialAccount(scan);
                        break;

                    // Atualizar
                    case 5:
                        updateSpecialAccount(scan);
                        break;
                    default:
                }
            } while (choiceSpecialAccount != 0);
        }

    }
    private static void updateCheckingAccount(Scanner scan) {
        System.out.println("Falta implementar o método UPDATE em Conta Corrente");
    }

    private static void findByIdCheckingAccount(Scanner scan) {
        System.out.println("Falta implementar o método FINDBYID  em Conta Corrente");
    }

    private static void findAllCheckingAccount() {
        System.out.println("Falta implementar o método FINDALL  em Conta Corrente");
    }

    private static void deleteCheckingAccount(Scanner scan) {
        System.out.println("Falta implementar o método DELETE  em Conta Corrente");
    }

    private static void saveCheckingAccount(Scanner scan) {
        System.out.println("Falta implementar o método SAVE  em Conta Corrente");
    }

    private static void updateSpecialAccount(Scanner scan) {
        System.out.println("Falta implementar o método UPDATE em Conta Especial");
    }

    private static void findByIdSpecialAccount(Scanner scan) {
        System.out.println("Falta implementar o método FINDBYID  em Conta Especial");
    }

    private static void findAllSpecialAccount() {
        System.out.println("Falta implementar o método FINDALL  em Conta Especial");
    }

    private static void deleteSpecialAccount(Scanner scan) {
        System.out.println("Falta implementar o método DELETE em Conta Especial");
    }

    private static void saveSpecialAccount(Scanner scan) {
        System.out.println("Falta implementar o método SAVE em Conta Especial");
    }

    private static void updateClient(Scanner scanner) {
        System.out.println("ID: ");
        Long id = scanner.nextLong();
        clearBuffer(scanner);

        System.out.println("Nome: ");
        String name = scanner.nextLine();

        System.out.println("CPF: ");
        String cpf = scanner.nextLine();

        System.out.println("Telefone: ");
        String phone = scanner.nextLine();

        System.out.println("Email: ");
        String email = scanner.nextLine();

        Client client = new Client(id, name, cpf, phone, email);

        clinetService.update(client);
    }

    private static void findAllClients() {
        clinetService.findAll();
    }

    private static void deleteClient(Scanner scanner) {
        System.out.println("Informe o ID do cliente: ");
        Long id = scanner.nextLong();
        clinetService.deleteById(id);
    }

    private static void findByIdClient(Scanner scanner) {
        System.out.println("Informe o ID do cliente: ");
        Long id = scanner.nextLong();
        clinetService.findById(id);
    }

    private static void saveClient(Scanner scanner) {

//        System.out.println("Nome: ");
//        String name = scanner.nextLine();
//
//        System.out.println("CPF: ");
//        String cpf = scanner.nextLine();
//
//        System.out.println("Telefone: ");
//        String phone = scanner.nextLine();
//
//        System.out.println("Email: ");
//        String email = scanner.nextLine();
//
//        Client client = new Client(name, cpf, phone, email);
        Client client = new Client("Renato Maques", "123456789", "6299999999", "renato@gmail.com");
        clinetService.save(client);
        client = new Client("Monica", "123456123", "629999888", "monica@gmail.com");
        clinetService.save(client);
        client = new Client("Ines", "144456789", "6299977799", "ines@gmail.com");
        clinetService.save(client);
    }


    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}
