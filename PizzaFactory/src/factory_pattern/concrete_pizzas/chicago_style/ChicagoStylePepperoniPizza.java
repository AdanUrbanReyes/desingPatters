package factory_pattern.concrete_pizzas.chicago_style;

import factory_pattern.abstract_classes.Pizza;

public class ChicagoStylePepperoniPizza extends Pizza{
	
	public ChicagoStylePepperoniPizza() {
		super("Chicago Style Pepperoni Pizza", "Extra Thin Crust Dough", "Plum Tomato Sauce");
		this.toppings.add("Shredded Mozzarella");
	}

	@Override
	public void bake() {
		System.out.println("Bake for 47 minutes at 330");
	}

	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");		
	}
}
