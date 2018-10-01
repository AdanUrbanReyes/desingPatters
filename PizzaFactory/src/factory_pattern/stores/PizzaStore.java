package factory_pattern.stores;

import factory_pattern.abstract_classes.Pizza;

public abstract class PizzaStore {
	
	public Pizza orderPizza(String type) {
		Pizza pizza = this.createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}	

	protected abstract Pizza createPizza(String type);
		
}
