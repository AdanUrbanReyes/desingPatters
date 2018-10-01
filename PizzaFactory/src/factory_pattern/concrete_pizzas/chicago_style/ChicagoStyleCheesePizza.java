package factory_pattern.concrete_pizzas.chicago_style;

import factory_pattern.abstract_classes.Pizza;

public class ChicagoStyleCheesePizza extends Pizza{

	public ChicagoStyleCheesePizza() {
		super("Chicago Style Chesse Pizza", "Thin Roast Dough", "Valentina Sauce");
		this.toppings.add("Beans Chesse Choriso");
	}

	@Override
	public void bake() {
		System.out.println("Bake for 27 minutes at 330");
	}

	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");		
	}
}
