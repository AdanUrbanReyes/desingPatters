package simple_factory_pattern.stores;

import simple_factory_pattern.interfaces.Pizza;
import simple_factory_pattern.simple_factories.SimplePizzaFactory;

public class PizzaStore {
	
	protected SimplePizzaFactory simplePizzaFactory;
	
	public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
		this.simplePizzaFactory = simplePizzaFactory;
	}
	
	public Pizza orderPizza(String type) {
		Pizza pizza = simplePizzaFactory.createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	
}
