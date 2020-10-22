package com.designpattern.core.decorator.pizza;

public class Test {

	public static void main(String[] args) {
		Pizza pizza = new CheesaPizza(new PizzaImpl());
		System.out.println(pizza.getDescription() + " for $ " + pizza.getCost());
	}

}
