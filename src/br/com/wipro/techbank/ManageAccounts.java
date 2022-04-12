package br.com.wipro.techbank;

import java.util.Locale;
import java.util.Scanner;

public class ManageAccounts {
    static ClientService clinetService = new ClientService();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        Byte choice = 0;

        do {
            System.out.println(Uteis.menu);
            choice = scan.nextByte();
            clearBuffer(scan);

            if(choice == 1 ) {
                System.out.println(Uteis.subMenu);
                choice = scan.nextByte();
                clearBuffer(scan);

                switch (choice) {
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
                        break;

                        // Mostrar por ID
                    case 4:
                        findById(scan);
                        break;

                        // Atualizar
                    case 5:
                        break;
                    default:
                }
            } else if(choice == 2) {
                System.out.println("ENTROU NO ELSE IF");
            } else {
                System.out.println("ENTROU NO ELSE");
            }

        } while (choice != 0);


        scan.close();
    }

    private static void deleteClient(Scanner scanner) {
        System.out.println("Informe o ID do cliente: ");
        Long id = scanner.nextLong();
        clinetService.deleteById(id);
    }

    private static void findById(Scanner scanner) {
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
