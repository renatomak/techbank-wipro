package br.com.wipro.techbank.controllers;

public enum OriginType {

    CLIENT("CLIENT"),
    CREDIT_CARD("CREDIT_CARD"),
    CHECKING_ACCOUNT("CHECKING_ACCOUNT"),
    SPECIAL_ACCOUNT("SPECIAL_ACCOUNT");

    OriginType(String type) {
    }

}
