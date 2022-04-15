package br.com.wipro.techbank.models;

import java.time.LocalDate;

public class Operacao {
    private LocalDate data;
    private String descricao;
    private double valor;

    public Operacao() { this.data = LocalDate.now(); }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
