package br.com.wipro.techbank.services;

import br.com.wipro.techbank.models.CreditCard;
import br.com.wipro.techbank.repositories.CreditCardRepository;

import java.util.List;

public class CreditCardService {

    private static CreditCardService instance = new CreditCardService();

    private CreditCardRepository repository = new CreditCardRepository();

    private CreditCardService() {
        super();
    }

    public static CreditCardService getInstance() {
        return instance;
    }

    public void save(CreditCard creditCard) {
        CreditCard result = repository.save(creditCard);

        if (result != null) {
            System.out.println("Cartão de crédito adicionado com sucesso.\n");
        } else {
            System.out.println("Cartão de crédito não foi adicionado.\n");
        }
    }

    public CreditCard findById(Long id) {
        CreditCard creditCard = repository.findById(id);

        if (creditCard == null) {
            System.out.printf("Cartão de crédito com ID %d não foi encontrado. \n", id);
        } else {
            System.out.println(creditCard + "\n\n\n\n");
        }
        return creditCard;
    }

    public void deleteById(Long id) {
        Boolean result = repository.deleteById(id);

        if (result) {
            System.out.printf("Cartão de crédito com ID %d foi removido com sucesso!\n", id);
        } else {
            System.out.printf("Erro ao tentar remover o Cartão de crédito com ID %d.\n", id);
        }
    }

    public void findAll() {
        List<CreditCard> creditCardList = repository.findAll();

        creditCardList.forEach(item -> System.out.println(item));

        System.out.println("\n");
    }

    public CreditCard update(CreditCard creditCard) {
        CreditCard result = repository.update(creditCard);

        if (result == null) {
            System.out.printf("Cartão de crédito com ID %d não existe.\n", creditCard.getId());
            return null;
        }
        return result;
    }
}
