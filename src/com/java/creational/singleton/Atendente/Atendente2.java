package com.java.creational.singleton.Atendente;

import java.util.ArrayList;
import java.util.List;

public class Atendente2 {

	private static Atendente2 instence = new Atendente2();
	public final static int numeroAtendetes = 2;
	private List<Atendente2> atendentes;
	
	
	public static Atendente2 getInstance() {
		return instence;
	}
	
	private Atendente2() {
		atendentes = new ArrayList<Atendente2>();
		for(int i=0;i<numeroAtendetes;i++) {
			atendentes.add(new Atendente2());
			System.out.println(atendentes);
		}
		
	}

	
	public static void main (String args[]) {
		Atendente2 atendente1 = new Atendente2();
		Object garcon1 = atendente1.getInstance();
		if (garcon1 != null) {
			System.out.println(garcon1);
			System.out.println("Atendente disponivel ...");
		}

	}
	
}
