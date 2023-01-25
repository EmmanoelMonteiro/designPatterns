package com.java.creational.abstractFactory.Pizzaria;

public class SPPizzaIngredientesFactory extends PizzaIngredientesFactory {
	
	@Override
    public String criarMassa(){
        return "> Massa Grossa";
    }

    @Override
    public String criarQueijo(){
    	 return "> Queijo Minas";
    }

    @Override
    public String criarMolho(){
    	 return "> Molho Marroquino";
    }

    @Override
    public String criarSalsa(){
    	 return "> Salsa Nobre";
    }
    
    @Override
    public String criarOvos(){
    	return "> Ovos de pato";
    }
    
    @Override
    public String criarTomates(){
    	return "> Tomate";
    }
}
