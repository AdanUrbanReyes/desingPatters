package factory_pattern.concrete_pizzas.new_york_style;

import factory_pattern.abstract_classes.Pizza;

public class NYStylePepperoniPizza extends Pizza{

	public NYStylePepperoniPizza() {
		super("NY Style Pepperoni Pizza", "Thin Crust Roast Dough", "Valentina Sauce");
		this.toppings.add("Pepperoni Chesse Chili");
	}

	@Override
	public void bake() {
		System.out.println("Bake for 40 minutes at 350");
	}

	@Override
	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

}
