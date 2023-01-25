package com.java.creational.abstractFactory.Pizzaria;

public class PizzaPortuguesa extends Pizza {
    private PizzaIngredientesFactory ingredientes;
    private String massa;
    private String queijo;
    private String molho;
    private String ovos;

    public PizzaPortuguesa( PizzaIngredientesFactory ingredientes){
        this.ingredientes = ingredientes;
        this.prepara();
    }

    
    @Override
    public void prepara(){
    	massa = ingredientes.criarMassa();
    	queijo = ingredientes.criarQueijo();
    	molho = ingredientes.criarMolho();
    	ovos = ingredientes.criarOvos();
    	
    	System.out.println("Descrição ========================");
    	System.out.println(massa+" "+queijo+" "+molho+" "+ovos);
    	System.out.println("==================================");
    }
}
