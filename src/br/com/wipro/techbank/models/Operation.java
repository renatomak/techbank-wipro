package br.com.wipro.techbank.models;

import java.time.LocalDate;
import java.util.Date;

public class Operation {
    private LocalDate date;
    private String description;
    private double value;

    public Operation() { this.date = LocalDate.now(); }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Data: " + date +
                "    |    Operacao: " + description +
                "    |    Valor: " + value + "";

    }
}
