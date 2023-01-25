package com.java.behavior.strategy.Pizza;

public class NYStyleCheesePizza implements Pizza {
	@Override
	public void prepare() {
		System.out.println("Preparing NY Style Sauce and Cheese Pizza");
	}
}
