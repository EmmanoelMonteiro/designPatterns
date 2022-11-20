package com.java.creational.factoryMethod.Pessoa;

public class TesteFactoryPessoa {
	public static void main(String args[]) {
		FactoryPessoa factory = new FactoryPessoa();
		
		String nome;
		String sexo;
		
		nome = "Carlos";
		sexo = "M";
		
		factory.getPessoa(nome, sexo);
		
		nome = "Maria";
		sexo = "F";

		factory.getPessoa(nome, sexo);
	}
}
