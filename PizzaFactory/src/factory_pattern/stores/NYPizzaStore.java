package factory_pattern.stores;

import factory_pattern.abstract_classes.Pizza;
import factory_pattern.concrete_pizzas.new_york_style.NYStyleCheesePizza;
import factory_pattern.concrete_pizzas.new_york_style.NYStyleClamPizza;
import factory_pattern.concrete_pizzas.new_york_style.NYStylePepperoniPizza;
import factory_pattern.concrete_pizzas.new_york_style.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore{

	@Override
	protected Pizza createPizza(String type) {
		if( type.equals("Cheese") ) {
			return new NYStyleCheesePizza();
		}else if( type.equals("Clam") ) {
			return new NYStyleClamPizza();
		}else if( type.equals("Pepperoni") ){
			return new NYStylePepperoniPizza();
		}else if( type.equals("Veggie") ) {
			return new NYStyleVeggiePizza();
		}
		return null;
	}

}
