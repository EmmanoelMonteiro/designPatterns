package com.java.behavior.strategy.Pizza;

public class PineapplePizza implements Pizza {
	@Override
	public void prepare() {
		System.out.println("Preparing Pineapple Pizza even though it is not a real pizza");
	}
}
