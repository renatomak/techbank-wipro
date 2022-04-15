package br.com.wipro.techbank.controllers;

import java.util.Scanner;

public interface ManagerInterface {

    void manager(Scanner scan, OriginType type);

    void update(Scanner scan);

    void findById(Scanner scan);

    void findAll();

    void delete(Scanner scan);

    void save(Scanner scan);

}
