package com.java.creational.abstractFactory.Pizzaria;

public class Pizzaria {

	    private Pizza pizza;

	    public void criarPizza(String cidade, String tipo){
	    	System.out.println("Pizza do tipo "+ tipo);
	        if(tipo.equals("queijo")){
	        	pizza = new PizzaQuatroQueijos(getIngredientes(cidade));
	        	//pizza = new Pizza();
	        }
	        else if(tipo.equals("portuguesa")){

	        	//pizza = new PizzaPortuguesa(getIngredientes(cidade));
	        	//pizza = new Pizza();
	        }
	        else if(tipo.equals("calabresa")){

	            //pizza = new PizzaCalabresa(getIngredientes(cidade));
	        	//pizza = new Pizza();
	        }
	        

	    }

		private PizzaIngredientesFactory getIngredientes(String cidade) {
			System.out.println("Cidade de "+ cidade);
			if(cidade.equals("sao-paulo") ){
                return new SPPizzaIngredientesFactory();
            }
			return new RJPizzaIngredientesFactory();
		}
	    
}
