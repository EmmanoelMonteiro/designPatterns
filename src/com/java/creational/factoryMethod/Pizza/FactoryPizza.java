package com.java.creational.factoryMethod.Pizza;

public class FactoryPizza {
	public Pizza getPizza(String nome, String tamanho) {
		Integer fatias;
		
		switch (tamanho) {
			case "P":
				fatias = 2;
				break;
			case "M":
				fatias = 4;			
				break;
			case "G":
				fatias = 8;			
				break;
			default:
				fatias = 0;
				break;
		}
		
		switch (nome) {
			case "Portuguesa":
				return new Portuguesa(fatias);
			case "Marguerita":
				return new Marguerita(fatias);	
			default:
				break;
		}
		
		return null;
	}

}
