package com.java.creational.builder.Pizza;

public class CriarPizza {

	public static void main(String args[]) {
    	
		Pizza pizza = PizzaBuilder.builder()
				.tamanho("G")
				.sabor("Calabresa")
				.build();
		
		System.out.println(pizza);
		
	}

	
	
}
