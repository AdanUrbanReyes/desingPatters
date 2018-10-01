package simulators;

import factory_pattern.stores.ChicagoPizzaStore;
import factory_pattern.stores.NYPizzaStore;
import factory_pattern.stores.PizzaStore;

/*
 * The Factory Method Pattern:
 * defines an interface to create 
 * an object, but let subclasses 
 * decide which class to instantiate.
 * Factory Method lets a class defer 
 * instantiation to subclasses.
 * 
 * Dependency Inversion Principle:
 * Depend upon abstractions. Do not
 * depend upon concrete classes.
 * 
 * */

public class PizzaHut {
	
	public static void main(String []args) {
		PizzaStore nyStore = new NYPizzaStore();
		nyStore.orderPizza("Cheese");
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		chicagoStore.orderPizza("Cheese");
	}
	
}
