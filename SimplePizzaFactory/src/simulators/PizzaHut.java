package simulators;

import simple_factory_pattern.simple_factories.SimplePizzaFactory;
import simple_factory_pattern.stores.PizzaStore;

public class PizzaHut {

	public static void main(String []args) {
		PizzaStore pizzaHut = new PizzaStore(new SimplePizzaFactory());
		pizzaHut.orderPizza("CheesePizza");
		pizzaHut.orderPizza("PepperoniPizza");
	}
	
}
