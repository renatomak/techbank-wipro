package br.com.wipro.techbank.models;

import java.util.Date;

public class CreditCard {

    private String cardNumber;
    private Date expirationDate;
    private Short securityCode;
    private Double limit;
    private Double usedLimit;

    public CreditCard(String cardNumber, Date expirationDate, Short securityCode, Double limit, Double usedLimit) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.securityCode = securityCode;
        this.limit = limit;
        this.usedLimit = usedLimit;
    }

    public void toBuy(Double value) {
        this.usedLimit += value;
    }


}
