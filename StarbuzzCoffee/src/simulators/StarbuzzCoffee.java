package simulators;

import decorator_pattern.abstract_classes.Beverage;
import decorator_pattern.concrete_beverage.DarkRoast;
import decorator_pattern.concrete_beverage.Decaf;
import decorator_pattern.concrete_beverage.Espresso;
import decorator_pattern.concrete_beverage.HouseBlend;
import decorator_pattern.concrete_condiment.Milk;
import decorator_pattern.concrete_condiment.Mocha;
import decorator_pattern.concrete_condiment.Soy;
import decorator_pattern.concrete_condiment.Whip;

/*
 * THE DECORATOR PATTERN
 * 
 * Definition:
 * The decorator pattern attaches additional
 * responsibilities to an object dynamically.
 * Decorators provide a flexible alternative
 * to subclassing for extending functionality.
 * 
 * Design Principles.
 * 
 * Classes should be open for extension,
 * but closed for modification.
 * 
 * 
 * 
 * */

public class StarbuzzCoffee {

	public static void main(String []args) {
		Beverage darkRoast = new DarkRoast();
		darkRoast = new Mocha(darkRoast);
		darkRoast = new Mocha(darkRoast);
		darkRoast = new Whip(darkRoast);
		
		System.out.println("Your order was : " +  darkRoast.getDescription());
		System.out.println("It is : $" + darkRoast.cost());
		
		Beverage decaf = new Decaf();
		System.out.println("Your order was : " +  decaf.getDescription());
		System.out.println("It is : $" + decaf.cost());
		
		Beverage expresso = new Espresso();
		expresso = new Soy(expresso);
		expresso = new Milk(expresso);
		expresso = new Whip(expresso);
		System.out.println("Your order was : " +  expresso.getDescription());
		System.out.println("It is : $" + expresso.cost());
		
		Beverage houseBlend = new HouseBlend();
		houseBlend = new Milk(houseBlend);
		houseBlend = new Mocha(houseBlend);
		houseBlend = new Soy(houseBlend);
		houseBlend = new Whip(houseBlend);
		System.out.println("Your order was : " +  houseBlend.getDescription());
		System.out.println("It is : $" + houseBlend.cost());		
		
		
	}
	
}
