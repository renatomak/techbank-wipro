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
            System.out.println("Conta Especial adicionada com sucesso.\n");
        } else {
            System.out.println("Conta Especial nao foi adicionado.\n");
        }
    }

    public Account findById(Long id) {
        Account account = repository.findById(id);

        if (account == null){
            System.out.printf("Cliente com ID %d nao foi encontrado. \n", id);
        } else {
            System.out.println(account + "\n\n\n\n");
        }
        return account;
    }

    public void deleteById(Long id) {
        Boolean result = repository.deleteById(id);

        if(result) {
            System.out.printf("Cliente com ID %d foi removido com sucesso!\n", id);
        } else {
            System.out.printf("Erro ao tentar remover o cliente com ID %d.\n", id);
        }

    }

    public void findAll() {
        List<Account> accountList = repository.findAll();

        accountList.forEach(item -> System.out.println(item));

        System.out.println("\n");
    }
}
