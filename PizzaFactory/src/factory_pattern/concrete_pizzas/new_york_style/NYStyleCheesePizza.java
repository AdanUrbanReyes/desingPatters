package factory_pattern.concrete_pizzas.new_york_style;

import factory_pattern.abstract_classes.Pizza;

public class NYStyleCheesePizza extends Pizza{

	public NYStyleCheesePizza() {
		super("NY Style Sauce and Chesse Pizza", "Thin Crust Dough", "Marina Sauce");
		this.toppings.add("Greated Reggiano Chesse");
	}

	@Override
	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	@Override
	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");		
	}

}
