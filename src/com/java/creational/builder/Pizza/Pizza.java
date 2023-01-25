package com.java.creational.builder.Pizza;

public class Pizza {
	
	private String tamanho = "P";
	private String sabor = "Queijo";
	
	protected Pizza(){
		
	}

	public static Pizza Builder() {
		return new Pizza();
	}

	//public Pizza tamanho(String tamanho) {
	//	this.tamanho = tamanho;
	//	return this;
	//}

	//public Pizza sabor(String sabor) {
	//	this.sabor = sabor;
	//	return this;
	//}
	
	
	public void settamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public void setsabor(String sabor) {
		this.sabor = sabor;
	}
	
	@Override
	public String toString() {
		return "Pizza (tamanho: "+this.tamanho+", sabor: "+this.sabor+")";
	}

}