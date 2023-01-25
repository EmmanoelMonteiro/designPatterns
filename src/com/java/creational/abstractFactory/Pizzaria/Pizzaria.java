package com.java.creational.abstractFactory.Pizzaria;

public class Pizzaria {

	    private Pizza pizza;
	    //private Pizza pizza2;

	    public void criarPizza(String cidade, String tipo){
	    	
	    	System.out.println("Pizza do tipo "+ tipo);
	    	
	        if(tipo.equals("queijo")){
	        	pizza = new PizzaQuatroQueijos(getIngredientes(cidade));
	        	pizza.assar();
	        	pizza.empacotar();
	        	//pizza = new Pizza();
	        }
	        else if(tipo.equals("portuguesa")){
	        	pizza = new PizzaPortuguesa(getIngredientes(cidade));
	        	pizza.assar();
	        	pizza.empacotar();
	        }
	        else if(tipo.equals("calabresa")){

	        	//pizza2 = new Pizza();
	        	//pizza2.prepara();
	        	//pizza2.assar();
	        	//pizza2.empacotar();
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
