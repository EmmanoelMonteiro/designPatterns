package com.java.creational.abstractFactory.Pizzaria;

public abstract class Pizza {
    
    public void prepara(){
    	System.out.println("Preparando Pizza...");
		System.out.println("==================================");
    }
	
	public void assar() {
		System.out.println("Assando Pizza...");
		System.out.println("==================================");
	}
	
	public void empacotar() {
		System.out.println("Empacotando Pizza...");
		System.out.println("==================================");
	}

}
