package com.java.behavior.strategy.Pizza;

public class Oven {
    private Pizza pizza;
    
    public Oven(Pizza pizza) {
        this.pizza = pizza;
    }
    
    public void bake() {
        pizza.prepare();
    }
}
