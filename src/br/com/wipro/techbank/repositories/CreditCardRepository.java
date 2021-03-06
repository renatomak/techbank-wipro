package br.com.wipro.techbank.repositories;

import br.com.wipro.techbank.models.CreditCard;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CreditCardRepository {
    List<CreditCard> list = new ArrayList<>();

    private static Long length = 0L;

    public CreditCard save(CreditCard creditCard) {
        this.length += 1;
        creditCard.setId(length);

        list.add(creditCard);

        if (list.size() != length) {
            return null;
        }

        return creditCard;
    }

    public CreditCard findById(Long id) {
        if (id > list.size()) {
            return null;
        }
        return list.stream().filter(item -> item.getId() == id).collect(Collectors.toList()).get(0);
    }

    public Boolean deleteById(Long id) {
        CreditCard removeCreditCard = findById(id);
        int index = list.indexOf(removeCreditCard);

        if (index == -1) {
            return false;
        }

        CreditCard creditCard = list.remove(index);

        if (creditCard != null) {
            return true;
        }
        return false;
    }

    public List<CreditCard> findAll() {
        return list;
    }

    public CreditCard update(CreditCard creditCard) {
        int index = list.indexOf(creditCard);

        if (index == -1) {
            return null;
        }

        list.remove(index);
        list.add(creditCard);

        return creditCard;
    }
}
