package br.com.wipro.techbank.services;

import br.com.wipro.techbank.models.CreditCard;
import br.com.wipro.techbank.repositories.CreditCardRepository;

import java.util.List;

public class CreditCardService {
    private CreditCardRepository repository = new CreditCardRepository();

    public void save(CreditCard creditCard) {
        CreditCard result = repository.save(creditCard);

        if(result != null) {
            System.out.println("CreditCarde adicionado com sucesso.\n");
        } else {
            System.out.println("CreditCarde não foi adicionado.\n");
        }
    }

    public CreditCard findById(Long id) {
        CreditCard creditCard = repository.findById(id);

        if (creditCard == null){
            System.out.printf("CreditCarde com ID %d não foi encontrado. \n", id);
        } else {
            System.out.println(creditCard + "\n\n\n\n");
        }
        return creditCard;
    }

    public void deleteById(Long id) {
        Boolean result = repository.deleteById(id);

        if(result) {
            System.out.printf("CreditCarde com ID %d foi removido com sucesso!\n", id);
        } else {
            System.out.printf("Erro ao tentar remover o creditCarde com ID %d.\n", id);
        }

    }

    public void findAll() {
        List<CreditCard> creditCardList = repository.findAll();

        creditCardList.forEach(item -> System.out.println(item));

        System.out.println("\n");
    }

    public CreditCard update(CreditCard creditCard) {
        CreditCard result = repository.update(creditCard);

        if(result == null) {
            System.out.printf("CreditCarde com ID %d não existe.\n", creditCard.getId());
            return  null;
        }
        return  result;
    }
}
