package br.com.wipro.techbank.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class CreditCard implements Serializable {
    private static final long serialVersionUID = -102347617765968938L;

    private Long id;
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
        return "CreditCard{" +
                "id=" + id +
                ", cardNumber='" + cardNumber + '\'' +
                ", expirationDate=" + expirationDate +
                ", securityCode=" + securityCode +
                ", limit=" + limit +
                ", usedLimit=" + usedLimit +
                '}';
    }
}
