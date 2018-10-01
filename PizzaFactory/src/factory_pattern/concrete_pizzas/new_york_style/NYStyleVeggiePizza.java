package factory_pattern.concrete_pizzas.new_york_style;

import factory_pattern.abstract_classes.Pizza;

public class NYStyleVeggiePizza extends Pizza{

	public NYStyleVeggiePizza() {
		super("NY Style Veggie Pizza", "Medium Dough", "Buffalo Sauce");
		this.toppings.add("Veggie");
	}

	@Override
	public void bake() {
		System.out.println("Bake for 35 minutes at 350");
	}

	@Override
	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");		
	}
	
}
