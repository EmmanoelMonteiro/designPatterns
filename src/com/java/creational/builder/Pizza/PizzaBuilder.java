package com.java.creational.builder.Pizza;

public class PizzaBuilder {
	
	private Pizza pizza;
	
	public PizzaBuilder() {
		pizza = new Pizza();
	}
	
	public static PizzaBuilder builder() {
		return new PizzaBuilder();
	}
	
	public PizzaBuilder tamanho(String tamanho) {
		this.pizza.settamanho(tamanho);
		return this;
	}

	public PizzaBuilder sabor(String sabor) {
		this.pizza.setsabor(sabor);
		return this;
	}
	
	public Pizza build() {
		return this.pizza;
		
	}
	

}
