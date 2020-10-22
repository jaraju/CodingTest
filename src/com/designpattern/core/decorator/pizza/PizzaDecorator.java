package com.designpattern.core.decorator.pizza;

public abstract class PizzaDecorator extends PizzaImpl {
	
	Pizza pizza;
	
	public PizzaDecorator(Pizza pizza) {
		this.pizza = pizza;
	}
	
	public String getDescription() {
		return pizza.getDescription();
	}

	public int getCost() {
		return pizza.getCost();
	}

}
