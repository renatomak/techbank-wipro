package br.com.wipro.techbank;

import java.util.Scanner;

public class Utils {

    public static String menu = String.format("================================== GERENCIAMENTO DE CONTAS ======================================" +
            "\n0 - SAIR" +
            "\n1 - Clientes" +
            "\n2 - Cartão de Credito" +
            "\n3 - Contas" );

    public static String subMenu = String.format("0 - Voltar ao menu anterior" +
            "\n1 - Adicionar" +
            "\n2 - Excluir" +
            "\n3 - Mostrar todos" +
            "\n4 - Mostrar por ID" +
            "\n5 - Atualizar");

    public static String subMenuAccounts = String.format("0 - Voltar ao menu anterior" +
            "\n1 - Conta Corrente" +
            "\n2 - Conta Especial");

    public static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}
