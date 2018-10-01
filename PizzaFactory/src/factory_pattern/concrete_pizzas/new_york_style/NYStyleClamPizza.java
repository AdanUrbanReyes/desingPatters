package factory_pattern.concrete_pizzas.new_york_style;

import factory_pattern.abstract_classes.Pizza;

public class NYStyleClamPizza extends Pizza{

	public NYStyleClamPizza() {
		super("NY Style Clam Pizza", "Thick  Roast Dough", "Devil Sauce");
		this.toppings.add("Clam Chili");
	}

	@Override
	public void bake() {
		System.out.println("Bake for 30 minutes at 350");
	}

	@Override
	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

}
