package com.eloiza.calculadora;


public enum OperationType {
    SUM ("Somar"),
    SUBTRACT ("Subtrair"),
    MULTIPLY ("Multiplicar"),
    DIVIDE ("Dividir"),
    POW ("Elevar a um expoente"),
    ROOT ("Raiz n-ésima"),
    PERCENTUAL ("Percentual"),
    LOG10 ("Log base 10");

    private final String description;

    OperationType(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }

}
