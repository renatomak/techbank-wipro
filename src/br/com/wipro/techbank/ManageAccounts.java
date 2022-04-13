package br.com.wipro.techbank;

import br.com.wipro.techbank.controllers.CheckingAccountController;
import br.com.wipro.techbank.controllers.ClientController;
import br.com.wipro.techbank.controllers.SpecialAccountController;

import java.util.Locale;
import java.util.Scanner;

public class ManageAccounts {
    private static ClientController clientController = new ClientController();
    private static SpecialAccountController specialAccountController = new SpecialAccountController();
    private static CheckingAccountController checkingAccountController = new CheckingAccountController();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        Byte choice = 0;

        do {
            System.out.println(Utils.menu);
            choice = scan.nextByte();
            Utils.clearBuffer(scan);

            if(choice == 1 ) {
                clientController.manager(scan);
            } else if(choice == 2) {
                System.out.println(Utils.subMenuAccounts);
                Byte choiceAccount = scan.nextByte();

                if(choiceAccount == 1){
                    checkingAccountController.manager(scan);
                } else if (choiceAccount == 2) {
                    specialAccountController.manager(scan);
                }
            } else {
                System.out.println("Opção inválida! Tente novamente...");
            }

        } while (choice != 0);

        scan.close();
    }
}
