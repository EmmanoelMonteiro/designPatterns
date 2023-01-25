package com.java.creational.factoryMethod.Pizza;

public class TesteFactoryPizza {
	public static void main(String args[]) {
		FactoryPizza factory = new FactoryPizza();
		
		Pizza pizza1 = factory.getPizza("Portuguesa", "M");
		pizza1.assar();
		pizza1.empacotar();
		
		System.out.println(" ");
			
		Pizza pizza2 = factory.getPizza("Marguerita", "G");
		pizza2.assar();
		pizza2.empacotar();
		
		System.out.println(" ");

		Pizza pizza3 = factory.getPizza("Calabresa", "G");
		pizza3.assar();
		pizza3.empacotar();
		
		System.out.println(" ");
	}
}
