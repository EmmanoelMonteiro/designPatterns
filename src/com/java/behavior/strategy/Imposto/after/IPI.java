package com.java.behavior.strategy.Imposto.after;

public class IPI implements Imposto {
    private double valor;

    public IPI(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcular() {
        return this.valor * 0.20;
    }
}
