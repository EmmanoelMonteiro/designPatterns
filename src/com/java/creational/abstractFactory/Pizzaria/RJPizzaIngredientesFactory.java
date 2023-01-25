package com.java.creational.abstractFactory.Pizzaria;

class RJPizzaIngredientesFactory extends PizzaIngredientesFactory {
	
	@Override
    public String criarMassa(){
        return "> Massa Fina";
    }

    @Override
    public String criarQueijo(){
    	return "> Queijo Parmesao";
    }

    @Override
    public String criarMolho(){
    	return "> Molho da Roca";
    }

    @Override
    public String criarSalsa(){
    	return "> Salsa Nobre Apimentada";
    }

    @Override
    public String criarOvos(){
    	return "> Ovos de galinha";
    }
    
    @Override
    public String criarTomates(){
    	return "> Tomate";
    }
}
