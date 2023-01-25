package com.java.objeto.pizza;

public class Pizza {
	public String nome;
	public String tamanho;

	public void montar() {
		System.out.println("Montnado a pizza ...");
		
		switch (tamanho) {
		case "G":
			System.out.println("Pizza Grande com 8 fatias");
			break;
		case "M":
			System.out.println("Pizza M�dia com 4 fatias");
			break;			
		default:
			System.out.println("Pizza de Pequena de 2 fatias");
			break;
		}
	
		switch (nome) {
		case "Portuguesa":
			System.out.println("Pizza "+ nome +" com ovos, azeitona, ervilha, presunto, queijo e cebola");
			break;
		case "Calabresa":
			System.out.println("Pizza "+ nome +" com carne su�na, especiarias e lingui�a toscana");
			break;			
		case "Marguerita":
			System.out.println("Pizza "+ nome +" com tomate, queijo e manjeric�o, inspirado pelas cores da bandeira da It�lia");
			break;
		}
		System.out.println("########################################");
		
	}
	
	public void assar() {
		System.out.println("Assando a pizza ...");
		System.out.println("########################################");
	}

	public void empacotar() {
		System.out.println("Empacotnado a pizza ...");
		System.out.println("########################################");
	}
	
}
