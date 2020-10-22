package com.designpattern.core.decorator.pizza;

public class PizzaImpl implements Pizza {

	@Override
	public String getDescription() {
		return "Yor Pizza ";
	}

	@Override
	public int getCost() {
		return 5;
	}

}
