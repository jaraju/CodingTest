package com.designpattern.core.decorator.pizza;

public class CheesaPizza extends PizzaDecorator {

	public CheesaPizza(Pizza pizza) {
		super(pizza);
	}

	public String getDescription() {
		return super.getDescription() + getCheesaPizzaDescription();
	}

	public int getCost() {
		return super.getCost() + getCheesaPizzaCost();
	}

	public String getCheesaPizzaDescription() {
		return "with lots of cheese";
	}

	public int getCheesaPizzaCost() {

		return 5;
	}

}
