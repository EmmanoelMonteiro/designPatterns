package com.java.creational.abstractFactory.Pizzaria;

public class TestePizzaria {
	public static void main(String args[]) {
		
		//Pizza pizza = new Pizza();
		//pizza.preparar();
		//pizza.assar();
		//pizza.empacotar();
		
		Pizzaria pizzaria = new Pizzaria();
		pizzaria.criarPizza("sao-paulo2", "queijo");

	}
}
