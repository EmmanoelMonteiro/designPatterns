package com.java.creational.factoryMethod.Pessoa;

class Homem extends Pessoa {

	public Homem(String nome) {
		this.nome = nome;
		System.out.println("Ol� Senhor: " + this.nome);
	}
}