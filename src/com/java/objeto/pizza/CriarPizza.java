package com.java.objeto.pizza;

public class CriarPizza {
	
	public static void main(String arg[]) {
		Pizza pizza1 = new Pizza();
		pizza1.nome = "Portuguesa";
		pizza1.tamanho = "G";
	
		pizza1.montar();
		pizza1.assar();
		pizza1.empacotar();
		
		System.out.println(" ");
		
		Pizza pizza2 = new Pizza();
		pizza2.nome = "Marguerita";
		pizza2.tamanho = "M";
		
		pizza2.montar();
		pizza2.assar();
		pizza2.empacotar();		

	}
	

}
