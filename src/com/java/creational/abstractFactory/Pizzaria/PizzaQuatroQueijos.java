package com.java.creational.abstractFactory.Pizzaria;

public class PizzaQuatroQueijos extends Pizza {

    private PizzaIngredientesFactory ingredientes;
    private String massa;
    private String queijo;
    private String molho;
    private String salsa;

    public PizzaQuatroQueijos( PizzaIngredientesFactory ingredientes){
        this.ingredientes = ingredientes;
        this.prepara();
    }

    public void prepara(){
    	massa = ingredientes.criarMassa();
    	queijo = ingredientes.criarQueijo();
    	molho = ingredientes.criarMolho();
    	salsa = ingredientes.criarSalsa();
    	System.out.println("Descrição ========================");
    	System.out.println(massa+" "+queijo+" "+molho+" "+salsa);
    	System.out.println("==================================");
    }
}
