package factory_pattern.concrete_pizzas.chicago_style;

import factory_pattern.abstract_classes.Pizza;

public class ChicagoStyleClamPizza extends Pizza{
	
	public ChicagoStyleClamPizza() {
		super("Chicago Style Clam Pizza", "Thick Crust Dough", "Buffalo Sauce");
		this.toppings.add("Clam Chesse Fish");
	}

	@Override
	public void bake() {
		System.out.println("Bake for 32 minutes at 330");
	}

	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");		
	}
}
