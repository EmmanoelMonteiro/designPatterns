package com.java.creational.abstractFactory.Pizzaria;

public class PizzaQuatroQueijos extends Pizza {

    private PizzaIngredientesFactory ingredientes;
    private String massa;
    private String queijo;
    private String molho;
    private String salsa;
    private String tomate;

    public PizzaQuatroQueijos( PizzaIngredientesFactory ingredientes){
        this.ingredientes = ingredientes;
        this.prepara();
    }

    
    @Override
    public void prepara(){
    	massa = ingredientes.criarMassa();
    	queijo = ingredientes.criarQueijo();
    	molho = ingredientes.criarMolho();
    	salsa = ingredientes.criarSalsa();
    	tomate = ingredientes.criarTomates();
    	
    	System.out.println("Descri��o ========================");
    	System.out.println(massa+" "+queijo+" "+molho+" "+salsa+" "+tomate);
    	System.out.println("==================================");
    }
}
