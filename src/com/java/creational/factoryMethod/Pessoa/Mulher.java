package com.java.creational.factoryMethod.Pessoa;

class Mulher extends Pessoa {

	public Mulher(String nome) {
		this.nome = nome;
		System.out.println("Ol� Senhora: " + this.nome);
	}

}