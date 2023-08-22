package com.java.behavior.strategy.Pizza;

public class Client {
    public static void main(String[] args) {
    	
        Oven oven = new Oven(new PineapplePizza());
        oven.bake();


    }
}
