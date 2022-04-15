package br.com.wipro.techbank;

import br.com.wipro.techbank.controllers.*;

import java.util.Locale;
import java.util.Scanner;

import static br.com.wipro.techbank.controllers.OriginType.*;

public class ManageAccounts {
    private static ClientController clientController = new ClientController();
    private static SpecialAccountController specialAccountController = new SpecialAccountController();
    private static CheckingAccountController checkingAccountController = new CheckingAccountController();
    private static CreditCardController creditCardController = new CreditCardController();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        Byte choice = 0;

        do {
            System.out.println(Utils.menu);
            choice = scan.nextByte();
            Utils.clearBuffer(scan);

            if (choice == 1) {
                clientController.manager(scan, CLIENT);
            } else if (choice == 2) {
                creditCardController.manager(scan, CREDIT_CARD);
            } else if (choice == 3) {
                System.out.println(Utils.subMenuAccounts);
                Byte choiceAccount = scan.nextByte();

                if (choiceAccount == 1) {
                    checkingAccountController.manager(scan, CHECKING_ACCOUNT);
                } else if (choiceAccount == 2) {
                    specialAccountController.manager(scan, SPECIAL_ACCOUNT);
                }
            } else {
                System.out.println("Opção inválida! Tente novamente...");
            }

        } while (choice != 0);

        scan.close();
    }
}
