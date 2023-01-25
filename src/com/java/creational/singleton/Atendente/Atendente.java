package com.java.creational.singleton.Atendente;

public class Atendente {
	
	private static Atendente instence = new Atendente();
	
	private Atendente() {}
	
	static Atendente getInstance() {return instence;}
	
	public static void main (String args[]) {
		Atendente garcon1 = Atendente.getInstance();
		System.out.println(garcon1);
		Atendente garcon2 = Atendente.getInstance();
		System.out.println(garcon2);
		Atendente garcon3 = Atendente.getInstance();
		System.out.println(garcon3);
	}

}
