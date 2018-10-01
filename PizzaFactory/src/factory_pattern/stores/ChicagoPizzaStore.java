package factory_pattern.stores;

import factory_pattern.abstract_classes.Pizza;
import factory_pattern.concrete_pizzas.chicago_style.ChicagoStyleCheesePizza;
import factory_pattern.concrete_pizzas.chicago_style.ChicagoStyleClamPizza;
import factory_pattern.concrete_pizzas.chicago_style.ChicagoStylePepperoniPizza;

public class ChicagoPizzaStore extends PizzaStore{

	@Override
	protected Pizza createPizza(String type) {
		if( type.equals("Cheese") ) {
			return new ChicagoStyleCheesePizza();
		}else if( type.equals("Clam") ) {
			return new ChicagoStyleClamPizza();
		}else if( type.equals("Pepperoni") ){
			return new ChicagoStylePepperoniPizza();
		}
		return null;
	}

}
