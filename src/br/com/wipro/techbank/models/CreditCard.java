package br.com.wipro.techbank.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class CreditCard implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String cardNumber;
    private Date expirationDate;
    private Short securityCode;
    private Double limit;
    private Double usedLimit = 0.0;

    public CreditCard(String cardNumber, Date expirationDate, Short securityCode, Double limit) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.securityCode = securityCode;
        this.limit = limit;
        this.usedLimit = usedLimit;
    }

    public void toBuy(Double value) {
        this.usedLimit += value;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditCard that = (CreditCard) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "============================== Cartão de Crédito ================================" +
                "\ncódigo: " + id +
                "\nnúmero do cartão: " + cardNumber +
                "\ndata de expiração: " + expirationDate +
                "\ncódigo de segurança: " + securityCode +
                "\nlimite: " + limit +
                "\nLimite disponível: " + (limit - usedLimit) +
                "\n===============================================================================";
    }
}
