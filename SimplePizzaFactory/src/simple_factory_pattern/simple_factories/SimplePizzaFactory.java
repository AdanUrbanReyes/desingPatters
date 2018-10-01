package simple_factory_pattern.simple_factories;

import simple_factory_pattern.concrete_pizzas.CheesePizza;
import simple_factory_pattern.concrete_pizzas.ClamPizza;
import simple_factory_pattern.concrete_pizzas.PepperoniPizza;
import simple_factory_pattern.concrete_pizzas.VeggiePizza;
import simple_factory_pattern.interfaces.Pizza;

public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;
		switch(type) {
			case "CheesePizza":
				pizza = new CheesePizza();
				break;
			case "ClamPizza":
				pizza = new ClamPizza();
				break;
			case "PepperoniPizza":
				pizza = new PepperoniPizza();
				break;
			case "VeggiePizza":
				pizza = new VeggiePizza();
				break;
			
		}
		return pizza;
	}
	
}
