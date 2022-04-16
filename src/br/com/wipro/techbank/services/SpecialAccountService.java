package br.com.wipro.techbank.services;

import java.util.List;

import br.com.wipro.techbank.models.Account;
import br.com.wipro.techbank.repositories.AccountRepository;

public class SpecialAccountService {

	private static SpecialAccountService instance = new SpecialAccountService();

	private AccountRepository repository = new AccountRepository();

	private SpecialAccountService() {
		super();
	}

	public static SpecialAccountService getInstance() {
		return instance;
	}

	public void save(Account account) {
		Account result = repository.save(account);
        if(result != null) {
            System.out.println("Conta especial adicionada com sucesso.\n");
        } else {
            System.out.println("Conta especial n�o foi adicionado.\n");
        }
    }

	public Account findById(Long id) {
		Account account = repository.findById(id);

        if (account == null){
            System.out.printf("Conta com ID %d n�o foi encontrado. \n", id);
        } else {
            System.out.println(account + "\n");
        }
        return account;
    }


	public void deleteById(Long id) {
		Boolean result = repository.deleteById(id);

        if(result) {
            System.out.printf("Conta com ID %d foi removido com sucesso!\n", id);
        } else {
            System.out.printf("Erro ao tentar remover a conta com ID %d.\n", id);
        }
	}

	public void findAll() {
		List<Account> accountList = repository.findAll();
		accountList.forEach(item -> System.out.println(item));
		System.out.println("\n");
	}

	public void withdraw(Long id, Double value){
		repository.withdraw(id, value);
	}

	public void printStatement(Long id) {
		repository.printStatement(id);
	}

	public void deposit(Long id, Double value) {
		repository.deposit(id, value);
	}
}
