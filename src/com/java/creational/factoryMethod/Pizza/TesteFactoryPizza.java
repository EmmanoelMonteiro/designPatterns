package com.java.creational.factoryMethod.Pizza;

public class TesteFactoryPizza {
	public static void main(String args[]) {
		FactoryPizza factory = new FactoryPizza();
		
		String nome;
		String tamanho;
		
		nome = "Portuguesa";
		tamanho = "M";
		
		factory.getPizza(nome, tamanho);
		
		nome = "Marguerita";
		tamanho = "G";
		
		factory.getPizza(nome, tamanho);
	}
}
